public class Ex7_3 {

	// Ex 7_3 asks you to write a method that takes an array of integers
	// and returns the index of the highest element in the array.
	//
	// You can use an enhanced for loop method but you need a counter with it.
	// Otherwise there is no way, with just the loop itself, to refer to the actual positions
	// of the elements inside the array.
	
	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		System.out.println(indexOfMax(intArray));

	}
	
	// Using a regular for loop.
	
	public static int indexOfMax(int[] array) {
		
		int highestIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			highestIndex = i;
			
		}
		
		return highestIndex;
		
	}
	
	// Using an enhanced for loop, with a counter.
	
	public static int indexOfMax2(int[] array) {
		
		int count = -1;
		
		for (int element : array) {
			
			count++;
			
		}
		
		return count;
		
	}

}
