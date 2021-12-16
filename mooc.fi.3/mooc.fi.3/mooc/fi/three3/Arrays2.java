package mooc.fi.three3;

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {0, 1, 2, 2, 3, 6, 3, 7, 9, 12};


        System.out.println("Search for?");
        int search = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {

            if (search == arr[i]) {

                System.out.println(search + " was found at index " + i);

            }

        }

    }

}
