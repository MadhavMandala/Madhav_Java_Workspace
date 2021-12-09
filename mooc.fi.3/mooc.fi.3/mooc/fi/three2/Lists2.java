package mooc.fi.three2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int input = 1;
		while (input != 0) {
			input = sc.nextInt();
			arr.add(input);
			
		}
		
		System.out.println(arr.get(1) + arr.get(2));
	}

}
