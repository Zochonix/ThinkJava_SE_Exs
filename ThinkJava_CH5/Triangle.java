// Import the required class to receive user input.

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		// Invoke the receiveInput function which will allow the user to enter
		// the required inputs for the program to work.
		
		receiveInput();

	}
	
	public static void receiveInput() {
		
		// Declare variables to store the required information
		// and create an instance of the Scanner class to receive input.
		
		Scanner userInput = new Scanner(System.in);
		double a, b, c;
		
		// Ask the user to enter the required information.
		
		System.out.println("Please enter 3 double values.");
		System.out.println("Enter your 1st number:");
		
		// Call the checkType function to make sure that the input is of
		// the correct data type, in this case it is double.
		
		a = checkType(userInput);
		
		System.out.println("Enter your 2nd number:");
		
		b = checkType(userInput);
		
		System.out.println("Enter your 3rd number:");
		
		c = checkType(userInput);
		
		// Once all values have been collected, close the scanner.
		
		userInput.close();
		
		// And ensure that they are positive doubles.
		
		checkRange(a, b, c);
		
	}
	
	public static double checkType(Scanner userInput) {
		
		// Make sure the inputs are all doubles.
		
		double value;
		
		if (!userInput.hasNextDouble()) {
			
			String input = userInput.next();
			System.out.println(input + " is not a valid input, you have to enter a double value.");
			userInput.close();
			System.exit(0);
			
		}
			
		value = userInput.nextDouble();
		return value;
		
	}
	
	public static void checkRange(double a, double b, double c) {
		
		// Make sure the parameters are all positive by using an OR operation.
		
		if (a < 0 || b < 0 || c < 0) {
			
			System.out.println("Error: Value(s) entered that are less than 0.");
			System.out.println("Solution: Input values which are more than 0. Cheers.");
			System.exit(0);
			
		}
		
		else {
			
			testInputs(a, b, c);
			
		}
		
	}
	
	public static void testInputs(double a, double b, double c) {
		
		// Check to see if two sides of the triangle are shorter than the other.
		
		if (a + b < c || b + c < a || a + c < b) {
			
			System.out.println("You cannot form a triangle with the given lengths.");
			
		}
		
		else {
			
			System.out.println("You can form a triangle.");
			
		}
		
	}

}
