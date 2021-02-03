// Import Required Classes

import java.util.Scanner;

public class Ex6_4 {

	public static void main(String[] args) {
		
		// Setup variables to handle input and check for abecedarianality
		
		String word;
		Boolean isAbecedarian;
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter a string.
		
		System.out.println("Please enter a string:");
		word = input.nextLine();
		
		// Confirm input.
		
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
