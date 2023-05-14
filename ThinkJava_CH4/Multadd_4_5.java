package ex4solutions;

/**
*
* A solution class for the final part of exercise 4. (4.3.5)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Multadd_4_5 {

	/**
	*
	* Displays the result of a computation involving exponential and
	* square root functions with multiple double values.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		double a, b, c, sum;
		
		a = 1.0;
		b = Math.exp(-a);
		c = Math.sqrt(1 - b);
		
		sum = multadd(a, b, c);
		expSum(sum);

	}

	/**
	*
	* Computes and returns a sum using multiple double arguments as operands.
	*
	* @param a The first value used in the expression. It's multiplied with b.
	* @param b The second value used in the expression. It's multiplied with a
	* and then added with c.
	* @param c The final value used in the expression. It's added to the result
	* of a multiplying with b.
	*
	* @return The result of the mathematical expression. (a double value.)
	*
	*/
	
	public static double multadd(double a, double b, double c) {
		
		return a * b + c;
		
	}

	/**
	*
	* Displays a double value to the console.
	*
	* @param sum The value to be printed to the console
	*
	*/
	
	public static void expSum(double sum) {
		
		System.out.print(sum);
		
	}

}
