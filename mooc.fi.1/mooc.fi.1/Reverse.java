import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many integers do you want in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<arr.length; i++) {
			System.out.print("Enter your Value: ");
			n = sc.nextInt();
			arr[i] = n;
		}
		System.out.print("Enter a rotation Value:");
		n = sc.nextInt();
		n = n%arr.length;
		
		reverseArray(arr, 0, arr.length-1);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
		
		
		
		
	}

	
	public static int[] reverseArray(int[] arr, int startPoint, int endPoint) {
		
		int temp = 0;
		
		for(int i = 0; i+startPoint<endPoint-i ; i++) {
			
			temp = arr[startPoint+i];
			arr[startPoint+i] = arr[endPoint-i];
			arr[endPoint-i] = temp;
		}
		
		return arr;
		
	}
	
	
}
