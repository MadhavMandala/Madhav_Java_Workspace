package four3.Files8;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Files8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("File?");
        String fileName = sc.nextLine();
        String path = "C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files8\\" + fileName;

        ArrayList<Integer> intList = createIntList(path);

        System.out.println("Upper bound?");
        int upperBound = sc.nextInt();

        System.out.println("Lower bound?");
        int lowerBound = sc.nextInt();

        int counter = 0;

        for(int value : intList) {

            if (value <= upperBound && value >= lowerBound) {
                counter++;
            }

        }

        System.out.println("Numbers: " + counter);

    }

    public static ArrayList<Integer> createIntList(String path) {

        ArrayList<Integer> intList = new ArrayList<>();

        try {

            Scanner textScanner = new Scanner(Paths.get(path));

            while(textScanner.hasNextLine()) {

                intList.add(textScanner.nextInt());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return intList;

    }

}
