package mooc.fi.two3;
import java.util.Scanner;	
public class MoreLoops7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		double sum = 0;
		double number = -1;
		int even = -1;
		int odd = 0;
		System.out.println("Give numbers: ");
		while(input != -1) {
			sum += input;
			number++;
			if((input%2) == 0) {
				even++;
			} else {
				odd++;
			}
			input = sc.nextInt();
		}
		System.out.println("Thx! Bye!");
		System.out.println("Sum: " + (int)sum);
		System.out.println("Average: " + sum/number);
		System.out.println("Number: " + (int)number);
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}
}
