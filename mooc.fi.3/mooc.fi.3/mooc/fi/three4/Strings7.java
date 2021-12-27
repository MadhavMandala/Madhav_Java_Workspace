package mooc.fi.three4;

import java.util.Scanner;

public class Strings7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Give a string:");
            String input = sc.nextLine();

            if(input.equals("")) {

                break;

            }

            String[] split = input.split(" ");

            System.out.println(split[(split.length-1)]);

        }

    }

}
