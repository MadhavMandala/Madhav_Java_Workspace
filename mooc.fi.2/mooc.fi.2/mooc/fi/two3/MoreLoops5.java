package mooc.fi.two3;
import java.util.Scanner;
public class MoreLoops5 {
	public static void main(String[] args0) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("What is the inital number?");
		int first = sc.nextInt();
		System.out.println("What is the last number?");
		int last = sc.nextInt();
		while (first <= last) {
			sum += first;
			first++;
		}
		System.out.println(sum);
	}
}
