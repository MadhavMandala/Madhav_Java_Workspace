package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String first = sc.next();
		System.out.println("Enter the second string");
		String second = sc.next();
		if(first.equals(second)) {
			System.out.println("Same!");
		} else {
			System.out.println("Different");
		}
	}
}
