// Import the Java scanner class.

import java.util.Scanner;

public class Ex6_6 {

	public static void main(String[] args) {
		
		// Setup variables to handle input
		
		String tiles; // Store the string to be used for tiles
		String word; // Store the string to be used for the word to be made
		Boolean wordInString; // Holds the condition for whether the word can be made from the tiles or not.
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
	
	public static boolean isWordInString(String word, String comparator) {
			
		// Loop through the word
		
		for (int i = 0; i < word.length(); i++) {
			
			// Obtain the current letter of the word
			
			String currentLetterInWord = word.substring(i, i + 1);
			
			// Setup variables to store letter occurence numbers.
			
			int letterOccurences_word = 0;
			int letterOccurences_comp = 0;
			
			letterOccurences_word = countOccurences(currentLetterInWord, word);
			letterOccurences_comp = countOccurences(currentLetterInWord, comparator);
			
			if (letterOccurences_word > letterOccurences_comp) {
				
				return false;
				
			}
			
		}
			
		return true;
		
	}
	
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
