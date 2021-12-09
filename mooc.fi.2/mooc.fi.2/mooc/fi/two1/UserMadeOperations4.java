package mooc.fi.two1;
import java.util.Scanner;
public class UserMadeOperations4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number:");
		int first = sc.nextInt();
		System.out.println("Input the second number:");
		int second = sc.nextInt();
		if(first > second) {
			System.out.println(first + " is greater than " + second);
		} else if(first < second) {
			System.out.println(second + " is greater than " + first);
		} else {
			System.out.println(first + " is equal to " + second);
		}
	}

}
