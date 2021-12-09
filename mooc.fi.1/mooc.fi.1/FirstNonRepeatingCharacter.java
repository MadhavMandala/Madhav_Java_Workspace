import java.util.*;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		
		for (int i = 0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		char x = ' ';
		outLoop:
		for (int i = 0; i<str.length(); i++) {
			inLoop:
			for (int j = i+1; j<str.length(); j++) {
				
				if (ch[i] != ch[j]) {
					x = ch[i];
					if (j == str.length()-1) {
						break outLoop;
					}
				} 
				
				if (ch[i] == ch[j] && i+1 == j) {
					i++;
					break inLoop;
				}
			}
		}
		System.out.println(x);

	}

}
