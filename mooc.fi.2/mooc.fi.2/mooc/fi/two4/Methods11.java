package mooc.fi.two4;

public class Methods11 {
	public static void main(String[] args) {
		int answer =  greatest(2, 7, 3);
		System.out.println("Greatest: " + answer);
	}
	
	public static int greatest(int a, int b, int c) {
		int greatest;
		if ( a < b) {
			greatest = b;
		} else {
			greatest = a;
		}
		if (greatest < c) {
			greatest = c;
		}
		return greatest;
	}
}
