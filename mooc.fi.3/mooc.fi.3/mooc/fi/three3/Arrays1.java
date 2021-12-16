package mooc.fi.three3;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 3, 5, 7, 9};

        System.out.println("Give two indecies to swap:");

        int first = sc.nextInt();
        int second = sc.nextInt();

        int temp = 0;

        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

    }

}
