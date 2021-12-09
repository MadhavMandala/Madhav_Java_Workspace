package mooc.fi.two3;
import java.util.Scanner;
public class MoreLoops3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Where to?");
		int end = sc.nextInt();
		System.out.println("Where from?");
		int start = sc.nextInt();
		while (start <= end) {
			System.out.println(start);
			start++;
		}
	}
}
