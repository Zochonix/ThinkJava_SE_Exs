/**
*
* A solution class for the fourth part of exercise 8. (8.4)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex8_4 {

	/**
	*
	* Creates primitives and calls the method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int m = 4;
		int n = 4;
		
		System.out.println(ack(m, n));

	}

	/**
	*
	* Uses recursion to implement the Ackermann function for
	* non-negative integers.
	*
	* @param m The first integer
	* @param n The second integer.
	* @return The sum of the function
	*
	*/
	
	public static int ack(int m, int n) {
		
		if (m == 0) {
			
			return (n + 1);
			
		}
		
		else if (m > 0 && n == 0) {
			
			return ack(m - 1, 1);
			
		}
		
		else {
		
		return ack(m - 1, ack(m, n - 1));
		
		}
		
	}

}
