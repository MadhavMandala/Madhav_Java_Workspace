
public class DicePlayer {
	
	private Dice[] cup;
	private int numberOfFaces;
	
	
	public DicePlayer(int numberOfDice, int numOfFaces) {
		cup = new Dice[numberOfDice];
		numberOfFaces = numOfFaces;
		for(int i = 0; i<cup.length; i++) {
			cup[i] = new Dice(numOfFaces);
			
		}
		
	}
	
	
	public void shake() {
		for(int i = 0; i<cup.length; i++) {
			cup[i].roll();
		}
	}
	
	public int getTotalOfFace(int targetFace) {
		int count = 0;
		for(int i = 0; i<cup.length; i++) {
			if(cup[i].getFace() == targetFace) {
				count++;
			}
		}
		return count;
	}
	
	public String peek() {
		String result = "";
		for(int i = 0; i<numberOfFaces; i++) {
			result += getTotalOfFace(i+1) + " " + (i+1) + "'s   "; 
		}
		return result;
	}
	
	
	
}
