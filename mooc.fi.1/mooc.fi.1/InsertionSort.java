import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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
		int temp = 0;
		int i = 0;
		
		while (i<arr.length-1){
			if (arr[i+1] >= arr[i]) {
				i++;
			}else {
				 temp = arr[i];
				 arr[i] = arr[i+1];
				 arr[i+1] = temp;
				 
				 if(i>0) {
					 i--;
				 }
			}
			
			
			
		}
			
		System.out.println("Sorted Array: " + Arrays.toString(arr));
		
	}

}
