// Import the required scanner class.

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		
		// Firstly, declare two variables to store the
		// celsius value and the new fahrenheit value
		// that will be calculated. Also declare a new scanner instance.
		
		double enteredCelsiusValue, calculatedFahrenheitValue;
		Scanner inputScanner = new Scanner(System.in);
		
		// Then, ask the user to enter a temperature in Celsius.
		// Store the value in the right variable.
		
		System.out.print("Enter a temperature in Celsius: ");
		enteredCelsiusValue = inputScanner.nextDouble();
		
		// Use the new variable with the celsius to fahrenheit formula
		// to calculate the new fahrenheit value.
		
		calculatedFahrenheitValue = enteredCelsiusValue * 9/5 + 32;
		
		// Print out the final value in a formatted string, allowing for only
		// one decimnal place.
		
		System.out.printf("%.1f C = %.1f F", enteredCelsiusValue, calculatedFahrenheitValue);
		
		// Close the scanner.
		
		inputScanner.close();
		
	}

}
