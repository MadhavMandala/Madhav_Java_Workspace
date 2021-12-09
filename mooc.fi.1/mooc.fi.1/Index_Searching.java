import java.util.Scanner;
public class Index_Searching {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want in your index?");
		int n = sc.nextInt(); 
		int[]arr = new int[n];
		
		
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter a number to locate within your index:");
		int b = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (b == arr[i]) {
				System.out.println("Your number was found at index " + i);
				return;
			}
		}
		System.out.println("Your number was not found...");
	}

}