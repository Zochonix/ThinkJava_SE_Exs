/**
*
* Class representing a Card object. (12)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Card {
	
	private final int rank;
	private final int suit;

	/**
	*
	* Value Card constructor. Creates a Card object with a given rank and suit.
	*
	* @param rank The rank of the new Card object.
	* @param suit The suit for the new Card object.
	*
	*/
	
	public Card(int rank, int suit) {
		
		this.rank = rank;
		this.suit = suit;
		
	}
	
	// Ex12_1

	/**
	*
	* Creates an array full of populated Card objects.
	*
	* @return A new array containing a fully populated arrays of Card objects.
	*
	*/
	
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
	
	// Ex12_3

	/**
	*
	* Returns a histogram of the suits in the array of Card objects.
	*
	* @param cards An array of Card objects.
	* @return Returns a histogram of the suits in the array.
	*
	*/
	
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

	/**
	*
	* Returns a boolean value indicating whether there is a flush in the hand of cards or not.
	*
	* @param cards An array of Card objects.
	* @return A true/flase value indicating the existence of a flush or not.
	*
	*/
	
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

	/**
	*
	* Returns the suit of the Card object.
	*
	* @return The suit of the Card object.
	*
	*/
	
	public int getSuit() {
		
		return this.getSuit();
		
	}

	/**
	*
	* Returns the rank of the Card object.
	*
	* @return The rank of the Card object.
	*
	*/
	
	public int getRank() {
		
		return this.getRank();
		
	}

	/**
	*
	* Returns a string stating the rank and suit of the Card object.
	*
	* @return A string stating the rank and suit of the given Card object.
	*
	*/
	
	public String toString() {
		
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		String s = ranks[this.rank]+ " of " + suits[this.suit]; 
		
		return s;
		
	}

	/**
	*
	* Returns the equality state of two Card objects.
	*
	* @return A true/flase value, indicating whether the two Card objects are equal or not.
	*
	*/
	
	public boolean equals(Card that) {
		
		return this.rank == that.rank && this.suit == that.suit;
		
	}

	/**
	*
	* Compares two Card objects and returns a value indicating which is a higher rank.
	*
	* @return A number indicating whether two Card objects are equal or not.
	*
	*/
	
	public int compareTo(Card that) {
		
		if (this.suit < that.suit) {
			
			return -1;
			
		}
		
		if (this.suit > that.suit) {
			
			return 1;
			
		}
		
		// Ex12_2 - Ace is always bigger than the king.
		
		if (this.rank == 1) {
			
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