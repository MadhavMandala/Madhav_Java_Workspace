package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = sc.nextInt();
		if(age > 120 || age < 0) {
			System.out.println("Impossible!");
		} else {
			System.out.println("OK");
		}
		
	}

}
