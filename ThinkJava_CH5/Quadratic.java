// Import the required classes to allow the program to read user input.

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		// Tell the user the aim of the program and what
		// it is that they have to do.
		
		System.out.println("This is a program that is designed to find the solution(s) to ax\u00B2 + bx + c using the quadaratic formula.");
		System.out.println("Therefore, please enter 3 integers below to use within the formula.");
		
		readInput();

	}
	
	public static void readInput() {
		
		// Declare the required variables to obtain and store
		// the inputs from the user.
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		
		// Collect the inputs from the user.
		// Verify the inputs to make sure that they have entered an input
		// that belongs to the correct data type.
		
		System.out.println("Enter your 1st number:");
		
			if (!input.hasNextDouble()) {
				String userInput = input.next();
				System.out.println(userInput + " is not a valid input, you have to enter a double value.");
				input.close();
				return;
			}
			
			else {
				
				a = input.nextDouble();
				
			}
			
		System.out.println("Enter your 2nd number:");
		
			if (!input.hasNextDouble()) {
				String userInput = input.next();
				System.out.println(userInput + " is not a valid input, you have to enter an integer.");
				input.close();
				return;
			}
			
			else {
				
				b = input.nextDouble();
				
			}
		
		System.out.println("Enter your 3rd number:");
		
			if (!input.hasNextDouble()) {
				String userInput = input.next();
				System.out.println(userInput + " is not a valid input, you have to enter an integer.");
				input.close();
				return;
			}
			
			else {
				
				c = input.nextDouble();
				
			}
			
		input.close();
			
		// Use the collected inputs as parameters within the invocation
		// of the invokeFormula procedure that will compute the solutions
		
		invokeFormula(a, b, c);
			
	}
	
	public static void invokeFormula(double a, double b, double c) {
		
		// Now, the inputs will be used to calculate the solutions
		// by implementing them into the quadratic formula.
		
		// Firstly, declare the required variables.
		
		double initialValue = -1 * b;
		double divisor = 2 * a;
		
		// Make sure the value of the sqrt isn't negative.
		
		if ((Math.pow(b, 2) - 4 * a * c) < 0) {
			
			System.out.println("Sorry, but your inputs result in a square root which cannot be computed.");
			System.out.println("Please try again with different inputs.");
			System.exit(0);
			
		}
		
		double root = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double positiveSolution = (initialValue + root) / divisor;
		double negativeSolution = (initialValue - root) / divisor;
		
		printSolutions(positiveSolution, negativeSolution);
		
	}
	
	public static void printSolutions(double positiveSolution, double negativeSolution) {
		
		// Print out the gathered information and the final 2 solutions.
		
		System.out.println("The solutions that were found were:");
		System.out.print(positiveSolution + " " + negativeSolution);
		
	}

}
