public class Coin {

	private double value;
	private String face;

	public Coin(double val) {
		value = val;
		face = "";
	}

	public double getValue() {
		return value;
	}

	public void setValue(double newValue) {
		value = newValue;
	}

	public String getFace() {
		return face;
	}

	public String flip() {
		int ran = (int) (Math.random() * 2);
		if (ran == 0)
			face = "HEADS";
		else
			face = "TAILS";
		return face;
	}

}
