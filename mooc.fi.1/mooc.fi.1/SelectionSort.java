import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many integers do you want in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<arr.length; i++) {
			System.out.print("Enter your first Value: ");
			n = sc.nextInt();
			arr[i] = n;
		}
		
		
		int temp = 0;
		int index = 0;
		int smallestNum = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			smallestNum = arr[i];
			index = i;
			
			
			for (int o = i+1; o<arr.length; o++) {
				
				if (arr[o] < smallestNum) {
					smallestNum = arr[o];
					index = o;
				}
				
			}
			
			temp = arr[i];
			arr[i] = smallestNum;
			arr[index] = temp;
			
			
			
		}
		
		
		System.out.print("Sorted Array: " + Arrays.toString(arr));
		
	}

}
