import java.util.Scanner;

public class CoinGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("How many coins is each player allowed?");
			int numCoins = sc.nextInt();
			CoinPlayer player1 = new CoinPlayer(numCoins);
			CoinPlayer player2 = new CoinPlayer(numCoins);
			System.out.println("Heads or Tails?");
			String str = sc.next();
			player1.flipAllCoins();
			player2.flipAllCoins();
			System.out.println("Blitz Mode? (yes/no)");
			String blitz = sc.next();
			if (blitz.equalsIgnoreCase("Yes")) {
				if (!(str.equalsIgnoreCase("heads") || str.equalsIgnoreCase("tails"))) {
					System.out.println("Bad Input, please try again...");
				} else if (str.equalsIgnoreCase("heads")) {
					System.out.println("Player 1: " + player1.numberOfHeads());
					System.out.println("Player 2: " + player2.numberOfHeads());
				} else {
					System.out.println("Player 1: " + player1.numberOfTails());
					System.out.println("Player 2: " + player2.numberOfTails());
				}
			} else {
				player1.flipNextCoin();
				player2.flipNextCoin();
				do {
					System.out.print("Player 1: " + player1.lastFlippedCoin().getFace());
					System.out.print("	Player 2: " + player2.lastFlippedCoin().getFace());
					sc.next();
				} while (player1.flipNextCoin() && player2.flipNextCoin());

			}

		} while (true);

	}

}
