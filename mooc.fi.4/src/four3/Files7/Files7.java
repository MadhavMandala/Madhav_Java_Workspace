package four3.Files7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class Files7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name of file:");
        String fileName = sc.nextLine();
        String pathName = "C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files7\\" + fileName;

        System.out.println("Search for?");
        String searchString = sc.nextLine();

        ArrayList<String> lineByLine = lineByLine(pathName);

        for (String value: lineByLine) {

            if (value.contains(searchString)) {

                System.out.println("Found!");

            }

        }


    }

    public static ArrayList<String> lineByLine (String pathName) {

        ArrayList<String> lineByLine = new ArrayList<>();

        try  {

            Scanner textScanner = new Scanner(Paths.get(pathName));

            while(textScanner.hasNextLine()) {

                lineByLine.add(textScanner.nextLine());

            }

        } catch (IOException e) {
            System.out.println("Reading file failed.");
        }


        return lineByLine;

    }

}
