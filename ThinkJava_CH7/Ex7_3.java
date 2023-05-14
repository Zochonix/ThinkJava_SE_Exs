/**
*
* A solution class for the third part of exercise 7. (7.3)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex7_3 {

	/* Ex 7_3 asks you to write a method that takes an array of integers,
	   and returns the index of the highest element in the array.
	
	   You can use an enhanced for loop method but you need a counter with it.
	   Otherwise there is no way, with just the loop itself, to refer to the actual positions
	   of the elements inside the array. */

	/**
	*
	* Creates an array and calls the indexOfMax array
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		System.out.println(indexOfMax(intArray));

	}
	
	/**
	*
	* Uses a standard for loop to return the highest index in the given array.
	*
	* @param array A given array of numbers.
	* @return The highest index.
	*
	*/
	
	public static int indexOfMax(int[] array) {
		
		int highestIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			highestIndex = i;
			
		}
		
		return highestIndex;
		
	}
	
	/**
	*
	* Uses a enhanced for loop with a counter to return the highest index in the given array.
	*
	* @param array A given array of numbers.
	* @return The highest index.
	*
	*/
	
	public static int indexOfMax2(int[] array) {
		
		int count = -1;
		
		for (int element : array) {
			
			count++;
			
		}
		
		return count;
		
	}

}
