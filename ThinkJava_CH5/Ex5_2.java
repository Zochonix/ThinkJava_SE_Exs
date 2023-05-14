package ex5solutions;

import java.util.Random;
import java.util.Scanner;

/**
*
* A solution class for the second part of exercise 5. (5.2)
*
* @author Kane Kennedy
* @version 1.0
*
*/
 
public class Ex5_2 {

	/**
	*
	* Sets the variables for the game and the number of attempts.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {

		
		/* Create the required variables to store the input from the user and the
		   randomly generated value from the Random class. Create a scanner object
		   to read user input. */
				
		int attempts, enteredNumber, randomNumber;
		Scanner inputScanner = new Scanner(System.in);
		enteredNumber = 0;
		randomNumber = 0;
		attempts = 0;
		
		inputNumber(attempts, enteredNumber, randomNumber, inputScanner);
		
	}

	/**
	*
	* Asks the user to enter a number and generates a random number for the game.
	*
	* @param attempts The number of attempts at the game the user has remaining.
	* @param enteredNumber The number that the user enters.
	* @param randomNumber The random number generated from the Random instance.
	* @param inputScanner The nscanner object, used to read user input.
	*
	*/
	
	public static void inputNumber(int attempts, int enteredNumber, int randomNumber,
	Scanner inputScanner) {
		
		
		// Tell the user the aim of the game and ask them to enter a number.
		
		System.out.println("I'm thinking of a number between 1 and 100 (including both).");
		System.out.println("Can you guess what it is?");
		System.out.print("Enter a number: ");

		/* Store the input from the user in the variable and increase the
		   number of attempts they have used. */

		enteredNumber = inputScanner.nextInt();
		attempts = attempts + 1;

		// Generate the random number using a Random instance.

		Random randomInstance = new Random();
		randomNumber = randomInstance.nextInt(100) + 1;

		// Call the checkNumber method, with the int, Scanner and Random variables.
		
		checkNumber(enteredNumber, randomNumber, attempts, inputScanner);
		
	}

	/**
	*
	* Compares the number enetered by the user to the random number.
	*
	* @param enteredNumber The number that the user enters.
	* @param randomNumber The random number generated from the Random instance.
	* @param attempts The number of attempts at the game the user has remaining.
	* @param inputScanner The scanner object, used to read user input.
	*
	*/

	public static void checkNumber(int enteredNumber, int randomNumber, int attempts, Scanner inputScanner) {
		
		/* Compute the difference between the user input and
		   the number that was generated. Storing the result inside a
		   new variable */
		
		int difference = randomNumber - enteredNumber;

		/* If the difference between the stored numbers is nil,
		   inform the user that they have won the game and display the numbers stored. 
		   Otherwise inform the user they are incorrect, display the stored values,
		   and make clear how far out they were from the correct value. Afterwards
		   the program asks the user to try again if they have not used all attempts.
		   If all attempts are used, the user is forced out of the game. */
		
		if (difference == 0) {
			
			System.out.println("Your guess is: " + enteredNumber);
			System.out.println("The number I was thinking of is: " + randomNumber);
			System.out.println("Congratulations, you won!");
			inputScanner.close();
			
		}
		
		else if (difference != 0) {
			
			System.out.println("Your guess is: " + enteredNumber);
			System.out.println("The number I was thinking of is: " + randomNumber);
			System.out.println("You were out by: " + difference);
			
			if (attempts == 3) {
				
				System.out.println("You have used up all of your attempts! Better luck next time.");
				inputScanner.close();
				
			}
			
			else if (attempts < 3) {
				
				System.out.println("Try again");
				inputNumber(attempts, enteredNumber, randomNumber, inputScanner);
				
			}
			
		}
		
	}

}