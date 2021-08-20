
public class Base {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		runGame(deck);
			
	}
	
	public static void runGame(Deck deck) {
		
		deck.shuffle();
			
		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 25));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(26, 51));
			
		while (!p1.isEmpty() && !p2.isEmpty()) {
				
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			int diff = c1.getRank() - c2.getRank();
			
			if (diff > 0) {
				
				p1.addCard(c1);
				p1.addCard(c2);
				
			}
				
			else if (diff < 0) {
				
				p2.addCard(c1);
				p2.addCard(c2);
				
			}
				
			else {
				
				// Ex13_5
				
				executeTieHandler(diff, c1, c2, p1, p2);
				
			}
			
			endHandler(p1, p2);
		
		}
		
	}
	
	public static void executeTieHandler(int diff, Card c1, Card c2, Pile p1, Pile p2) {
		
		Pile tiePile = new Pile();
		
		tiePile.addCard(c1);
		tiePile.addCard(c2);
		
		int p1_cards = 0;
		int p2_cards = 0;
		
		for (int i = 0; i < 6; i++) {
			
			if (p1_cards < 3) {
				
				if (!p1.isEmpty()) {
					
					tiePile.addCard(p1.popCard());
					p1_cards++;
					
				}
				
				else {
					
					endHandler(p1, p2);
					
				}
				
			}
			
			else if (p2_cards < 3) {
				
				if (!p2.isEmpty()) {
					
					tiePile.addCard(p2.popCard());
					p2_cards++;
					
				}
				
				else {
					
					endHandler(p1, p2);
					
				}
				
			}
			
		}
		
		if (!p1.isEmpty()) { 
		
			c1 = p1.popCard();
			
		}
		
		else if (!p2.isEmpty()) {
			
			c2 = p2.popCard();
			
		}
		
		else {
			
			endHandler(p1, p2);
			
		}
		
			diff = c1.getRank() - c2.getRank();
			
			if (diff > 0) {
				
				p1.addCard(c1);
				p1.addCard(c2);
				
				while (!tiePile.isEmpty()) {
					
					p1.addCard(tiePile.popCard());
					
				}
				
			}
			
			else if (diff < 0) {
				
				p2.addCard(c1);
				p2.addCard(c2);
				
				while (!tiePile.isEmpty()) {
					
					p2.addCard(tiePile.popCard());
					
			}
				
		}
		
	}
	
	public static void endHandler(Pile p1, Pile p2) {
		
		if (p2.isEmpty()) {
			
			System.out.println("Player 1 wins!");
			
		}
		
		else {
			
			System.out.println("Player 2 wins!");
			
		}
		
	}

}
