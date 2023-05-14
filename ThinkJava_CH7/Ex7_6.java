/**
*
* A solution class for the sixth part of exercise 7. (7.6)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex7_6 {

	/**
	*
	* Creates an integer primitive and an integer array to hold potential prime factors
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int n = 10;
		int[] array = {2, 5};

		System.out.println(arePrimeFactors(n, array));

	}

	/**
	*
	* Returns true if all values in numbers are prime factors of n.
	*
	* @param n An integer to use for comparison with array
	* @param numbers An array of potential prime factors to use as comparison with n
	* @return A boolean value that indicates whether all the values in numbers
	* are prime factors or not.
	*
	*/
	
	public static boolean arePrimeFactors(int n, int[] numbers) {
		
		if (allBelowLimit(n, numbers)) {
		
			if (allPrime(n, numbers)) {
				
				if (allFactors(n, numbers)) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}

	/**
	*
	* Returns true if all values in numbers are below n
	*
	* @param n An integer to use for comparison with array
	* @param numbers An array of potential prime factors to use as comparison with n
	* @return A boolean value that indicates whether all the values in numbers
	* are below n or not.
	*
	*/
	
	public static boolean allBelowLimit(int n, int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] > n) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

	/**
	*
	* Returns true if all values in numbers are prime numbers
	*
	* @param n An integer to use for comparison with array
	* @param numbers An array of potential prime factors to use as comparison with n
	* @return A boolean value that indicates whether all the values in numbers
	* are prime or not.
	*
	*/
	
	public static boolean allPrime(int n, int[] numbers) {

		n = n + 1;
		
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

		/* Loop through the numbers parameter and confirm that each number is a prime
		   number or not. */

		for (int x = 0; x < numbers.length; x++) {

			int value = numbers[x];
			
			if (isPrime[value] = false) {

				return false;

			}

		}

		return true;
		
	}
	
	/**
	*
	* Returns true if all values in numbers are factors of n.
	*
	* @param n An integer to use for comparison with array
	* @param numbers An array of potential prime factors to use as comparison with n
	* @return A boolean value that indicates whether all the values in numbers
	* are factors of n or not.
	*
	*/

	public static boolean allFactors(int n, int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 0) {
				
				return false;
				
			}
			
			if (!(n % numbers[i] == 0)) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

}
