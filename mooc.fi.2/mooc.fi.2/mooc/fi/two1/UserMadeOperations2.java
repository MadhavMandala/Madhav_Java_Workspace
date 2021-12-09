package mooc.fi.two1;
import java.util.Scanner;
public class UserMadeOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number:");
		int first = sc.nextInt();
		System.out.println("Input the second number:");
		int second = sc.nextInt();
		double num = Math.sqrt(first+second);
		System.out.println(num);
	}

}
