package mooc.fi.three2;
import java.util.Scanner;
import java.util.ArrayList;


public class Lists3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String blankTest = ".";
		String newline = System.getProperty("line.separator");
		while (true) {
			blankTest = sc.nextLine().trim();
			if( blankTest.isEmpty()) {
				break;
			}
			arr.add(blankTest);			
		}
		
		System.out.println(arr.size());
		
	}

}


