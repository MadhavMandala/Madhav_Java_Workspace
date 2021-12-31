package four1.OOPs15;

import java.util.Scanner;

public class OOPs15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Statistics stats = new Statistics();

        int input = 0;

        while (input != -1) {

            stats.addNumber(input);

            input = sc.nextInt();

        }

        stats.getCount();

    }

}
