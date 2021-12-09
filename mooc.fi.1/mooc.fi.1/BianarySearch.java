import java.util.Arrays;
import java.util.Scanner;

public class BianarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many integers do you want in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter a Target");
		int target = sc.nextInt();

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
		System.out.println("Your sorted array is: " + Arrays.toString(arr));
		int midpoint = arr.length / 2;
		int first = 0;
		int last = arr.length - 1;

		for (int a = 0; a < arr.length; a++) {

			midpoint = (first + last) / 2;

			if (target == arr[midpoint]) {
				System.out.println("The target is located at the index " + midpoint);
				return;
			}
			if (target < arr[midpoint]) {
				last = midpoint;
			}
			if (target > arr[midpoint]) {
				first = midpoint;
			}
		}
		
		System.out.println("Target not found...");
		
	}

}
