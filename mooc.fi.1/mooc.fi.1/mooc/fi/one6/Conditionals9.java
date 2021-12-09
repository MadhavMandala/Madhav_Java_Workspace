package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number:");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("That number is even.");
		} else {
			System.out.println("That number is odd.");
		}
	}

}
