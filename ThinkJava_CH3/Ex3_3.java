package ex3solutions;

// Import the scanner class.

import java.util.Scanner;

/**
*
* Solution class for the third part of exercise 3. (3.3)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex3_3 {

	/**
	*
	* Converts a specified number of seconds, into hours, minutes and
	* remaining seconds.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Declare primitive integer variables to store the amount of seconds that
		   that the user will enter as well as for the final converted values. Also
		   create a scanner object to read user input. */
		
		int seconds, newSeconds, minutes, hours;
		Scanner inputScanner = new Scanner(System.in);
		
		/* Ask the user to enter a number of seconds,
		   then store this value in the declared variable. */
		
		System.out.println("Hello, please enter a certain number of seconds:");
		seconds = inputScanner.nextInt();
		
		/* Obtain the right values for the variables using integer division and the
		   remainder operator. */
		
		hours = seconds / 3600;
		minutes = (seconds % 3600) / 60;
		newSeconds = (seconds % 3600) % 60; 
		
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds",
 seconds, hours, minutes, newSeconds);
		
		inputScanner.close();

	}

}
