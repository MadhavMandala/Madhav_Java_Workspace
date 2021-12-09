import java.util.Arrays;
import java.util.Scanner;

public class BianarySearchV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want in your array?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] tempArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter a number:");
			int tempNum =  sc.nextInt();
			arr[i] = tempNum;
			tempArr[i] = tempNum;
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
		System.out.println("What number do you want to find?");
		int goal = sc.nextInt();
		int middle = (int)(n/2);
		while (middle != goal) {
			if(arr[middle] < goal) {
				middle = (int)((middle + (n-1))/2);
			}else if(arr[middle] > goal) {
				middle = (int)((middle + 0)/2); 
			}else {
				break;
			}
		}
		System.out.println(middle+1);
		
	}

}
