import java.util.Scanner;

/**
*
* A solution class for the final part of exercise 6. (6.6)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex6_6 {

	/**
	*
	* Creates variables to store values for the program and prints the final result. 
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Create variables to store tiles for the scrabble game and the word
		   that we want to see if we can make using the tiles. Also create a
		   scanner object to take user input. */
		
		String tiles;
		String word;
		Boolean wordInString;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, please enter some letters:");
		tiles = input.nextLine();
		
		System.out.println("Thank you! Now please enter a word:");
		word = input.nextLine();
		
		wordInString = isWordInString(word, tiles);
		
		if (wordInString) {
			
			System.out.println(word + " can be made from the following letters: " + tiles);
			
		}
		
		if (!(wordInString)) {
			
			System.out.println(word + " cannot be made from the following letters: " + tiles);
			
		}
		
		input.close();
		

	}

	/**
	*
	* Loops through a given word, and counts the number of times each letter is
	* present in both the word itself and the tiles. If a letter appears more times
	* in the word than the tiles, return false otherwise return true.
	*
	* @param word The word that we want to make from the tiles.
	* @param tiles The letters which we can use to potentially make the word.
	* @return A true/false value indicating whether the word can be made from the given tiles.
	*
	*/
	
	public static boolean isWordInString(String word, String tiles) {
			
		// Loop through the word
		
		for (int i = 0; i < word.length(); i++) {
			
			// Obtain the current letter of the word
			
			String currentLetterInWord = word.substring(i, i + 1);
			
			// Setup variables to store letter occurence numbers.
			
			int letterOccurences_word = 0;
			int letterOccurences_comp = 0;
			
			letterOccurences_word = countOccurences(currentLetterInWord, word);
			letterOccurences_comp = countOccurences(currentLetterInWord, tiles);
			
			if (letterOccurences_word > letterOccurences_comp) {
				
				return false;
				
			}
			
		}
			
		return true;
		
	}

	/**
	*
	* Loops through a given word, and counts the number of times each letter appears.
	*
	* @param letter The letter which is being counted
	* @param word The word which is being searched through.
	* @return An integer containing the number of times the letter appears in the word
	*
	*/
	
	public static int countOccurences(String letter, String word) {
		
		// Count the number of times letter is in a word.
		
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			
			String compLetter = word.substring(i, i + 1);
			
			if (letter.equals(compLetter)) {
				
				count++;
				
			}
			
		}
		
		return count;
		
	}

}
