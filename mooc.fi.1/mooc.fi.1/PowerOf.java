import java.util.Scanner;

public class PowerOf {
	
	
	public static int power(int base, int exponent) {

		int result = 1;
		for(int i = 0; i<exponent; i++) {
			
			result *= base;
			
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Base");
		int base = sc.nextInt();
		System.out.println("Enter an Exponent");
		int exponent = sc.nextInt();
		
		System.out.println(power(base, exponent));
		
	}

}
