public class SmartPlayer extends Player {

	public SmartPlayer(String name) {

		super(name);

	}

	@Override
	public Card play(Eights eights, Card prev) {

		/* The Smart Player class will play an 8 if possible otherwise they will play the highest ranked card in their hand. If they cannot do either then they will draw until a card is available to play. */

		Card card = searchForMatch(prev);

			if (card == null) {

				card = drawForMatch(eights, prev);
	
			}

		return card;

	}

	@Override	
	public Card searchForMatch(Card prev) {

		Card[] possibleCards = new Card[hand.size()];

			for (int i = 0; i < hand.size(); i++) {

				Card card = hand.getCard(i);

				if (cardMatches(card, prev)) {

					possibleCards[i] = card;
					System.out.println(card.toString());

				}

			}

			Card cardToReturn = new Card(0, 0);
			int position = -1;

			for (int j = 0; j < possibleCards.length; j++) {

				if (possibleCards[j] != null) {

					if (possibleCards[j].getRank() > cardToReturn.getRank()) {

						cardToReturn = possibleCards[j];
						position = j;

					}

					if (possibleCards[j].getRank() == 8) {

						return hand.popCard(j);

					}

				}

				if (j == possibleCards.length - 1 && position != -1) {

					return hand.popCard(position);

				}
		
			}

		return null;

	}

}