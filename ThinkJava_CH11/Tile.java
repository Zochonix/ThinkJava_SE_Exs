/**
*
* Class representing a Scrabble tile. (11.2)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Tile {

	// Create instance variables to store the letter and value of each tile.
		
	private char letter;
	private int value;

	/**
	*
	* Tile constructor. Creates a Tile object with a given letter and value.
	*
	* @param letter A character that will be used to represent the tile.
	* @param value The value of the tile with relation to the rules of Scrabble.
	*
	*/
	
	public Tile(char letter, int value) {
		
		this.letter = letter;
		this.value = value;
		
	}

	/**
	*
	* Prints the values of the Tile object to the console.
	*
	* @param tile A Tile object.
	*
	*/
	
	public void printTile(Tile tile) {
		
		System.out.println("The letter on this tile is: " + tile.letter);
		System.out.println("The value of this tile is: " + tile.value);
		
	}

	/**
	*
	* Returns the letter of the given tile.
	*
	* @return A char value, representing the tile' letter.
	*
	*/
	
	public char getLetter() {
		
		return this.letter;
		
	}

	/**
	*
	* Returns the value of the given tile.
	*
	* @return An integer value, representing the tile' value.
	*
	*/
	
	public int getValue() {
		
		return this.value;
		
	}

	/**
	*
	* Sets the letter of the given tile.
	*
	* @param letter A char value, representing the new letter for the tile.
	*
	*/
	
	public void setLetter(char letter) {
		
		letter = this.letter;
		
	}

	/**
	*
	* Sets the value of the given tile.
	*
	* @param value An integer value, representing the tile' new value.
	*
	*/
	
	public void setValue(int value) {
		
		value = this.value;
		
	}

	/**
	*
	* Returns a string representation of the Tile object
	*
	* @return An string, stating the letter and value of the Tile.
	*
	*/
	
	public String toString() {
		
		return letter + ":" + value;
		
	}

	/**
	*
	* Returns the equality state of two Tile objects.
	*
	* @param that The Tile object that will be compared to the first.
	* @return A boolean value, representing the two Tile are equal or not.
	*
	*/
	
	public boolean equals(Tile that) {
		
		return ((this.letter == that.letter) &&
				(this.value == that.value)); 
		
	}

}
