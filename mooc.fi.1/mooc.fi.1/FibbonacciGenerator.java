import java.util.Scanner;

public class FibbonacciGenerator {
	static long value1 = 1;
	static long value2 = 1;
	static long sum = 0;
	static long stop = 0;
	static long count = 3;
	
	static void fs(){
		
		if(stop == 1) {
			System.out.println(value1);
			return;
		}
		if(stop == 2) {
			System.out.println(value1);
			System.out.println(value2);
			return;
		}
		

		//System.out.println("value of count:" + count);
		//System.out.println("value of stop:" + stop);
		
		if (count < stop+1) {
			sum = value1+value2;
			value1 = value2;
			value2 = sum;
			System.out.println(count + ": "  + sum);
			count++;
			fs();
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a stopping point: ");
		stop = sc.nextInt();
		System.out.println("1: " + value1);
		System.out.println("2: " + value2);
		fs();
		
	}

}
