import java.util.Scanner;

/**
*
* A solution class for the fourt part of exercise 6. (6.4)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex6_4 {

	/**
	*
	* Creates variables to store values for the program and prints the result.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Create a boolean to confirm whether the input is abecedarian and a
		   scanner to read user input. */
		
		Boolean isAbecedarian;
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter a string.
		
		System.out.println("Please enter a string:");
		String word = input.nextLine();
		
		// Confirm their input.
		
		System.out.println("The word you have entered is: " + word);
		
		// Assign the boolean with the result returned from the method call.
		
		isAbecedarian = isAbecedarian(word);
		
		// If false, say it isn't abecedarian
		
		if (!isAbecedarian) {
			
			System.out.println(word + " is not abecedarian.");
			
		}
		
		// If true, say it is abecedarian.
		
		else if (isAbecedarian) {
			
			System.out.println(word + " is abecedarian.");
			
		}
		
		// Close the input.
		
		input.close();
		
	}

	
	/**
	*
	* Verify that the enmtered input is abecedarian by comparing the unicode for
	* each letter in the input.
	*
	* @param word Input that is given by the user
	* @return A true/false value indicating whether the ionput is abecedarian
	* or not.
	*
	*/
	
	public static boolean isAbecedarian(String word) {
		
		// Iterate through the string
		// Check each letter by using the substring method with a comparison.
		
		for (int i = 0; i < word.length() - 1; i++) {
			
			String currentLetter = word.substring(i, i + 1);
			String nextLetter = word.substring(i + 1, i + 2);
			int diff = currentLetter.compareTo(nextLetter);
			
			// If positive, not abecedarian.
			// If negative, abecedarian.
			
			System.out.println(currentLetter + " " + nextLetter);
			
			if (diff > 0) {
				
				return false;
				
			}
			
			// When at the final two letters, return true to prevent crashing.
			
			else if (i == word.length() - 2) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

}
