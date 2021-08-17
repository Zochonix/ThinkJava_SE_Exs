public class Tile {
		
	private char letter;
	private int value;
	
	public Tile(char letter, int value) {
		
		this.letter = letter;
		this.value = value;
		
	}
	
	public void printTile(Tile tile) {
		
		System.out.println("The letter on this tile is: " + tile.letter);
		System.out.println("The letter on this tile is: " + tile.value);
		
	}
	
	public char getLetter() {
		
		return this.letter;
		
	}
	
	public int getValue() {
		
		return this.value;
		
	}
	
	public void setLetter(char letter) {
		
		letter = this.letter;
		
	}
	
	public void setValue(int value) {
		
		value = this.value;
		
	}
	
	public String toString() {
		
		return letter + ":" + value;
		
	}
	
	public boolean equals(Tile that) {
		
		return ((this.letter == that.letter) &&
				(this.value == that.value)); 
		
	}

}
