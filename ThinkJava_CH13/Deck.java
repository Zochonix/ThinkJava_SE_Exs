import java.util.Random;

public class Deck {
	
	private static final Random RANDOM = new Random();
	private Card[] cards;
	
	public Deck() {
		
		this.cards = new Card[52];
		
		int index = 0;
		
		for (int suit = 0; suit <= 3; suit++) {
			
			for (int rank = 1; rank <= 13; rank++) {
				
				this.cards[index] = new Card(rank, suit);
				index++;
				
			}
			
		}
		
	}
	
	public Deck(int n) {
		
		this.cards = new Card[n];
		
	}
	
	public Card[] getCards() {
		
		return this.cards;
		
	}

	public void print() {
		
		for (Card card : this.cards) {
			
			System.out.println(card);
			
		}
		
	}
	
	public void shuffle() {
		
		int randomNumber = -1;
		
		for (int i = 0; i < this.cards.length - 1; i++) {
			
			randomNumber = randomInt(i, this.cards.length - 1);
			swapCards(i, randomNumber);
			
		}
		
	}
	
	private static int randomInt(int low, int high) {
		
		int randomNumber = -1;
		
		while ((randomNumber < low) || (randomNumber > high)) {
			
			randomNumber = RANDOM.nextInt(high);
			
		}
		
		return randomNumber;
		
	}
	
	private void swapCards(int i, int j) {
		
		Card tempCard = new Card(this.cards[i].getRank(), this.cards[i].getSuit());
		
		this.cards[i] = this.cards[j];
		this.cards[j] = tempCard;
		
	}
	
	public void selectionSort() {
		
		int lowestCardIndex = -1;
		
		for (int i = 0; i < this.cards.length - 1; i++) {
			
			lowestCardIndex = indexLowest(i, this.cards.length - 1);
			swapCards(i, lowestCardIndex);
			
		}
		
	}
	
	private int indexLowest(int low, int high) {
		
		// Find the lowest ranked card in a given range in the deck
		
		//Index of lowest = 0, index of highest = 51
		
		int lowestCardIndex = -1;
		
		for (int i = low; i < high; i++) {
			
			// On the 1st iteration, set the lowestCardIndex.
			
			if (lowestCardIndex == -1) {
				
				lowestCardIndex = i;
				
			}
			
			else if (this.cards[i].compareTo(this.cards[i + 1]) == -1) {
				
				if (this.cards[i].compareTo(this.cards[lowestCardIndex]) == -1) {
					
					lowestCardIndex = i;
					
				}
				
			}
			
		}
		
		return lowestCardIndex;
		
	}
	
	public Deck subdeck(int low, int high) {
		
		Deck sub = new Deck(high - low + 1);
		
		for (int i = 0; i < sub.cards.length; i++) {
			
			sub.cards[i] = this.cards[low + i];
			
		}
		
		return sub;
		
	}
	
	private static Deck merge(Deck d1, Deck d2) {
		
		Deck mergedDeck = new Deck();
		
		int i = 0;
		int j = 0;
		
		for (int k = 0; k < mergedDeck.cards.length; k++) {
			
			// If d1 deck is empty, use top card from d2
			
			if (i == d1.cards.length) {
				
				mergedDeck.cards[k] = d2.cards[j];
				j++;
				
			}
			
			// If d2 deck is empty, use top card from d1
			
			else if (j == d2.cards.length) {
				
				mergedDeck.cards[k] = d1.cards[i];
				i++;
				
			}
			
			// Otherwise, compare both and return lowest
			
			else {
				
				if (d1.cards[i].compareTo(d2.cards[j]) == -1) {
					
					mergedDeck.cards[k] = d1.cards[i];
					i++;
					
				}
				
				else if (d2.cards[j].compareTo(d1.cards[i]) == -1) {
					
					mergedDeck.cards[k] = d2.cards[j];
					j++;
					
				}
				
			}
			
		}
		
		return mergedDeck;
		
	}
	
	public Deck almostMergeSort() {
		
		int count = 0;
		
		for (int i = 0; i < this.cards.length - 1; i++) {
			
			count++;
			
		}
		
		int separator = RANDOM.nextInt(count);
		
		Deck sub1 = this.subdeck(0, separator);
		Deck sub2 = this.subdeck(separator + 1, count);
		
		sub1.selectionSort();
		sub2.selectionSort();
		
		Deck mergedDeck = merge(sub1, sub2);
		
		return mergedDeck;
		
	}
	
	public Deck mergeSort() {

		
		if (this.cards.length == 1 || this.cards.length == 0) {
			
			return this;
			
		}
		
		Deck sub1 = this.subdeck(0, this.cards.length / 2);
		Deck sub2 = this.subdeck(this.cards.length + 1, this.cards.length);
		
		sub1.mergeSort();
		sub2.mergeSort();
		
		return merge(sub1, sub2);
		
	}
	
	private void insert(Card cardToBeInserted, int currentLocation) {
		
		while (currentLocation > 0 && this.cards[currentLocation - 1].compareTo(cardToBeInserted) == 1) {
			
			this.cards[currentLocation] = this.cards[currentLocation - 1];
			currentLocation = currentLocation - 1;
			
		}
		
		this.cards[currentLocation] = cardToBeInserted;
		
	}
	
	public void insertionSort() {
		
		for (int i = 1; i < this.cards.length; i++) {
			
			Card cardToBeInserted = this.cards[i];
			
			insert(cardToBeInserted, i);
			
		}
		
	}

	public String toString() {
		
		StringBuilder deckContents = new StringBuilder();
		
		int index = 0;
		
		for (Card card : this.cards) {
			
			deckContents.append(card);
			index++;
			
			if (index != this.cards.length) {
				
				deckContents.append('\n');
				
			}
			
		}
		
		return deckContents.toString();
		
	}
	
}


















