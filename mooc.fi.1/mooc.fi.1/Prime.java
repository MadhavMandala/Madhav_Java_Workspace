import java.util.*;
public class Prime {

	public static void main(String[] args) {
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter a positive number");
			n = sc.nextInt();
		}while(n<0);
		
		
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) {
				System.out.println("NOT PRIME!!!");
				sc.close();
				return;
			}
		}
		System.out.println("PRIME");
		
		sc.close();
	}

}
