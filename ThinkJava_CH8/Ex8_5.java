/**
*
* A solution class for the fifth part of exercise 8. (8.5)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex8_5 {

	/**
	*
	* Creates primitives and calls the method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		double x = 2;
		int n = 3;
		
		System.out.println(power(x, n));

	}

	/**
	*
	* Uses recursion to calculate an exponential.
	*
	* @param x The value which will be increased exponentially
	* @param n The exponential
	* @return The sum of the function
	*
	*/
	
	public static double power(double x, int n) {
		
		if (n == 0) {
			
			return 1;
			
		}
		
		return x * power(x, n - 1);
		
	}

}
