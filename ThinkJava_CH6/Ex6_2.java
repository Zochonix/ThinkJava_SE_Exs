public class Ex6_2 {

	public static void main(String[] args) {
		
		double number = 100.0;
		number = squareRoot(number);
		System.out.println("The returned approximation is: " + number);

	}
	
	public static double squareRoot(double number) {
		
		double initialEstimate = number / 2; // x0
		double approximation1 = (initialEstimate + (number / initialEstimate)) / 2; // x0
		double approximation2 = (approximation1 + (number / approximation1)) / 2; // x1
		int iteration = 1;
		
		System.out.println("Initial Approximations");
		System.out.println("Approximation 1: " + approximation1 + " Approximation 2: " + approximation2);
		
		
		while (!(Math.abs(approximation1 - approximation2) < 0.0001)) {
			
			approximation1 = (approximation2 + (number / approximation2)) / 2;
			approximation2 = (approximation1 + (number / approximation1)) / 2;
			System.out.println("Iteration " + iteration);
			System.out.println("Approximation 1: " + approximation1 + " Approximation 2: " + approximation2);
			iteration++;
			
		}
		
		return approximation2;
		
	}

}
