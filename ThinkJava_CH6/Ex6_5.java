import java.util.Scanner;

/**
*
* A solution class for the fifth part of exercise 6. (6.5)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex6_5 {

	/**
	*
	* Creates variables to store values for the program and prints the final result.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Create a boolean to suggest doubloon state, also create
		   a scanner object for input. */
		
		Boolean isDoubloon; // Holds the condition for whether the word is doubloon or not. 
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter a string.
		
		System.out.println("Please enter a word:");
		String word = input.nextLine();
		
		// Call the doubloon method.
		
		isDoubloon = isDoubloon(word.toLowerCase());
		
		if (!(isDoubloon)) {
			
			System.out.println("Therefore, " + word + " is not a doubloon.");
			
		}
		
		else {
			
			System.out.println("Therefore, " + word + " is a doubloon.");
			
		}
		
		input.close();

	}

	/**
	*
	* Loop through a word and identify the number of times a letter appears in the
	* word. If twice or more, return false. Otherwise the function will return
	* true.
	*
	* @param word The word given by the user to analyse.
	* @return A true/flase value indicating whether the word is a doubloon or not.
	*
	*/
	
	public static boolean isDoubloon(String word) {
		
		/* Iterate through the string and store each letter consecutively,
		   then loop through the word again and count the number of times the stored
		   letter appears in the word. */
		
		int letterCount = 0;
				
		for (int i = 0; i < word.length(); i++) {
					
			// Obtain the current letter of the word.
			
			String currentLetter = word.substring(i, i + 1);
			System.out.println("The letter currently being examined is: " + currentLetter);
			letterCount = 0;
			
			// Do a 2nd loop
			// Count how many times the letter is in the word.
			
			for (int j = 0; j < word.length(); j++) {
				
				String compLetter = word.substring(j, j + 1);
				
				if (currentLetter.equals(compLetter)) {
					
					letterCount++;
					System.out.println(currentLetter + " matches with " + compLetter);
					
				}
				
				else {
					
					System.out.println(currentLetter + " does not match with " + compLetter);
					
				}
				
				if (j == word.length() - 1) {
				
					System.out.println("Number of matches for " + currentLetter + " = " + letterCount);
					
				}
				
				if (j == word.length() - 1 && letterCount != 2) {
					
					return false;
					
				}
				
			}
			
		}
		
		// If no letter returns false...
		
		return true;
		
	}

}
