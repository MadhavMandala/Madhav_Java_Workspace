import java.util.Scanner;

public class LiarsDice {
	
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Players?");
		int numOfPlayers = sc.nextInt();
		DicePlayer[] players = new DicePlayer[numOfPlayers];
		System.out.println("How many dice per player?");
		int numOfDice = sc.nextInt();
		
		System.out.println("How many faces per die?");
		int numOfFaces = sc.nextInt();
		for (int i = 0; i<players.length; i++) {
			players[i] = new DicePlayer(numOfDice, numOfFaces);
		}
		
		int[] playerPoints = new int[numOfPlayers];
		int turn = 0; 
		
		while(max(playerPoints) < 50) {
			String wantPeek = "n";
			for (int i = 0; i<players.length; i++) {
				players[i].shake();
			}
			String lastGuess = "0 1";
			String[] temp = lastGuess.split(" ");
			int lastQuantity = Integer.parseInt(temp[0]);
			int lastFace = Integer.parseInt(temp[1]);
			int totalOfFace = 0;
			boolean challenged = false;
			
			while(!challenged) {
				int currentPlayer = turn%players.length + 1;
				for(int i = 0; i<playerPoints.length; i++) {
					System.out.println("Player " + (i+1) + "'s points is: " + playerPoints[i]);
				}
				System.out.println(" ");
				System.out.println("Player " + currentPlayer + "'s turn: ");
				
				System.out.println("Peek? (y/n)");
				wantPeek = sc.next();
				
				if (!wantPeek.equalsIgnoreCase("n")) {
					System.out.println(players[currentPlayer].peek());
				}
				
				System.out.println("The current guess is " + lastQuantity + " " + lastFace + "'s");
				System.out.println("Enter guess or type challenge");
				String guess = sc.next();
				if (guess.equalsIgnoreCase("challenge")) {
					
					for (int i = 0; i<players.length; i++) {
						totalOfFace += players[currentPlayer].getTotalOfFace(lastFace);
					}
					if (lastQuantity > totalOfFace) {
						playerPoints[currentPlayer] += 10;
						//increase currentplayer's points
					}else {
						playerPoints[currentPlayer] -= 10;
					}
					
				}else {
					lastGuess = guess;
				}
				
				
				turn++;
			}
			
		}
		
		
		/*
		System.out.println("Enter a number of Dice: ");
		int n = sc.nextInt();
		System.out.println("Enter number of Faces: ");
		int f = sc.nextInt();
		DicePlayer player1 = new DicePlayer(n, f);
		DicePlayer player2 = new DicePlayer(n, f);
		
		player1.shake();
		player2.shake();
		System.out.println("Player 1's Turn: ");
		System.out.println("Peek?(yes/no)");
		String peek = sc.next();
		if(peek.equalsIgnoreCase("yes")) {
			System.out.println(player1.peek());
		}
		for(int i = 0; i< 20; i++) {
			System.out.println(" ");
		}
		*/
	}
	
	
	
	
}
