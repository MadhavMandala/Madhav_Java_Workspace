package mooc.fi.one3;

import java.util.Scanner;

public class Feed6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I'll tell you a story, but first you tell me the main character's name:");
		String name = sc.nextLine();
		System.out.println("Now tell me their occupation:");
		String occupation = sc.nextLine();
		System.out.println("Once upon a time, " + name + ", who was a " + occupation + " by profession. While traveling to work, " + name + " thought about their daily life. Perhaps " + name + " is not a " + occupation + " all their life.");
		
		
	}
}
