import java.util.Arrays;

/**
*
* A solution class for the fifth part of exercise 9. (9.5)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex9_5 {

	/**
	*
	* Calls methods.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {
		
		double[] initialArray1 = {1.0, 2.0, 3.0, 4.0};
		int[] initialArray2 = new int[100];
		
		double[] newArray = powArray(initialArray1, 2);
		
		for (int i = 0; i < initialArray2.length; i++) {
			
			initialArray2[i] = i;
			
		}
		
		histogram(initialArray2, 60);

	}

	/**
	*
	* Return an array containing elements which have been multipled by a given power.
	*
	* @param initialArray An array containing values which will be raised to a power.
	* @param powerToRaiseTo The exponential to raise the values of the array to.
	* @return An array with the content of initialArray, raised to a given power.
	*
	*/
	
	public static double[] powArray(double[] initialArray, int powerToRaiseTo) {
		
		// Create a new array using the initial array as a basis.
		
		double[] newArray = Arrays.copyOf(initialArray, initialArray.length);
		
		// Loop through each element in the array and multiply it by the given powerToRaiseTo value
		
		for (int currentPosition = 0; currentPosition < newArray.length; currentPosition++) {
			
			double currentElementValue = newArray[currentPosition];
			double newElementValue = 0.0;
			
			for (int timesMultiplied = 0; timesMultiplied < powerToRaiseTo; timesMultiplied++) {
				
				if (newElementValue == 0.0) {
					
					newElementValue = currentElementValue;
					
				}
				
				else {
					
					newElementValue *= newArray[currentPosition];
					
				}
				
				if (timesMultiplied == powerToRaiseTo - 1) {
					
					newArray[currentPosition] = newElementValue;
					
				}
				
			}
			
		}
		
		return newArray;
		
	}

	/**
	*
	* Returns an array, representing a histogram, that contains elements used to
	* count the number of times a score occurs.
	*
	* @param scoreArray An array containing values which will be counted.
	* @param numOfCounters The number of counters to use
	* @return An array, representing a histogram, containing the number of times
	* each score in scoreArray occurs.
	*
	*/
	
	public static int[] histogram(int[] scoreArray, int numOfCounters) {

		int counterNum = numOfCounters;

		if (counterNum < scoreArray.length()) {

			counterNum = scoreArray.length();
			System.out.println("Your chosen number of counters was changed to ensure the resultant histogram can cover all possible values.");

		}
		
		int[] histogram = new int[counterNum];
		
		for (int i = 0; i < scoreArray.length; i++) {
			
			int index = scoreArray[i];
			histogram[index]++;
			
		}
		
		return histogram;
		
	}

}
