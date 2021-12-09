import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * if(<conditional statement>) { <body> } <optional else> else { <body> }
		 */

		/*
		 * int num = 65 if (num%2==0) { System.out.println("Even"); } else {
		 * System.out.println("Odd"); }
		 */
		System.out.println("Enter a Grade!");
		int numGrade = sc.nextInt();
		
		if (numGrade >= 90) {
			System.out.print("You got an A!");
		} else if (numGrade >= 80) {
			System.out.print("You got a B!");
		} else if (numGrade >= 70) {
			System.out.print("You got a C!");
		} else if (numGrade >= 65) {
			System.out.print("You got a D!");
		} else {
			System.out.print("You got an F!");
		}

	}

}
