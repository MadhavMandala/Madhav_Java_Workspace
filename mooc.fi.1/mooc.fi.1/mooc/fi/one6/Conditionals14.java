package mooc.fi.one6;
import java.util.Scanner;
public class Conditionals14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of gift?");
		int giftValue = sc.nextInt();
		double tax;
		if(giftValue < 5000) {
			System.out.println("No Tax!");
		} else if(giftValue < 25000) {
			tax = 100 + (0.08*(giftValue-5000));
			System.out.println(tax);
		} else if(giftValue < 55000) {
			tax = 1700 + (0.1*(giftValue-25000));
			System.out.println(tax);
		} else if(giftValue < 200000) {
			tax = 4700 + (0.12*(giftValue-55000));
			System.out.println(tax);
		} else if(giftValue < 1000000) {
			tax = 22100 + (0.15*(giftValue-200000));
			System.out.println(tax);
		} else if(giftValue >= 1000000) {
			tax = 4700 + (0.17*(giftValue-1000000));
			System.out.println(tax);
		}
	}

}
