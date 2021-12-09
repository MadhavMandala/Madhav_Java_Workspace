package mooc.fi.one5;
import java.util.Scanner;
public class Operations7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program prints the average of the three numbers you give it.");
		System.out.println("Give the first number:");
		double first = sc.nextDouble();
		System.out.println("Give the second number");
		double second = sc.nextDouble();
		System.out.println("Give the third number");
		double third = sc.nextDouble();
		double average = (first + second + third)/3;
		System.out.println("The average is " + average);
	}
}
