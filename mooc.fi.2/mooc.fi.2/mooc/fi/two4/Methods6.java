package mooc.fi.two4;
import java.util.Scanner;
public class Methods6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First number: ");
		int a = sc.nextInt();
		System.out.println("Second number: ");
		int b = sc.nextInt();
		divisibleByThreeInRange(a, b);
	}
	
	public static void divisibleByThreeInRange(int a, int b) {
		for (int i = a; i < b; i++) {
			if (i%3 == 0) {
				System.out.println(i);
			}
		}
	}
}
