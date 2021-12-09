import java.util.Scanner;

public class ConsecIntSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sum: ");
		double sum = sc.nextInt();
		if (sum%2 == 0) {
			for (int i = 3; i<sum; i++) {
				if (sum%i==0 && i%2 == 1) {
					for(int j = (-1)*(i/2); j<=(i/2); j++) {
						System.out.print(((int)(sum/i)+j) + " ");
					}
					return;
				}
			}
			System.out.println(" ");
		}
		
		else if (sum%2 ==1){
			System.out.println((int)Math.floor(sum/2) + " " + (int)Math.ceil(sum/2));
			for (int i = 2; i<sum; i++) {
				if (sum%i==0 && i%2 == 1) {
					for(int j = (-1)*(i/2); j<=(i/2); j++) {
						System.out.print(((int)(sum/i)+j) + " ");
					}
					System.out.println();
				}
				
			}
			
			return;
			
		}
		
		
	}

}
