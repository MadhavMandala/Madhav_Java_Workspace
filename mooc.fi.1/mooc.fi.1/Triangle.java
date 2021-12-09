import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Triangle identifier!");
		System.out.println(
				"Type in a number and press enter three different times! \nWe will tell you what type of triangle those values will create!");

		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		if (side3 > side2 && side3 > side1) {

		} else if (side2 > side3 && side2 > side1) {
			int temp = side2;
			side2 = side3;
			side3 = temp;
		} else if (side1 > side3 && side1 > side2) {
			int temp = side1;
			side1 = side3;
			side3 = temp;
		}

		if (side1 + side2 <= side3 || side1 <= 0 || side2 <= 0 || side3 <= 0) {
			System.out.println("NOT A TRIANGLE!");
			sc.close();
			return;
		} else if (side1 == side2 && side2 == side3) {
			System.out.println("Equilateral");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("Isosceles");
		} else if (side1 != side2 && side2 != side3) {
			System.out.println("Scalene");
		} else {
			System.out.println("IDK?");
		}

		if (side1 * side1 + side2 * side2 == side3 * side3) {
			System.out.println("Right");
		} else if (side1 * side1 + side2 * side2 > side3 * side3) {
			System.out.println("Acute");
		} else {
			System.out.println("Obtuse");
		}

		sc.close();
	}

}
