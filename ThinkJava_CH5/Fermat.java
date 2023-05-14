package ex5solutions;

import java.util.Scanner;

/**
*
* A solution class for the fifth part of exercise 5. (5.5)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Fermat {

	/**
	*
	* Calls the checkInput method and begins the program.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		collectInput();

	}

	/**
	*
	* Calls the checkInput method and begins the program.
	*
	*/
	
	public static void collectInput() {
		
		/* Declare the required integer primitives to store the
		   inputs from the user as well as a scanner object to store user input. */
		
		int a, b, c, n;
		Scanner input = new Scanner(System.in);
		
		/* Ask the user to enter four numbers which will be used
		   to test Fermat's theorem. Store them in the primitives. */
		
		System.out.println("Enter four integers:");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		n = input.nextInt();
		
		// Close the scanner.
		
		input.close();
		
		/* Call the checkInput function which checks the inputs that get passed
		   as arguments against the theorem. */
		
		checkInput(a, b, c, n);
		
	}

	/**
	*
	* Calls the checkInput method and computes the Fermat theorem
	* with the given inputs.
	*
	* @param a The first number to be used in the theorem.
	* @param b The second number to be used in the theorem.
	* @param c The third number to be used in the theorem.
	* @param n The value which will be used as the exponential.
	*
	*/
	
	public static void checkInput(int a, int b, int c, int n) {
		
		/* Use logical operators with Math functions, to identify whether the passed
		   arguments break the theorem. */
		
		if (n >= 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
			
			System.out.println("Holy smokes, Fermat was wrong!");
			
		}
		
		else {
			
			System.out.println("No, that doesn't work.");
			
		}
		
	}

}
