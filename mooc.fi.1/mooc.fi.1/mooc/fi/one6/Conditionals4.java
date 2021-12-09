package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a year:");
		int year = sc.nextInt();
		if (year < 2015) {
			System.out.println("Ancient history!");
		}
	}
}
