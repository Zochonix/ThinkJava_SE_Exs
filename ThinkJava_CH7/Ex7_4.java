import java.util.Arrays;

/**
*
* A solution class for the fourth part of exercise 7. (7.4)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex7_4 {

	/**
	*
	* Creates an integer primitive and sends the value to the required method
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		// An integer primitive that will represent the limit for the algorithm.
		
		int n = Integer.valueOf(args[0]);
		
		// Print out the result of the method sieve().
		
		boolean[] primeArray = sieve(n);
		
		String value = Integer.toString(n - 1);

		for (int x = 0; x < n; x++) {

			System.out.println(x + " -> " + primeArray[x]);
		
		}

		System.out.println();
		System.out.println("Printed: A list of prime numbers from 0 to " + value + ".");


	}

	/**
	*
	* An implementation of the Sieve of Erastothenes algorithm, which identifies
	* whether a number in a given sequence, is prime or not.
	*
	* @param n A given limit of numbers to analyse.
	* @return A boolean array, indicating whether each value up to n - 1, 
	* is a prime number or not.
	*
	*/
	
	public static boolean[] sieve(int n) {
		
		/* Firstly, make sure n is a positive integer.
		   Otherwise return a null value. */
		
		if ((n == 0) || (n == 1) || (n < 0)) {
			
			return null;
			
		}
		
		/* If n is a positive integer, create an array that will store integers
		   up to n - 1, and another array that will store the true/false values
		   for these integers, indicating whether they are prime or not. */
		
		int[] numberList = new int[n];
		int[] checkedNumbers = new int[n];
		boolean[] isPrime = new boolean[n];

		/* Create an integer primitive for the base. The loop will start from the
		   first prime number (base) and will then loop through
		   each number up to n - 1. */
		   
		int base = 2;

		/* Create a boolean to stop  the addition of more numbers in the loop
		   as the smallest prime number, which has not already been checked,
		   will have already been added. */

		Boolean primeAdded = false;
		
		/* Populate the numberList array with the correct integers, starting from
		   0 and ending at n - 1. */
		
		for (int i = 0; i < n; i++) {
			
			numberList[i] = i;
			
		}

		
		// Loop through the sequence of numbers from 2 up to n - 1.

		for (int j = base; j < n; j++) {

			/* Upon each incrementation of the initial loop, set the primeAdded flag
			   to false. */

			primeAdded = false;

			/* Loop through the multiples of the base and if the current value has not
			   already been checked or been counted as a prime,
			   add the number to the prime list. */
			
			for (int k = j; k < n; k += j) {

				if (primeAdded != true) {

					if ((checkedNumbers[k] == 0)) {

						isPrime[k] = true;
						primeAdded = true;

					}
				}
				
				checkedNumbers[k] = numberList[k];
				
			}
				
		}
		
		return isPrime;
		
	}

}
