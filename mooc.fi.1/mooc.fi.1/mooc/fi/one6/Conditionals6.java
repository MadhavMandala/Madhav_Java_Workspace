package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = sc.nextInt();
		if(age >=18) {
			System.out.println("You're an adult.");
		}
		if(age < 18) {
			System.out.println("You're not an adult");
		}
	}
}
