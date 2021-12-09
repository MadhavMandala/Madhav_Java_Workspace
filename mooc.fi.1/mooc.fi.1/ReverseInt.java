import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int temp = 0;
		int numLength = String.valueOf(n).length();
		for (int i = 0; i<numLength; i++) {
			
			System.out.print(n%10);
			n /= 10;
			
			
		}
		
		
		
		
	}

}
