// Import the required classes.

import java.util.Scanner;
import java.util.Random;

public class Ex3_4 {

	public static void main(String[] args) {
		
		// Declare the required integer variables
		// to store the user's guess and the randomly
		// generated guess as well as the difference
		// between the two numbers.
		
		int enteredNumber, randomNumber, difference;
		Scanner inputScanner = new Scanner(System.in);
		Random randomInstance = new Random();
		randomNumber = randomInstance.nextInt(100) + 1;
		
		// Tell the user the aim of the game and to enter a number.
		
		System.out.println("Am thinking of a number between 1 and 100");
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
