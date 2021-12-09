import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many integers do you want in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter your Value: ");
			n = sc.nextInt();
			arr[i] = n;
		}
		int temp = 0;
		int i = 1;
		while (i != 0) {
			i = 0;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					i++;
				}
			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));

	}

}
