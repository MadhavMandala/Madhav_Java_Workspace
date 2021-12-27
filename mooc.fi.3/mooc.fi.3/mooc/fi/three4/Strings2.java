package mooc.fi.three4;

import java.util.Scanner;

public class Strings2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a string:");
        String input = sc.nextLine();

        if (input.equals("true")) {

            System.out.println("You got it right!");

        } else {

            System.out.println("Try again!");

        }


    }

}
