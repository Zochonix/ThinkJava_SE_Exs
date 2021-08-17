import java.util.Arrays;

public class Ex9_5 {


	public static void main(String[] args) {
		
		//double[] initialArray1 = {1.0, 2.0, 3.0, 4.0};
		int[] initialArray2 = new int[100];
		
		//double[] newArray = powArray(initialArray1, 2);
		
		for (int i = 0; i < initialArray2.length; i++) {
			
			initialArray2[i] = i;
			
		}
		
		histogram(initialArray2, 60);

	}
	
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
	
	public static int[] histogram(int[] scoreArray, int numOfCounters) {
		
		int[] histogram = new int[numOfCounters];
		
		for (int i = 0; i < scoreArray.length; i++) {
			
			int index = scoreArray[i];
			histogram[index]++;
			
		}
		
		return histogram;
		
	}

}
