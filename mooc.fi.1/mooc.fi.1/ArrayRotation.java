import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many integers do you want in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] tempArr = new int[n];
		for (int i = 0; i<arr.length; i++) {
			System.out.print("Enter your first Value: ");
			n = sc.nextInt();
			arr[i] = n;
			tempArr[i] = n;
		}
		System.out.println(" ");
		System.out.print("Enter a Rotation value: ");
		
		n = sc.nextInt();
		
		
		for (int i = 0; i<arr.length; i++) {
			
			if (i + n >= arr.length) {
				arr[(i+n) - arr.length] = tempArr[i];
			}else {
				arr[i+n] = tempArr[i];
			}
			
		}
		
		System.out.print("Rotated Array: " + Arrays.toString(arr));
	}

}
