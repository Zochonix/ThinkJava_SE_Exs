import java.util.Arrays;

public class Ex7_4 {

	public static void main(String[] args) {
		
		// The integer that will represent the limit.
		
		int n = 6;
		
		// Call the method.
		
		System.out.println(Arrays.toString(sieve(n)));

	}
	
	public static boolean[] sieve(int n) {
		
		// Firstly, make sure n is a positive integer
		
		if ((n == 0) || (n == 1) || (n < 0)) {
			
			return null;
			
		}
		
		// Create the array that will store the integers
		// and the array that will store the true/false values
		// for those integers.
		
		int[] numberList = new int[n];
		int[] checkedNumbers = new int[n];
		boolean[] isPrime = new boolean[n];
		int base = 2;
		int accumulatedValue = 0;
		
		// 1. Populate the numberList array with 0 to n - 1.
		
		for (int i = 0; i < n; i++) {
			
			System.out.println(i);
			numberList[i] = i;
			
		}
			
		for (int j = base; j < n; j++) {
			
			if (checkedNumbers[j] == 0) {
				
				isPrime[j] = true; 
				
			}
			
			accumulatedValue = j;
			
			for (int k = accumulatedValue; k < n; k += k) {
				
				// Because the numbers are already false in the boolean array,
				// we just have to verify that the numbers have been checked.
				
				checkedNumbers[k] = numberList[k];
				
			}
				
		}
		
		return isPrime;
		
	}

}
