package mooc.fi.three2;

import java.util.Scanner;
import java.util.ArrayList;


public class Lists11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		
		int input = sc.nextInt();
		
		while (input != -1) {
			list.add(input);	
			input = sc.nextInt();
					
			
		}
		
		
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			sum += list.get(i);
			
		}
		
		
		System.out.println("Sum: " + sum);
		
	}

}
