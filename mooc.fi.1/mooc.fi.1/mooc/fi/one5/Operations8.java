package mooc.fi.one5;
import java.util.Scanner;
public class Operations8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program prints the sum of the two numbers you give it.");
		System.out.println("Give the first number:");
		int first = sc.nextInt();
		System.out.println("Give the second number");
		int second = sc.nextInt();
		int sum = first + second;
		int difference = first - second;
		int product = first * second;
		double dividend = first;
		double divisor = second;
		double quotient = dividend/divisor;
		System.out.println(first + " + " + second + " = " + sum);
		System.out.println(first + " - " + second + " = " + difference);
		System.out.println(first + " * " + second + " = " + product);
		System.out.println(first + " / " + second + " = " + quotient);

	}
}
