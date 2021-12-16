package mooc.fi.three3;

public class Arrays5 {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);

    }

    public static void printArrayInStars(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            printStars(arr[i]);

        }

    }

    public static void printStars(int num) {

        for (int i = 0; i < num; i++) {

            System.out.print("*");

        }

        System.out.println();

    }


}
