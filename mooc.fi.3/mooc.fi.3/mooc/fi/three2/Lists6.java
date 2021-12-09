package mooc.fi.three2;
import java.util.Scanner;
import java.util.ArrayList;


public class Lists6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int breakTest = 0;
		while (true) {
			breakTest = sc.nextInt();
			if(breakTest == -1) {
				break;
			}
			arr.add(breakTest);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
