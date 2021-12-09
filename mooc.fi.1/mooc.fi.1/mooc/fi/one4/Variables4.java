package mooc.fi.one4;

import java.util.Scanner;

public class Variables4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Truth Value:");
		boolean bool = sc.hasNextBoolean();	
		System.out.println("Truth value: " + bool);
	}
}
