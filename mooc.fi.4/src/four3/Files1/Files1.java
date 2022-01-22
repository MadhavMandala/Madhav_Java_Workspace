package four3.Files1;

import java.util.Scanner;

public class Files1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cycleCount = -1;

        String input = "";

        while (!input.equals("end")) {

            cycleCount++;

            input = sc.nextLine();

        }

        System.out.println(cycleCount);

    }

}
