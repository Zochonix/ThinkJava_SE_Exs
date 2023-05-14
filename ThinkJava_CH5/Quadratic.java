package ex5solutions;

import java.util.Scanner;

/**
*
* A solution class for the sixth part of exercise 5. (5.6)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Quadratic {

	/**
	*
	* Starts the program and tells the user what the program is supposed to do.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		/* Tell the user the aim of the program and what
		   it is that they have to do. */
		
		System.out.print("This is a program that is designed to find the");
		System.out.print("solution(s) to ax\u00B2 + bx + c using the");
		System.out.println(" quadaratic formula.");

		System.out.print("Therefore, please enter 3 integers below to use within"); 
		System.out.println(" the formula:");
		System.out.println();
		
		readInput();

	}

	/**
	*
	* Asks the user to enter multiple numerical values to use in the formula
	* which are then validated.
	*
	*/
	
	public static void readInput() {
		
		/* Declare the required variables to obtain and store the inputs from the
		   from the user. */
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		
		/* Collect the inputs from the user. Verify the inputs to make sure that
		   they have entered an input that belongs to the correct data type. */
		
		System.out.print("Enter your 1st number: ");
		
			if (!input.hasNextDouble()) {
				
				String userInput = input.next();
				System.out.println();
				System.err.println(userInput + " is not a valid input, you must enter a numerical value");
				System.out.println();
				input.close();
				readInput();
				return;

			}
			
			else {
				
				a = input.nextDouble();
				
			}
			
		System.out.print("Enter your 2nd number: ");
		
			if (!input.hasNextDouble()) {
				
				String userInput = input.next();
				System.out.println();
				System.err.println(userInput + " is not a valid input, you must enter a numerical value");
				System.out.println();
				input.close();
				readInput();
				return;
			
			}
			
			else {
				
				b = input.nextDouble();
				
			}
		
		System.out.print("Enter your 3rd number: ");
		
			if (!input.hasNextDouble()) {

				String userInput = input.next();
				System.out.println();
				System.err.println(userInput + " is not a valid input, you must enter a numerical value");
				System.out.println();
				input.close();
				readInput();
				return;

			}
			
			else {
				
				c = input.nextDouble();
				
			}
			
		/* Use the collected inputs as arguments for the invokeFormula procedure
		   that will compute the solutions. */
		
		invokeFormula(a, b, c, input);
			
	}

	/**
	*
	* Implements the quadratic formula with the given args and outputs
	* the solutions to the console. Also closes the scanner.
	*
	* @param a The first value used in the quadratic formula
	* @param b The second value used in the quadratic formula
	* @param c The final value used in the quadratic formula.
	* @param input The scanner object which will be closed.
	*
	*/
	
	public static void invokeFormula(double a, double b, double c, Scanner input) {
		
		/* The parameters will now be used to compute particular solutions by
		   implementing them into the quadratic formula. */
		
		// Declare the required variables.
		
		double initialValue = -1 * b;
		double divisor = 2 * a;
		
		// Make sure the sqrt isn't negative.
		
		if ((Math.pow(b, 2) - 4 * a * c) < 0) { 
			
			System.out.println();
			System.out.println("Your inputs have produced a negative square root.");
			System.out.println("Please try again with different inputs.");
			System.out.println();
			a = 0.0;
 			b = 0.0;
			c = 0.0;
			readInput();
			return;
			
		}

		/* Close the scanner and create variables to store the square root of the
		   formula with the given values, as well as for the solutions of the
		   formula which are to be computed using the calculated square root, 
		   initialValue and divisior variables. */

		input.close();
		
		double root = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double positiveSolution = (initialValue + root) / divisor;
		double negativeSolution = (initialValue - root) / divisor;

		/* Call the printSolutions method and pass the solution variables
		   as arguments. */
		
		printSolutions(positiveSolution, negativeSolution);
		
	}

	/**
	*
	* Prints the results of the invokeFormula method to the console.
	*
	* @param positiveSolution The solution obtained by adding the square root.
	* @param negativeSolution The solution obtained by subtracting the square root.
	*
	*/
	
	public static void printSolutions(double positiveSolution, double negativeSolution) {
		
		// Print out the final solutions obtained.
		
		System.out.println();		
		System.out.println("The solutions found using the given numbers were:");
		System.out.println();
		System.out.print(positiveSolution + " " + negativeSolution);
		
	}

}
