package mooc.fi.two2;
import java.util.Scanner;
public class Loops4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = -1;
		int num = 1;
		while (num != 0) {
			count++;
			System.out.println("Give a number:");
			num = sc.nextInt();
		}
		System.out.println("Number of numbers: " + count);
	}
}
