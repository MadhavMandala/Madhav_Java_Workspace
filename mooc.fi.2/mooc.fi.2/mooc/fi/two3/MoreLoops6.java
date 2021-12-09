package mooc.fi.two3;
import java.util.Scanner;	
public class MoreLoops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long product = 1;
		int i = 1;
		System.out.println("What number do you want the factorial of?");
		int last = sc.nextInt();
		
		while(i <= last) {
			product *= i;
			i++;
		}
		System.out.println(product);
	}

}
