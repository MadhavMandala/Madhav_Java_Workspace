package mooc.fi.two2;
import java.util.Scanner;
public class Loops5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = 1;
		while (num != 0) {
			if (num < 0) {
				count++;
			}
			System.out.println("Give a number:");
			num = sc.nextInt();
		}
		System.out.println("Number of negative numbers: " + count);
	}
}
