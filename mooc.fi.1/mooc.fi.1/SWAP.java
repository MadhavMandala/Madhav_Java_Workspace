
public class SWAP {
	
	public static void main(String[] args) {
		int x=5, y=8;
		
		
		y = y - x;
		x = x + y;
		y = x - y;
		
		System.out.println(x + " " + y);
	}
	
}
