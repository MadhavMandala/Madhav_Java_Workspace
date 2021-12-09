package mooc.fi.three2;
import java.util.Scanner;
import java.util.ArrayList;

public class Lists4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		String blankTest = ".";
		while(true) {
			blankTest = sc.nextLine().trim();
			if(blankTest.isEmpty()) {
				break;
			}
			arr.add(blankTest);
		}
		
		System.out.println(arr.get(arr.size()-1));
		
	}

}
