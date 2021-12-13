package mooc.fi.three2;

import java.util.Scanner;
import java.util.ArrayList;


public class Lists13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		
		String input = sc.nextLine();
		
		while(!input.isEmpty()) {
			
			list.add(input);
			input = sc.nextLine();
			
		}


		System.out.println("Search for?");
		String search = sc.nextLine();
		
		if (list.contains(search)) {
			System.out.println(search + " was found!");
		}
		
		//test repository changes

		//from the intelliJ ide on my mac
	}

}
