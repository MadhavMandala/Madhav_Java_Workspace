import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in a String");
		
		String name = sc.nextLine();
		
		int last = (name.length() - 1);
		int x = 0;
		for (int i = 0; i<last; i++) {
			if (name.charAt(i) == (name.charAt(last))) {
				last--;
				x = 1;
			} else {
				x = 0;
			}
			
		}
		
		if (x==1) {
			System.out.println("This Is a Palindrome");
		} else {
			System.out.println("Not an Array! (If you have a capital letter it may have affected the result...)");
		}
		
	}

}
