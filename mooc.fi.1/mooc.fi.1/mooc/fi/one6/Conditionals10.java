package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Password?");
		String password = sc.next();
		if(password.equals("Caput Draconis")) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Off with you!");
		}
		
	}

}
