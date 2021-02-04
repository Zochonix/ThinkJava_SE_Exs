// Import the Java scanner class.

import java.util.Scanner;

public class Ex6_5 {

	public static void main(String[] args) {
		
		// Setup variables to handle input and check for doubloonality
		
		String word; // Store the word the user enters.
		Boolean isDoubloon; // Holds the condition for whether the word is doubloon or not. 
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter a string.
		
		System.out.println("Please enter a word:");
		word = input.nextLine();
		
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
	
	public static boolean isDoubloon(String word) {
		
		// Iterate through the string
		// Get the current letter
		// Loop through the word again
		
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
