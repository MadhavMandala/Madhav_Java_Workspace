package mooc.fi.two1;
import java.util.Scanner;
public class UserMadeOperations3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if(num >= 0) {
			System.out.println(num);
		} else {
			System.out.println(num*-1);
		}
	}

}
