package four3.Files6;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Files6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = sc.nextLine();
        String pathName = "C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files6\\" + fileName;

        ArrayList<String> names = makeNameList(pathName);

        String input = "";

        while(true) {

            System.out.println("Enter names, empty line quits: ");
            input = sc.nextLine();

            if(input.isEmpty()) {
                break;
            }

            boolean  isNameOnList = false;

            for(String name : names) {

                if(input.equals(name)) {

                    isNameOnList = true;

                }

            }

            if(isNameOnList) {

                System.out.println("This name is on the list");

            } else {

                System.out.println("This name is not on the List");

            }

        } 

        System.out.println("Thank you!");

    }


    public static ArrayList<String> makeNameList(String path) {

        ArrayList<String> names = new ArrayList<>();

        try {
            Scanner textScanner = new Scanner(Paths.get(path));

            while(textScanner.hasNextLine()) {

                names.add(textScanner.nextLine());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;

    }

}
