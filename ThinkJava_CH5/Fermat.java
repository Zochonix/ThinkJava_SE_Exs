// Import the required classes.

import java.util.Scanner;

public class Fermat {

	public static void main(String[] args) {
		
		// Collect the required numbers with the below procedure.
		
		collectInput();

	}
	
	public static void collectInput() {
		
		// Declare the required variables to store the
		// inputs from the user.
		
		int a, b, c, n;
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter four integers which will
		// be used to test Fermat's theorem.
		
		System.out.println("Enter four integers:");
		
		// Store the numbers in the variables.
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		n = input.nextInt();
		
		// Close the scanner.
		
		input.close();
		
		// Invoke the checkInput function which will check the
		// inputs that get passed as parameters, against the theorem.
		
		checkInput(a, b, c, n);
		
	}
	
	public static void checkInput(int a, int b, int c, int n) {
		
		// Do the parameters break the theorem?
		
		if (n >= 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
			
			System.out.println("Holy smokes, Fermat was wrong!");
			
		}
		
		else {
			
			System.out.println("No, that doesn't work.");
			
		}
		
	}

}
