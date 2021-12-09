package mooc.fi.two4;

public class Methods10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =  smallest(2, 7);
	    System.out.println("Smallest: " + answer);
	}
	
	public static int smallest(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

}
