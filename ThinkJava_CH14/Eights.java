import java.util.Scanner;
import java.util.ArrayList;

public class Eights {

	private Player one;
	private SmartPlayer two;
	private ArrayList<Player> players = new ArrayList<Player>();
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;

	public static void main(String[] args) {

		int gamesToPlay = 1;

		for (int currentGameNumber = 0; currentGameNumber < gamesToPlay; currentGameNumber++) {

			Eights game = new Eights();
			game.playGame(currentGameNumber, gamesToPlay);

		}

	}


	public Eights() {

		Deck deck = new Deck("Deck");
		deck.shuffle();

		int playerNum = 3;

		for (int i = 0; i < playerNum; i++) {

			players.add(i, new Player("Player " + (i + 1)));
			deck.deal(players.get(i).getHand(), 5);

		}

		discardPile = new Hand("Discards");
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw pile");
		deck.dealAll(drawPile);

		in = new Scanner(System.in);

	}

	public boolean isDone() {

		for (int i = 0; i < players.size(); i++) {

			if (players.get(i).getHand().isEmpty()) {

				return true;

			}

		}

		return false;

	}

	public void reshuffle() {

		Card prev = discardPile.popCard();

		discardPile.dealAll(drawPile);

		discardPile.addCard(prev);

		drawPile.shuffle();

	}

	public Card drawCard() {

		if (drawPile.isEmpty()) {

				reshuffle();

		}

		return drawPile.popCard();

	}

	public Player nextPlayer(Player current) {

		if (current == players.get(players.size() - 1)) {

			return players.get(0);

		}

		else {

			// Return the next name in the arraylist 

			int index = players.indexOf(current) + 1;

			return players.get(index);

		}

	}

	public void displayState() {

		//one.display();
		//two.display();

		for (int i = 0; i < players.size(); i++) {

			players.get(i).display();

		}

		discardPile.display();

		System.out.print("Draw pile: ");
		System.out.println(drawPile.size() + " cards");

		in.nextLine();

	}

	public void takeTurn(Player player) {

		Card prev = discardPile.lastCard();
		Card next = player.play(this, prev);
		discardPile.addCard(next);

		System.out.println(player.getName() + " plays " + next);
		System.out.println();

	}

	public void playGame(int gameNumber, int gamesToPlay) {

		Player player = players.get(0);

		while (!isDone()) {

			displayState();
			takeTurn(player);
			player = nextPlayer(player);

		}

		one.displayScore();
		two.displayScore();

		if (gameNumber == gamesToPlay - 1) {

			if (one.getWins() > two.getWins()) {

				System.out.println("One won the most games. (" + one.getWins() + ")");

			}

			else if (two.getWins() > one.getWins()) {

				System.out.println("Two won the most games. (" + two.getWins() + ")");

			}

			else {

				System.out.println("tie");

			}

		}
		

	}

}