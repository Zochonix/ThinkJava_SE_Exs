/**
*
* A solution class for the second part of exercise 8. (8.2)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex8_2 {

	/**
	*
	* Creates primitive and calls the method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int n = 29;
		
		System.out.println(oddSum(n));

	}

	/**
	*
	* Uses recursion to calculate the sum of odd integers from 1 to n.
	*
	* @param n The limit from which the algorithm descends.
	* @return The sum of odd integers from 1 to n.
	*
	*/
	
	public static int oddSum(int n) {
		
		if (n == 1) {
			
			return 1;
			
		}
		
		int total = oddSum(n - 2);
		
		return n + total;
		
	}

}
