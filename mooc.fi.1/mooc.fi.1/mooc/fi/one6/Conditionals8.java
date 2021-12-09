package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What was your grade?");
		int grade = sc.nextInt();
		if(grade > 100) {
			System.out.println("Excellent!");
		} else if (grade >= 90) {
			System.out.println("5");
		} else if (grade >= 80) {
			System.out.println("4");
		} else if (grade >= 70) {
			System.out.println("3");
		} else if (grade >= 60) {
			System.out.println("2");
		} else if (grade >= 50) {
			System.out.println("1");
		} else if (grade >= 0) {
			System.out.println("You failed");
		} else {
			System.out.println("Impossible!");
		}
	}

}
