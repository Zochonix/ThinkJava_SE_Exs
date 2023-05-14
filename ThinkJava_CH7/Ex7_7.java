/**
*
* A solution class for the seventh part of exercise 7. (7.7)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex7_7 {

	/**
	*
	* Creates a string and sends it to letterHist
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		String word = "apple";
		
		letterHist(word);

	}

	/**
	*
	* Returns a histogram of all the letters in the string.
	*
	* @param input A string 
	* @return A int array that stores all the counts of each letter in the string.
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
