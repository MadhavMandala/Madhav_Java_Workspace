
public class Dice {
	
	private int numberOfFaces;
	private int face; 
	
	
	public Dice(int numFaces) {
		numberOfFaces = numFaces;
		face = 0;
	}
	
	public void roll() {
		face = (int)((Math.random()*numberOfFaces)+1);
	}
	
	public int getFace() {
		return face;
	}
	
	
}
