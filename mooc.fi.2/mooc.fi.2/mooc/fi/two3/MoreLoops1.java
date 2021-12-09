package mooc.fi.two3;
import java.util.Scanner;
public class MoreLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number: ");
		int num = sc.nextInt();
		int counter = 0;
		System.out.println(counter);
		while(counter != num) {
			counter++;
			System.out.println(counter);
		}
	}

}
