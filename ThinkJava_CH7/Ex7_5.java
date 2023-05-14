/**
*
* A solution class for the fifth part of exercise 7. (7.5)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex7_5 {

	/**
	*
	* Creates an integer primitive and an integer array to compare for factors
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int n = 10;
		int[] array = {0, 1, 2, 3, 4, 5};
		
		System.out.println(areFactors(n, array));

	}

	/**
	*
	* Returns a boolean if all values in array are factors of n.
	*
	* @param n An integer to use for comparison with array
	* @param numbers An array of integers to use as comparison with n
	* @return A boolean value that indicates whether
	* n is divisible by all values in array or not.
	*
	*/
	
	public static boolean areFactors(int n, int[] numbers) {
		
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
