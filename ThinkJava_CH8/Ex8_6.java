/**
*
* A solution class for the sixth part of exercise 8. (8.6)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex8_6 {

	/**
	*
	* Creates primitives and an array and calls the method.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		int[] integerArray = {6, 9, 3, 7, 1, 5};
		int lowestIndex = 2;
		int highestIndex = 4;
		
		System.out.println(maxInRange(integerArray, lowestIndex, highestIndex));
		System.out.println(max(integerArray));

	}

	/**
	*
	* Uses recursion to find the highest value in the array within a given range.
	*
	* @param array The array of values.
	* @param lowIndex The smallest value.
	* @param highIndex The highest value.
	* @return The value which is the highest in the range.
	*
	*/
	
	public static int maxInRange(int[] array, int lowIndex, int highIndex) {
		
		if (lowIndex == highIndex) {
			
			return array[lowIndex];
			
		}
		
		int maxValue = 0;
		
		if ((array[lowIndex] > array[highIndex]) || (array[highIndex] == array[lowIndex])) {
			
			maxValue = maxInRange(array, lowIndex, highIndex - 1);
			
		}
		
		if (array[highIndex] > array[lowIndex]) {
			
			maxValue = maxInRange(array, lowIndex + 1, highIndex);
			
		}
		
		return maxValue;
		
	}

	/**
	*
	* Uses recursion to find the highest value in the array.
	*
	* @param array The array of values.
	* @return The value which is the highest in the range.
	*
	*/
	
	public static int max(int[] array) {
		
		int lowIndex = 0;
		int highIndex = array.length - 1;
		int maxValue = -1;
		
		maxValue = maxInRange(array, lowIndex, highIndex);
		
		return maxValue;
		
	}

}
