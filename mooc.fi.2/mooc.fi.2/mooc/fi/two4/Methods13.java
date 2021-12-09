package mooc.fi.two4;

public class Methods13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTriangle(26);
	}
	
	public static void printStars(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	public static void printSquare(int num) {
		for (int i = 0; i < num; i++) {
			printStars(num);
		}
	}
	
	public static void printRectangle(int width, int height) {
		for (int i = 0; i < height; i++) {
			printStars(width);
		}
	}
	
	public static void printTriangle(int size) {
		for (int i = 1; i < size+1; i++) {
			printStars(i);
		}
	}
}
