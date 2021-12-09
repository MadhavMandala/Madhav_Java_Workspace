package mooc.fi.one5;
import java.util.Scanner;
public class Operations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days would you like to convert to seconds?");
		int num = sc.nextInt();
		int finalNum = num * 60*60*24;
		System.out.println("There are " + finalNum + " seconds in " + num + " days.42");
	}

}
