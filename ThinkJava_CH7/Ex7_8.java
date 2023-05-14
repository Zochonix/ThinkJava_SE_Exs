import java.util.Arrays;

/**
*
* A solution class for the final part of exercise 7. (7.8)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex7_8 {

	/**
	*
	* Creates variables and prints the result of the method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		String wordOne = "bob";
		String wordTwo = "obb";
		Boolean areEqual = false;
		
		areEqual = areAnagrams(wordOne, wordTwo);
		
		if (areEqual) {
			
			System.out.println(wordOne + " and " + wordTwo + " are anagrams.");
			
		}
		
		if (!(areEqual)) {
			
			System.out.println(wordOne + " and " + wordTwo + " are not anagrams.");
			
		}
		
	}

	/**
	*
	* Returns a boolean that indicates whether two words are anagrams or not.
	*
	* @param wordOne First word.
	* @param wordTwo Second word.
	* @return A boolean value indicating whether two words are anagrams or not.
	*
	*/
	
	public static boolean areAnagrams(String wordOne, String wordTwo) {
		
		int[] histOne = letterHist(wordOne);
		int[] histTwo = letterHist(wordTwo);
		
		if (Arrays.equals(histOne, histTwo)) {
			
			return true;
			
		}
		
		return false;
		
	}

	/**
	*
	* Creates a histogram for each word received.
	*
	* @param input The given string to be converted to a histogram.
	* @return An integer array that represents a histogram for each word.
	*
	*/
	
	public static int[] letterHist(String input) {
		
		input = input.toLowerCase();
		
		int[] numberOfCharacters = new int[26];
		
		for (int i = 0; i < input.length(); i++) {
			
			char letter = input.charAt(i);
			int index = letter - 'a';
			numberOfCharacters[index]++;
			
		}
		
		return numberOfCharacters;
		
	}

}
