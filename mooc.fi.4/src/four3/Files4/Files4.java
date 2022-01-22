package four3.Files4;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;

public class Files4 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(Paths.get("C:\\Users\\Madhav\\Madhav_Java_Workspace\\mooc.fi.4\\src\\four3\\Files4\\file.txt"));
            while (sc.hasNextLine()) {
                // we read one line
                String row = sc.nextLine();
                // we print the line that we read
                System.out.println(row);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
