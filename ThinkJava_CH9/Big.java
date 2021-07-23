import java.math.BigInteger;

public class Big {

	public static void main(String[] args) {
		
		//Ex9_2_1();
		//Ex9_2_2();
		//Ex9_2_3();
		//Ex9_2_4();
		

	}
	
	public static void Ex9_2_1(int n) {
		
		int factorial = 0;
		int currentFactor = 0;
		
		System.out.print("The factorial of " + n + " is: ");
		
		// Start a for loop which will loop n times, and calculate the numbers in the list from n to 1.
		
		for (int i = n; i > 0; i--) {
			
			// Obtain the initial factor.
			
			if (i == n) {
			
				currentFactor = i * (i - 1);
			
			}
			
			else if (i - 1 != 0 ) {
			
			currentFactor = currentFactor * (i - 1);
			
			}
			
			
			factorial = currentFactor;
			
		}
		
		System.out.print(factorial);
		
	}
	
	public static void Ex9_2_2() {
		
		int currentFactorial = 1;
		
		for (int i = 0; i != 31; i++) {
			
			if ((i == 0) || (i == 1)) {
				
				currentFactorial = 1;
				
			}
			
			else {
			
				currentFactorial = i * currentFactorial;
			
			}
			
			System.out.printf("%2d" + "! | " + "%1d" + "\n", i, currentFactorial);
			
		}
		
	}
	
	public static BigInteger Ex9_2_3(int n) {
		
		BigInteger big_factorial = BigInteger.valueOf(0);
		BigInteger big_currentFactor = BigInteger.valueOf(0);
		
		System.out.print("The factorial of " + n + " is: ");
		
		// Start a for loop which will loop n times, and calculate the numbers in the list from n to 1.
		
		for (int i = n; i > 0; i--) {
			
			// Obtain the initial factor.
			
			if (i == n) {
			
				big_currentFactor = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i).subtract(BigInteger.valueOf(1)));
			
			}
			
			else if (i - 1 != 0 ) {
			
				big_currentFactor = big_currentFactor.multiply(BigInteger.valueOf(i).subtract(BigInteger.valueOf(1)));
			
			}
			
			big_factorial = big_currentFactor;
			
		}
		
		System.out.println(big_factorial);
		
		return big_factorial;
		
	}
	
	public static void Ex9_2_4() {
		
		BigInteger currentFactorial = BigInteger.valueOf(1);
		
		for (int i = 0; i != 31; i++) {
			
			if ((i == 0) || (i == 1)) {
				
				currentFactorial = BigInteger.valueOf(1);
				
			}
			
			else {
			
				currentFactorial = BigInteger.valueOf(i).multiply(currentFactorial);
			
			}
			
			System.out.printf("%2d" + "! | " + "%1d" + "\n", i, currentFactorial);
			
		}
		
	}

}













