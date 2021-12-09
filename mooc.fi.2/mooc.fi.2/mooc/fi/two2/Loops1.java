package mooc.fi.two2;
import java.util.Scanner;
public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String valueCheck = "yes";
		while(!valueCheck.equalsIgnoreCase("no")) {
			System.out.println("Shall we carry on?");
			valueCheck = sc.next();
		}
	}

}
