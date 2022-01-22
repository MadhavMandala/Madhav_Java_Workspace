package four3.Files9;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Files9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fileName = sc.nextLine();
        String path = "C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files9\\" + fileName;

        ArrayList<String> names = returnNames(path);
        ArrayList<Integer> ages = returnAges(path);

        for(int i = 0; i < names.size(); i++) {

            if (ages.get(i) == 1) {

                System.out.println(names.get(i) + ", age: " + ages.get(i) + " year");

            } else {

                System.out.println(names.get(i) + " age: " + ages.get(i) + "years");

            }

        }

    }

    public static ArrayList<String> returnNames(String path) {

        ArrayList<String> nameList = new ArrayList<>();

        try {

            Scanner fileReader = new Scanner(Paths.get(path));

            while(fileReader.hasNextLine()) {

                String currentLine = fileReader.nextLine();

                String[] tempArray= currentLine.split(",");

                nameList.add(tempArray[0]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return nameList;

    }

    public static ArrayList<Integer> returnAges(String path) {

        ArrayList<Integer> ageList = new ArrayList<>();

        try {

            Scanner fileReader = new Scanner(Paths.get(path));

            while(fileReader.hasNextLine()) {

                String currentLine = fileReader.nextLine();

                String[] tempArray = currentLine.split(",");

                ageList.add(Integer.valueOf(tempArray[1]));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ageList;

    }

}
