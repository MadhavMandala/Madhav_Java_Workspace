package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the first number:");
		int first = sc.nextInt();
		System.out.println("Give the second number");
		int second = sc.nextInt();
		if (first > second) {
			System.out.println("The greater number is: " + first);
		} else if(second > first) {
			System.out.println("The greater number is: " + second);
		} else {
			System.out.println("Both numbers are equal!");
		}
		
	}
}
