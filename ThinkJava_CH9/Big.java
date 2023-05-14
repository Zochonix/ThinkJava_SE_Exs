import java.math.BigInteger;

/**
*
* A solution class for the second part of exercise 9. (9.2)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Big {
	
	/**
	*
	* Calls methods.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		//Ex9_2_1(1);
		//Ex9_2_2();
		//Ex9_2_3(30);
		Ex9_2_4();
		

	}

	/**
	*
	* Calculates factorial of a given number.
	*
	* @param factorial An integer, from which the factorial will be calculated.
	*
	*/
	
	public static void Ex9_2_1(int factorial) {
		
		int result = 1;
		
		System.out.print("The factorial of " + factorial + " is: ");
		
		for (int i = factorial; i != 0; i--) {
			
			result = result * i;
			
		}
		
		System.out.print(factorial);
		
	}

	/**
	*
	* Displays the results of factorials 1 to 30.
	*
	*/
	
	public static void Ex9_2_2() {
		
		int factorial = 1;
		int result = 1;
		
		for (int i = factorial; i != 31; i++) {
			
			result = result * i;
			
			System.out.printf("%2d" + "! | " + "%1d" + "\n", i, result);
			
		}
		
	}

	/**
	*
	* Calculates factorial of a given number, involving numbers that cannot
	* be represented using long.
	*
	* @param n An integer, from which the factorial will be calculated.
	* @return A big integer value, the factorial of n.
	*
	*/
	
	public static BigInteger Ex9_2_3(int n) {
		
		BigInteger result = BigInteger.valueOf(1);
		
		System.out.print("The factorial of " + n + " is: ");
		
		for (int i = n; i != 0; i--) {
			
			result = result.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println(result);
		
		return result;
		
	}

	/**
	*
	* Displays the factorials of numbers 1 to 30
	*
	*/
	
	public static void Ex9_2_4() {
		
		BigInteger result = BigInteger.valueOf(1);
		
		for (int i = 1; i != 31; i++) {
			
			result = result.multiply(BigInteger.valueOf(i));
			
			System.out.printf("%2d" + "! | " + "%1d" + "\n", i, result);
			
		}
		
	}

}













