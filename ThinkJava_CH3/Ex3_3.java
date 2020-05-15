// Import the required scanner class.

import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		
		// Declare an int variable to store the amount of seconds
		// that the user enters and create a new scanner.
		
		int seconds, newSeconds, minutes, hours;
		Scanner inputScanner = new Scanner(System.in);
		
		// Ask the user to enter a number of seconds
		// then store this number in the required variable.
		
		System.out.println("Hello, please enter a certain number of seconds:");
		seconds = inputScanner.nextInt();
		
		// Assign the right values to the variables
		// using the remainder operator.
		
		hours = seconds / 3600; // Get each hour.
		minutes = (seconds % 3600) / 60; // Get the number of minutes, from the remainder of the initial expression.
		newSeconds = (seconds % 3600) % 60; // Get the number of seconds, from the remainder of the initial expression.
		
		System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", seconds, hours, minutes, newSeconds);
		
		inputScanner.close();

	}

}
