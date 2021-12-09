import java.util.Scanner;

public class CorrespondingCharacter {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int [] arr = new int[str.length()];
		int counter = 0;
		
		System.out.println("Which Parentases do you want to find the pair of?");
		int index = sc.nextInt();
		
		
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i) == '(') {
				counter--;
				arr[i] = counter;
				
			}
			
		}
		
		counter = 0;
		
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt((str.length()-1)-i) == ')') {
				counter++;
				arr[(str.length()-1)-i] = counter;
				
			}
			
		}
//this (First , (second and here you go (40 then )49)here you)59)		
		for (int i = 0; i<str.length(); i++) {
			
			if (arr[i] == index) {
				System.out.println("It is located at index " + i);
			}
			
		}
		
		
	}
}
