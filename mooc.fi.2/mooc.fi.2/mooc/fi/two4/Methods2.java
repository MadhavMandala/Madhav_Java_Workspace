package mooc.fi.two4;
import java.util.Scanner;
public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times?");
		int iterations = sc.nextInt();
		for(int i = 0; i < iterations; i++) {
			printText();
		}
	}
	
	public static void printText() {
		System.out.println("In a hole in the ground there lived a method");
	}
}
