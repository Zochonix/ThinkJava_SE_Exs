
public class Ex8_6 {

	public static void main(String[] args) {
		
		int[] integerArray = {6, 9, 3, 7, 1, 5};
		int lowestIndex = 2;
		int highestIndex = 4;
		
		System.out.println(maxInRange(integerArray, lowestIndex, highestIndex));
		System.out.println(max(integerArray));

	}
	
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
	
	public static int max(int[] array) {
		
		int lowIndex = 0;
		int highIndex = array.length - 1;
		int maxValue = -1;
		
		maxValue = maxInRange(array, lowIndex, highIndex);
		
		return maxValue;
		
	}

}
