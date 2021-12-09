package mooc.fi.three2;

import java.util.Scanner;
import java.util.ArrayList;

public class Lists10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int input = 0;
		
		while (input != 9999) {
			
			input = sc.nextInt();
			
			list.add(input);
			
		}
		
		
		int smallest = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			
			if (smallest > list.get(i)) {
				
				smallest = list.get(i);
				
			}
			
		}
		
		System.out.println("Smallest number: " + smallest);
		
		
		for(int i = 0; i < list.size(); i++) {
			
			if(smallest == list.get(i)) {
				
				System.out.println("Found at index " + i);
				
			}
			
		}
		
		
		
		
	}

}
