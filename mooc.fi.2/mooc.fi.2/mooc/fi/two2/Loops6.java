package mooc.fi.two2;
import java.util.Scanner;
public class Loops6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = -1;
		int num = 1;
		while (num != 0) {
			count += num;
			System.out.println("Give a number:");
			num = sc.nextInt();
		}
		System.out.println("Sum of numbers: " + count);
	}
}
