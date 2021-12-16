package mooc.fi.three3;

public class Arrays3 {

    public static void main(String[] args) {

        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);

    }

    public static void sumOfNumbersInArray(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        System.out.println(sum);

    }

}
