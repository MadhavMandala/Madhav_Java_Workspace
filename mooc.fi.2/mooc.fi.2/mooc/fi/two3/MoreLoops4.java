package mooc.fi.two3;
import java.util.Scanner;
public class MoreLoops4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("What is the final number?");
		int last = sc.nextInt();
		int i = 0;
		while(i <= last) {
			sum += i;
			i++;
		}
		System.out.println("Your sum is: " + sum);
	}
}
