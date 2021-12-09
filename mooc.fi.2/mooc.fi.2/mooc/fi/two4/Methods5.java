package mooc.fi.two4;
import java.util.Scanner;
public class Methods5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number:");
		int a = sc.nextInt();
		System.out.println("Second number:");
		int b = sc.nextInt();
		division(a, b);
	}
	
	public static void division(int a, int b) {
		System.out.println((double)a/(double)b);
	}
}
