package mooc.fi.two2;
import java.util.Scanner;
public class Loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while (num != 0) {
			System.out.println("Give a number:");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println(num*num);
			} else if (num < 0) {
				System.out.println("Unsuitable number");
			}
		}
	}

}
