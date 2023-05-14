package ex5solutions;

import java.util.Scanner;

/**
*
* A solution class for the final part of exercise 5. (5.7)
*
* @author Kane Kennedy
* @version 1.0
*
*/


public class Triangle {

	/**
	*
	* Starts the program and calls the receiveInput method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		// Call the receiveInput method.
		
		receiveInput();

	}

	/**
	*
	* Collects integer values from the user, which are then validated.
	* 
	*/
	
	public static void receiveInput() {
		
		/* Create variables to store the required information and create an instance
		   of the Scanner class to receive user input */
		
		Scanner userInput = new Scanner(System.in);
		int a, b, c;
		
		// Ask the user to enter 3 integer values.
		
		System.out.println("Please enter 3 integers.");
		System.out.println();
		
		/* Call the checkType function to make sure that the user inputs are the
		   correct data type, in this case they should be doubles. */
		
		System.out.print("Enter your 1st number: ");
		a = checkType(userInput);
		if ( a == Integer.MIN_VALUE ) { return; }

		System.out.print("Enter your 2nd number: ");
		b = checkType(userInput);
		if ( b == Integer.MIN_VALUE ) { return; }
		
		System.out.print("Enter your 3rd number: ");
		c = checkType(userInput);
		if ( c == Integer.MIN_VALUE ) { return; }
		
		// Ensure that they are positive integers.
		
		checkRange(a, b, c);
		
	}

	/**
	*
	* Validates user input. Confirms whether the input is a integer value or not.
	*
	* @param userInput The integer value that is received from the user.
	*
	* @return An integer specifying whether the method has finished
	* executing or not, or is the validated user input.
	*
	*/
	
	public static int checkType(Scanner userInput) {
		
		/* Use the hasNextInt function to confirm that the next token is
		   an int value. If this is not the case, then the program informs the user
		   and goes back to the receiveInput function, where the code is executed
		   again until they enter appropriate values. When they have the program
		   returns a special value to finish execution of the method. */
		
		int value;
		
		if (!userInput.hasNextDouble()) {
			
			String input = userInput.next();
			System.out.println();
			System.out.println(input + " is not a valid input, you have to enter an integer value.");
			System.out.println();
			receiveInput();
			
		}

		else {

			value = userInput.nextInt();
			return value;

		}

		return Integer.MIN_VALUE;
		
	}

	/**
	*
	* Validates input. Confirms whether the entered values are negative or not.
	*
	* @param a An integer value that is entered by the user.
	* @param b An integer value that is entered by the user.
	* @param c An integer value that is entered by the user.
	*
	*/
	
	public static void checkRange(int a, int b, int c) {
		
		// Make sure the parameters are all positive by using an OR operation.
		
		if (a < 0 || b < 0 || c < 0) {
			
			System.out.println("Error: Value(s) entered that are less than 0.");
			System.out.println("Solution: Input values which are more than 0. Cheers.");
			receiveInput();
			
		}
		
		else {
			
			testInputs(a, b, c);
			
		}

	return;
		
	}

	/**
	*
	* Uses a certain expression to confirm whether 3 integers can form a triangle
	* or not.
	*
	* @param a An integer value that is entered by the user.
	* @param b An integer value that is entered by the user.
	* @param c An integer value that is entered by the user.
	*
	*/
	
	public static void testInputs(int a, int b, int c) {
		
		// Check to see if two sides of the triangle are shorter than the other.
		
		if (a + b < c || b + c < a || a + c < b) {
			
			System.out.println("You cannot form a triangle with the given lengths.");
			
		}
		
		else {
			
			System.out.println("You can form a triangle.");
			
		}
		
	}

}
