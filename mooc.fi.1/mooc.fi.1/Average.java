import java.util.*;
public class Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to Average?");
		int n = sc.nextInt(); 
		int[]arr = new int[n];
		
		
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for (int a = 0; a<arr.length; a++) {
			sum += arr[a];
		}
		System.out.println("The sum of your numbers is " + sum);
		System.out.println("The average of your numbers is " + (sum/((double)(arr.length))));
	}

}
