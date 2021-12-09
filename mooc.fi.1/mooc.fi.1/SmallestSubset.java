import java.util.*;
public class SmallestSubset {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers do you want in your index?");
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] a2 = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			int m = sc.nextInt();
			arr[i] = m;
			a2[i] = m;
		}
		
		
		
		System.out.println("Enter a Value in which you want to find addends of within your index:");
		int sum = sc.nextInt();
		
		int startPoint = 0;
		int endPoint = 1;
		int[] smallestArr = Arrays.copyOf(arr, n);
		
		
		while(endPoint != arr.length+1 ) {
			
			int[] tempArr = Arrays.copyOfRange(arr, startPoint, endPoint);
			
			int tempSum = 0;
			
			for (int i = 0; i<tempArr.length; i++) {
				tempSum += tempArr[i];
			}
			
			if (sum < tempSum) {
				startPoint++;
			}else if (sum > tempSum) {
				endPoint++;
			}else if (smallestArr.length > tempArr.length) {
				smallestArr = tempArr;
				endPoint++;
				startPoint++;
			}
			
		}
		
		boolean finalCheck = Arrays.equals(arr, smallestArr);
		
		
		
		if (finalCheck && arr.length != 1) {
			System.out.println("No Values Possible");
		}else {
			for (int i = 0; i<smallestArr.length; i++)
			System.out.println(smallestArr[i]);
		}
		
	}

}
