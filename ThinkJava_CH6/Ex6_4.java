// Import Required Classes

import java.util.Scanner;

public class Ex6_4 {

	public static void main(String[] args) {
		
		String word;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string:");
		word = input.next(); // Is this the right way to obtain the input?
		
		// Verify input
		
		// Check abecderianality
		
		isAbecderian(word);
		
		// Close the input.
		
		input.close();
		
	}
	
	public static void isAbecderian(String word) {
		
		// An abecdertian word has its letters be in an alphabetical order.
		
	}

}
