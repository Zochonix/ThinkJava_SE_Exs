import java.math.BigInteger;

/**
*
* A solution class for the third part of exercise 9. (9.3)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex9_3 {

	/**
	*
	* Calls methods.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		System.out.print(pow(2, 10));

	}

	/**
	*
	* Calculates factorial of a given number, including numbers that cannot be
	* represented using the long data type.
	*
	* @param x An integer, from which the exponential will be calculated.
	* @param n An exponential which will be used to calculate x^n
	* @return An integer that represents the sum of multiplying x with the n
	* exponential.
	*
	*/
	
	public static BigInteger pow(int x, int n) {
		
		if (n == 0) {
			
			return BigInteger.ONE;
			
		}
		
		BigInteger t = pow(x, n / 2);
		
		if (n % 2 == 0) {
			
			return t.multiply(t);
			
		}
		
		else {
			
			return t.multiply(t).multiply(BigInteger.valueOf(x));
			
		}
		
	}

}