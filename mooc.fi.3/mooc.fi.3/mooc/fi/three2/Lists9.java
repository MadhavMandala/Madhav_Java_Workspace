package mooc.fi.three2;
import java.util.Scanner;
import java.util.ArrayList;

public class Lists9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int input = 0;
		
		while(input != -1) {
			
			input = sc.nextInt();
			list.add(input);
			
		}
		
		System.out.println("Search for?");
		int search = sc.nextInt();
		
		for (int i = 0; i < list.size(); i++) {
			
			if (search == list.get(i)) {
				
				System.out.println(search + " is at index " + i);
				
			}
		}
		
	}

}
