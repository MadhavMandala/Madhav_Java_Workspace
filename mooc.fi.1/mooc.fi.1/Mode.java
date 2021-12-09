import java.util.*;

public class Mode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers do you want in your index?");

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextInt();
		}

		int[] arr2 = new int[n];

		for (int i = 0; i < arr.length; i++) {
			for (int a = 0; a < arr.length; a++) {
				if (arr[i] == arr[a]) {
					arr2[a] = arr2[a] + 1;

				}
			}
		}

		int x = 0;

		for (int f = 0; f < arr2.length; f++) {
			if (arr2[f] >= x) {
				x = arr2[f];
			}
		}

		for (int z = 0; z < arr2.length; z++) {
			if (arr2[z] == x) {
				System.out.println("The mode is " + arr[z] + " with an index value of " + z);
			}
		}

	}

}
