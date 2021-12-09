
public class Player {
	
	private String name;
	private int health;
	
	
	public Player(String n, int h) {
		name = n;
		health = h;
	}
	
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
	
	public String toString() {
		return "Name: " + name + "	Health: " + health;
	}
	
	public void getHurtByPoison( ) {
		health--;
	}
	
	public void eatFly() {
		health++;
	}
	
	
	
	
}
