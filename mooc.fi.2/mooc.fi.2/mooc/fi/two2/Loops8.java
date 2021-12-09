package mooc.fi.two2;
import java.util.Scanner;
public class Loops8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = -1;
		double count = -1;
		double num = 1;
		while (num != 0) {
			if(num < 0) {
				sum += num;
				count++;
			}
			System.out.println("Give a number:");
			num = sc.nextInt();
		}
		System.out.println("Average of numbers: " + sum/count);
	}
}
