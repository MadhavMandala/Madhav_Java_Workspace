package mooc.fi.one4;
import java.util.Scanner;
public class Variables5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string:");
		String string = sc.next();
		System.out.println("Input an integer:");
		int num = sc.nextInt();
		System.out.println("Input a double:");
		double dounum = sc.nextDouble();
		System.out.println("Input a boolean:");
		boolean bool = sc.hasNextBoolean();
		System.out.println("You gave the string " + string);
		System.out.println("You gave the integer " + num);
		System.out.println("You gave the double " + dounum);
		System.out.println("You gave the boolean " + bool);

	}
}
