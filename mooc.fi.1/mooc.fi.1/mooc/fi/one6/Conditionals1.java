package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a speed:");
		int speed = sc.nextInt();
		if (speed > 120) {
			System.out.println("Speeding Ticket!");
		}
		
	}
}
