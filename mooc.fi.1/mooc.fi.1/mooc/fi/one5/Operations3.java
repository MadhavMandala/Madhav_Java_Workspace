package mooc.fi.one5;
import java.util.Scanner;
public class Operations3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program prints the sum of the three numbers you give it.");
		System.out.println("Give the first number:");
		int first = sc.nextInt();
		System.out.println("Give the second number");
		int second = sc.nextInt();
		System.out.println("Give the third number");
		int third = sc.nextInt();
		int sum = first + second + third;
		System.out.println("The sum of your three numbers is: " + sum);
	}
}