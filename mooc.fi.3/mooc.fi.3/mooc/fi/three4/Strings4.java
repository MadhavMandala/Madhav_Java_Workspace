package mooc.fi.three4;

import java.util.Scanner;

public class Strings4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a string");
        String input = sc.nextLine();

        String[] split = input.split(" ");

        for (int i = 0; i < split.length; i++) {

            System.out.println(split[i]);

        }

    }

}
