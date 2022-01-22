package four3.Files5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Files5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = sc.nextLine();

        if(fileName.equals("song.txt")) {

            System.out.println("Printing song...");

            try {
                Scanner scanner = new Scanner(Paths.get("C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files5\\song.txt"));
                while (scanner.hasNextLine()) {
                    // we read one line
                    String row = scanner.nextLine();
                    // we print the line that we read
                    System.out.println(row);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }








    }

}
