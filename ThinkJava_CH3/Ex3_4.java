package ex3solutions;

// Import the required classes.

import java.util.Scanner;
import java.util.Random;

/**
*
* Solution class for the final part of exercise 4. (3.4)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex3_4 {

	/**
	*
	* Takes an integer primitive from the user and computes the difference
	* between their input and a randomly generated number.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Declare the required primitive integers to store the input from the user
		   as well as the randomly generated value from the Random class. There must
		   also be a primitive to store the difference between the previous values */
		
		int enteredNumber, randomNumber, difference;
		Scanner inputScanner = new Scanner(System.in);
		Random randomInstance = new Random();
		randomNumber = randomInstance.nextInt(100) + 1;
		
		// Tell the user the objective of the game and ask them to enter a number.
		
		System.out.println("Im thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		
		System.out.print("Enter a number: ");
		enteredNumber = inputScanner.nextInt();
		
		// Compute the difference.
		
		difference = randomNumber - enteredNumber;
		
		// Print out the gathered information.
		
		System.out.println("Your guess is: " + enteredNumber);
		System.out.println("The number I was thinking of is: " + randomNumber);
		System.out.println("You were out by: " + difference);
		
		// Close the scanner.
		
		inputScanner.close();

	}

}
