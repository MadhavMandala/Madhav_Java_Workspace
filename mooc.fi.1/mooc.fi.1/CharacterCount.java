import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		char[] ch = new char[str.length()];
		
		for (int i = 0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		
		
		for(int i = 0; i<ch.length; i++) {
			
			if (str.indexOf(str.charAt(i)) == i) {
					int numReps = 1;
					char charVal = ch[i];
				
				
				for (int j = i+1; j<ch.length; j++) {
					
					if (ch[i] == ch[j]) {
						numReps++;
					}
					
				}
				
				System.out.print(numReps + "" + charVal + " ");
			}
			
		}
		
		
	}

}

