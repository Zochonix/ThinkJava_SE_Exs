/**
*
* A solution class for the fourth part of exercise 9. (9.4)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex9_4 {

	/**
	*
	* Calls methods.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		Ex9_4_5();
		Ex9_4_6();

	}

	/**
	*
	* Recursively calculates Euler's number series, up to a given point,
	* with a given value of x.
	*
	* @param x The exponential to use with Euler's number.
	* @param n The number of terms to be calculated.
	* @return A double value that represents the sum of the sequence.
	*
	*/
	
	public static double myexp(double x, double n) {
		
		// Base case
		
		if (n == 0) {
			
			return 1.0;
			
		}
		
		double calculatedNumerator = 1.0;
		double calculatedDenominator = 1.0;
		double calculatedResult = 0.0;
		
		// Numerator
		
		for (double y = n; y > 0; y--) {
			
			calculatedNumerator *= x;
			
		}
		
		// Denominator
		
		for (double z = n; z != 0; z--) {
			
			if (z == n) {
				
				calculatedDenominator = n;
				
			}
			
			else {
				
				calculatedDenominator *= z;
				
			}
			
		}
		
		// Final answer
		
		calculatedResult = calculatedNumerator / calculatedDenominator;
		
		double answer = calculatedResult + myexp(x, n - 1);
		
		return answer;
		
	}

	/**
	*
	* Calls methods to check the accuracy of each on a specific value.
	*
	* @param x The value to use with each method.
	*
	*/
	
	public static void check(double x) {
		
		System.out.println(x);
		System.out.println(myexp(x, 17));
		System.out.println(Math.exp(x));
		System.out.println();
		
	}

	/**
	*
	* Uses a switch statement to check accuracy of methods with different values.
	*
	*/
	
	public static void Ex9_4_5() {
		
		for (int i = 0; i < 4; i++) {
			
			switch(i) {
			
				case 0:
					
					check(0.1);
					break;
					
				case 1:
					
					check(1.0);
					break;
					
				case 2:
					
					check(10.0);
					break;
					
				case 3:
					
					check(100.0);
					break;
					
			}
			
		}
		
	}

	/**
	*
	* Uses a loop statement to check accuracy of methods with different values.
	*
	*/
	
	public static void Ex9_4_6() {
		
		for (int i = 0; i < 4; i++) {
			
			switch(i) {
			
				case 0:
					
					check(-0.1);
					break;
					
				case 1:
					
					check(-1.0);
					break;
					
				case 2:
					
					check(-10.0);
					break;
					
				case 3:
					
					check(-100.0);
					break;
					
			}
			
		}
		
	}

}
















