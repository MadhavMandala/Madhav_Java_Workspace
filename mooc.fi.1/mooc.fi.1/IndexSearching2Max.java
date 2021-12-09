import java.util.*;
public class IndexSearching2Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want in your index?");
		int n = sc.nextInt(); 
		int[]arr = new int[n];
		
		
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = sc.nextInt();
		}
		
		
		int x = 0;
		for (int a = 0; a<arr.length; a++) {
			if (arr[a] >= x) {
				x = arr[a];
			}
				
		}
		System.out.println("Max value of this array is " + x);
		
	}

}
