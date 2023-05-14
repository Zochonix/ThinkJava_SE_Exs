package ex3solutions;

// Import the scanner class.

import java.util.Scanner;

/**
*
* Solution class for the second part of exercise 3. (3.2)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex3_2 {

	/**
	*
	* Converts a specified Celsius value to it's equivalent Fahrenheit value.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Firstly, declare two variables to store the celsius value and the new
		   fahrenheit value that will be calculated. Also, create a new
		   scanner object. */
		
		double enteredCelsiusValue, calculatedFahrenheitValue;
		Scanner inputScanner = new Scanner(System.in);
		
		/* Ask the user to enter a temperature in celsius and then
		   store the value in the specified variable. */
		
		System.out.print("Enter a temperature in Celsius: ");
		enteredCelsiusValue = inputScanner.nextDouble();
		
		/* Use the new variable with the celsius to fahrenheit formula
		   to calculate the new fahrenheit value. */
		
		calculatedFahrenheitValue = enteredCelsiusValue * 9/5 + 32;
		
		/* Print out the final value in a formatted string, allowing for only
		   one decimnal place. */
		
		System.out.printf("%.1f C = %.1f F", enteredCelsiusValue, calculatedFahrenheitValue);
		
		// Close the scanner.
		
		inputScanner.close();
		
	}

}
