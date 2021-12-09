package mooc.fi.two4;

public class Methods14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		christmasTree(2);
	}
	
	public static void christmasTree(int height) {
		for(int i = 0; i <= height; i++) {
			printSpaces(height - i);
			printStars(i*2-1);
			System.out.println("");
		}
		for(int i = 0; i < 2; i++) {
			printSpaces(height-2);
			printStars(3);
			System.out.println("");
		}
	
	}
	
	public static void printSpaces(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(" ");
		}
	}
	
	public static void printStars(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
	}
	
	public static void printRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			printStars(width);
			System.out.println();
		}
	}
}
