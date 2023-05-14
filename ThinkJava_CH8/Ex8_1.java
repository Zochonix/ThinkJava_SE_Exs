/**
*
* A solution class for the first part of exercise 8. (8.1)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex8_1 {

	/**
	*
	* Creates primitive and calls the method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int numOfBottles = 99;
		
		printBeerBottles(numOfBottles);

	}

	/**
	*
	* Uses recursion to print the lyrics to a song.
	*
	* @param numOfBottles The number of lyrics to be printed.
	*
	*/
	
	public static void printBeerBottles(int numOfBottles) {
		
		// The base case. It is triggered when there are no more bottles left.
		
		if (numOfBottles == 0) {
			
			System.out.println("No bottles of beer on the wall, no bottles of beer,"
					+ "ya' can't take one down, ya' can't pass it around, 'cause"
					+ "there are no more bottles of beer on the wall!");
			
		}
		
		else {
			
			System.out.println(numOfBottles + " bottles of beer on the wall, " 
			+ numOfBottles + " bottles of beer, ya' take one down, ya' pass it around,");
			numOfBottles = numOfBottles - 1;
			System.out.println(numOfBottles + " bottles of beer on the wall.");
			printBeerBottles(numOfBottles);
			
		}
		
	}

}
