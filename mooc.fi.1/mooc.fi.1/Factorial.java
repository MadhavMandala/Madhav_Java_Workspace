import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int n=0;
		do {
			System.out.println("Enter a positive number");
			n = sc.nextInt();
		}while(n<0);
		
		
		
		for (; n>0; n--) {
			result *= n;
		}
		System.out.println(result);
		
		
	}

}
