public class Base {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
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

				Pile tiePile = new Pile();
				Boolean drawSolved = false;
				Boolean isInitialLoop = true;

				while (drawSolved != true) {

					/* Draw 3 cards from the pile of each player. When drawing a card, check
					   to confim that the pile is not empty, so no exception is thrown. */

					for (int i = 0; i < 3; i++) {

						if (!(p1.isEmpty())) {

							Card tieP1 = p1.popCard();
							tiePile.addCard(tieP1);

						}

						else {

							System.out.println("Player 1 is empty");
							drawSolved = true;
						
						}

					}

					if (drawSolved != true) {

						for (int j = 0; j < 3; j++) {

							if (!(p2.isEmpty())) {

								Card tieP2 = p2.popCard();
								tiePile.addCard(tieP2);

							}

							else {

								System.out.println("Player 2 is empty");
								drawSolved = true;
						
							}

						}
					}

					if (drawSolved != true) {

						/* If it's the first loop, add the original cards. */

						if (isInitialLoop = true) {

							tiePile.addCard(c1);
							tiePile.addCard(c1);
							isInitialLoop = false;

						}
					
					}

					/* Draw one more card from each pile and compare them. */

					Card tieBreakerP1 = new Card(0, 0);
					Card tieBreakerP2 = new Card(0, 0);

					if (drawSolved != true) {

						if (!(p1.isEmpty())) {

							tieBreakerP1 = p1.popCard();

						}
	
						else {

							System.out.println("Player 1 is empty");
							drawSolved = true;

						}

					}

					if (drawSolved != true) {

						if (!(p2.isEmpty())) {

							tieBreakerP2 = p2.popCard();

						}
	
						else {

							System.out.println("Player 2 is empty");
							drawSolved = true;

						}

					}

					int tieDiff = tieBreakerP1.getRank() - tieBreakerP2.getRank();
					
					/* Whoever has won, takes all cards, including tiebreaker. */

					if (drawSolved != true) {

 						if (tieDiff > 0) {
				
							while (!(tiePile.isEmpty())) {

								Card newCard = tiePile.popCard();
								p1.addCard(newCard);

							}

							drawSolved = true;
				
						}
					}
					
					if (drawSolved != true) {
				
						if (tieDiff < 0) {
				
							while (!(tiePile.isEmpty())) {

								Card newCard = tiePile.popCard();
								p2.addCard(newCard);

							}

							drawSolved = true;
				
						}
					}

				} // While loop 
				
			} // Else

		}
			
		endHandler(p1, p2);
		
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
