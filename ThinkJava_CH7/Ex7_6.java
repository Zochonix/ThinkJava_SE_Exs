public class Ex7_6 {

	public static void main(String[] args) {
		
		int n = 10;
		int[] array = {2, 5};
		
		if (arePrimeFactors(n, array)) {
			
			System.out.println("true");
			
		}
		
		if (!(arePrimeFactors(n, array))) {
			
			System.out.println("false");
			
		}

	}
	
	public static boolean arePrimeFactors(int n, int[] numbers) {
		
		// Firstly, check to see if the numbers are below the limit.
		
		if (allBelowLimit(numbers, n)) {
			
			// Then, check they're all prime.
		
			if (allPrime(numbers, n)) {
				
				// Then, check to make sure they are factors of n.
				
				if (allFactors(n, numbers)) {
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
	public static boolean allBelowLimit(int[] numbers, int n) {
		
		// Make sure all the numbers are below the limit.
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] > n) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean allPrime(int[] numbers, int n) {
		
		// Or, create an array of integers, using the solution to Ex7_4
		// and with 'n' as a limit. Then compare this array with the array
		// the array the user enters.
		
		int[] numberList = new int[n];
		int[] checkedNumbers = new int[n];
		int[] primeNumbers = new int[n];
		boolean[] isPrime = new boolean[n];
		int base = 2;
		int accumulatedValue = 0;
		
		for (int i = 0; i < n; i++) {
			
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
		
		// Populate the prime numbers array, exclusively with prime numbers,
		// up to the specified 'n' value.
		
		for (int x = 0; x < isPrime.length; x++) {
			
			if (isPrime[x] == true) {
				
				primeNumbers[x] = x;
				
			}
			
		}
		
		// Compare the numbers array, with the prime numbers array.
	
		// If a numbers is in the numbers array, that is not in the
		// prime numbers array, return false.
		
		for (int number : numbers) {
			
			Boolean matched = false;
			
			for (int y = 0; y < primeNumbers.length; y++) {
				
				if (primeNumbers[y] == number) {
					
					matched = true;
					
				}
				
				if ((y == primeNumbers.length - 1) && (matched == false)) {
					
					// There is a number in the user's array, that is not a prime.
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean allFactors(int n, int[] numbers) {
		
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
