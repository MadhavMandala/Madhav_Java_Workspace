package mooc.fi.three4;

import java.util.Scanner;

public class Strings5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a sentence:");
        String input = sc.nextLine();

        String[] split = input.split(" ");

        for (int i = 0; i < split.length; i++) {

            if(split[i].contains("av")) {

                System.out.println(split[i]);

            }

        }

    }

}
