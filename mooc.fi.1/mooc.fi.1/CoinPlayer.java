
public class CoinPlayer {

	private Coin[] coins;
	private int lastFlipped;

	public CoinPlayer(int numberOfCoins) {
		coins = new Coin[numberOfCoins];
		for (int i = 0; i < coins.length; i++) {
			coins[i] = new Coin(.25);
		}
		lastFlipped = -1;
	}

	public Coin lastFlippedCoin() {
		return coins[lastFlipped];
	}

	public boolean flipNextCoin() {
		if (lastFlipped == coins.length - 1) {
			return false;
		}
		lastFlipped++;
		coins[lastFlipped].flip();
		return true;
	}

	public void flipAllCoins() {
		for (int i = 0; i < coins.length; i++) {
			coins[i].flip();
		}
	}

	public int numberOfHeads() {
		int count = 0;
		for (int i = 0; i < coins.length; i++) {
			if ("HEADS".equals(coins[i].getFace()))
				count++;
		}
		return count;
	}

	public int numberOfTails() {
		int count = 0;
		for (int i = 0; i < coins.length; i++) {
			if ("TAILS".equals(coins[i].getFace()))
				count++;
		}
		return count;
	}

}
