import java.util.*;
public class Counting {

	public static void main(String[] args) {
		
		int base = 2;
		int power = 5;
		int product = 1;
		for(int i=0; power>i; i++)
		{
			product *= base;
		}
		
		System.out.println(product);
		int x= -7;
		if (x<0) {
			x *= (-1);
			System.out.println(x);
		}else {
			System.out.println(x);
		}
		
		
	}

}
