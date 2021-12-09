package mooc.fi.three2;
import java.util.Scanner;
import java.util.ArrayList;


public class Lists8 {

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
		int greatest = arr.get(0);
		for(int i = 0; i < arr.size(); i++) {
			if (greatest < arr.get(i)) {
				greatest = arr.get(i);
			}
		}
		System.out.println(greatest);
	}

}
