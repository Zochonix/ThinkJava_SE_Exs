public class Card {
	
	private final int rank;
	private final int suit;
	
	public Card(int rank, int suit) {
		
		this.rank = rank;
		this.suit = suit;
		
	}
	
	public Card[] makeDeck() {
		
		Card[] cards = new Card[52]; // 0 to 51 references to Card objects within an array.
		int index = 0;
		
		for (int suit = 0; suit <= 3; suit++) {
			
			for (int rank = 1; rank <= 13; rank++) {
				
				cards[index] = new Card(rank, suit);
				index++;
				
			}
			
		}
		
		return cards;
		
	}
	
	public int[] suitHist(Card[] cards) {
		
		int[] histogram = new int[4];
		
		for (Card card : cards) {
			
			if (card.suit == 0) {
				
				histogram[0]++;
				
			}
			
			if (card.suit == 1) {
				
				histogram[1]++;
				
			}

			if (card.suit == 2) {
				
				histogram[2]++;
				
			}
			
			if (card.suit == 3) {
				
				histogram[3]++;
				
			}
			
		}
		
		return histogram;
		
	}
	
	public boolean hasFlush(Card[] cards) {
		
		int[] histogram = new int[4]; // integer array with 4 empty elements that will represent each suit
		
		for (Card card : cards) {
			
			if (card.suit == 0) {
				
				histogram[0]++;
				
			}
			
			if (card.suit == 1) {
				
				histogram[1]++;
				
			}

			if (card.suit == 2) {
				
				histogram[2]++;
				
			}
			
			if (card.suit == 3) {
				
				histogram[3]++;
				
			}
			
		}
		
		for (int numberOfSuit : histogram) {
			
			if (numberOfSuit >= 5) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public int getSuit() {
		
		return this.suit;
		
	}
	
	public int getRank() {
		
		return this.rank;
		
	}
	
	public String toString() {
		
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		String s = ranks[this.rank]+ " of " + suits[this.suit]; 
		
		return s;
		
	}
	
	public boolean equals(Card that) {
		
		return this.rank == that.rank && this.suit == that.suit;
		
	}
	
	public int compareTo(Card that) {
		
		if (this.suit < that.suit) {
			
			return -1;
			
		}
		
		if (this.suit > that.suit) {
			
			return 1;
			
		}

		if (this.rank < that.rank) {
			
			return -1;
			
		}
		
		if (this.rank > that.rank) {
			
			return 1;
			
		}
		
		return 0;
		
	}

}