/**
*
* A solution class for the second part of exercise 6. (6.2)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Ex6_2 {

	/**
	*
	* Uses the first args value as an argument for the squareRoot method and
	* prints out the returned approx value.
	*
	* @param args A collection of inputs specified by the user at execution.
	*
	*/

	public static void main(String[] args) {

		/* Take the first args value and pass it to the squareRoot
		   function */

		double number = squareRoot(Double.parseDouble(args[0]));
		System.out.println("The returned approximation is: " + number);

	}

	/**
	*
	* Returns an approximated value akin to a square root, using a double value
	* and a while loop that compares the difference between consecutive results.
	*
	* @param number The value from which the approximation will be calculated
	* @return An approximated value.
	*
	*/
	
	public static double squareRoot(double number) {
		
		/* Create variables to store the initial values. These include the
		   initial estimate and the first two approximations. */

		double initialEstimate = number / 2; // x0
		double approximation1 = (initialEstimate + (number / initialEstimate)) / 2; // x0
		double approximation2 = (approximation1 + (number / approximation1)) / 2; // x1
		int iteration = 1;
		
		System.out.println();
		System.out.println("Initial Approximations:");
		System.out.println("Approximation 1: " + approximation1 + " Approximation 2: " + approximation2);
		System.out.println();
		
		/* If the absolute value between the consecutive approximations is
		   not less than 0.0001, continue finding approximations. Otherwise
		   exit the loop and return the latest approximation. */
		
		while (!(Math.abs(approximation1 - approximation2) < 0.0001)) {
			
			approximation1 = (approximation2 + (number / approximation2)) / 2;
			approximation2 = (approximation1 + (number / approximation1)) / 2;
			System.out.println("Iteration " + iteration + ":");
			System.out.println("Approximation 1: " + approximation1 + " Approximation 2: " + approximation2);
			System.out.println();			
			iteration++;
			
		}
		
		return approximation2;
		
	}

}
