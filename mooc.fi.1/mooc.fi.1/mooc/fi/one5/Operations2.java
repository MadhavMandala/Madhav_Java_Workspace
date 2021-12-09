package mooc.fi.one5;
import java.util.Scanner;
public class Operations2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program prints the sum of the two numbers you give it.");
		System.out.println("Give the first number:");
		int first = sc.nextInt();
		System.out.println("Give the second number");
		int second = sc.nextInt();
		int sum = first + second;
		System.out.println("The sum of your two numbers is: " + sum);
	}
}
