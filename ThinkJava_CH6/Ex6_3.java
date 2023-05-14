/**
*
* A solution class for the third part of exercise 6. (6.3)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex6_3 {

	/**
	*
	* Creates primitives to store values for the program and prints the result.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		// Create primitives to store the x and i values.
		
		int x = 1;
		int n = 1;
		
		System.out.println("This program, returns the sum of the first n terms of this expression.");
		
		int result = gauss(x, n);
		System.out.println(result);


	}

	/**
	*
	* Calculates the sum of the terms in the series using x and n.
	*
	* @param x Number to be used in the expression.
	* @param n Amount of terms to sum in the series.
	* @return An integer value representing the sum of the series
	*
	*/
	
	public static int gauss(int x, int n) {
		
		int sum = 0;
		
		for (int i = 0; i != n; i++) {
			
			int dividend_initial = calcDividendInitial(n);			
			int dividend_exp = calcDividendExp(x, n);
			int divisor = factorial(n);

			sum = sum + (dividend_initial * dividend_exp) / divisor;

		}
		
		return sum;
		
	}

	/**
	*
	* Calculates the initial part of the ith term using i.
	*
	* @param n The exponential, which represents the ith term in the series.
	* @return The initial part of the numerator, (-1)^i.
	*
	*/

	public static int calcDividendInitial(int n) {

		int result = 1;

		for (int x = 0; x != n; x++) {

			result = result * -1;
	
		}

		return result;

	}

	/**
	*
	* Calculates the final part of the numerator for the ith term using both
	* the exponential and the given value.
	*
	* @param x The given value, which we want to calculate with the series.
	* @param n The exponential, which represents the ith term in the series.
	* @return The last part of the numerator. x ^ 2 * i.
	*
	*/

	public static int calcDividendExp(int x, int n) {
	
		int exp = 2 * n;
		int newValue = 1;

		for (int k = 0; k != exp; k++) {

			newValue = newValue * x;

		}

		return newValue;

	}

	/**
	*
	* Calculates the last part of the ith term, the factorial of the ith term.
	*
	* @param n The exponential, which represents the ith term in the series.
	* @return The factrorial of the ith term.
	*
	*/

	public static int factorial(int n) {

		int factorial = n;
		int result = 1;

		for (int j = factorial; j != 0; j--) {

			result = result * j;

		}

		return result;

	}

}
