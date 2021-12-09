import java.util.Scanner;

public class FloydTree {

	public static void main(String[] args) {
		int line = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stopping line: ");
		int stop = sc.nextInt();
		int numCount = 1;
		
		for(int i = 0; i<stop; i++) {
			int j = 0;
			
			while (j<=i) {
				System.out.print(numCount + " ");
				numCount++;
				j++;
			}
			System.out.println();
			
		}
		
		
	}

}
