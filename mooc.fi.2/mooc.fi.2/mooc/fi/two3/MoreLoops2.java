package mooc.fi.two3;
import java.util.Scanner;
public class MoreLoops2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number: ");
		int start = sc.nextInt();
		while (start <= 100) {
			System.out.println(start);
			start++;
		}
		
	}
}
