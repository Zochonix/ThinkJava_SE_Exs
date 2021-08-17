public class Rational {
	
	private int numerator;
	private int denominator;
	
	public Rational() {
		
		this.numerator = 0;
		this.denominator = 1;
		
	}
	
	public Rational(int n, int d) {
		
		this.numerator = n;
		this.denominator = d;
		
	}
	
	public void printTile(Rational rational) {
		
		System.out.println("Numerator: " + rational.numerator + " Denominator: " + rational.denominator);
		
	}
	
	public void negate() {
		
		if ((this.numerator > 0 && this.denominator > 0) || (this.numerator < 0 && this.denominator < 0)) {
			
			this.numerator = -1 * this.numerator;
			
		}
		
		if ((this.numerator > 0 && this.denominator < 0)) {
			
			this.numerator = -1 * this.numerator;
			
		}
		
		if ((this.numerator < 0 && this.denominator > 0)) {
			
			this.numerator = -1 * this.numerator;
			
		}
		
	}
	
	public void invert() {
		
		this.numerator = this.denominator;
		this.denominator = this.numerator;
		
	}
	
	public Double toDouble() {
		
		float n_float = (float) this.numerator;
		float d_float = (float) this.denominator;
		
		Double n_double = (double) n_float;
		Double d_double = (double) d_float;
		
		Double newNumber = n_double / d_double;
		
		return newNumber;
		
	}
	
	public void reduce() {
		
		// % == remainder
		// / == quotient
		
		int numerator = this.numerator;
		int denominator = this.denominator;
		int currentNumerator = 0;
		int currentDenominator = 0;
		int gcd = 0;
		
		while ((numerator % denominator != 0)) {
			
			currentNumerator = numerator;
			currentDenominator = denominator;
			
			numerator = currentDenominator;
			denominator = currentNumerator % currentDenominator;
		
			if (numerator % denominator == 0) {
				
				gcd = denominator;
				System.out.println("The GCD of " + this.numerator + " and " + this.denominator + " is " + gcd);
				
			}
			
		}
		
	}
	
	public Rational add(Rational secondNumber) {
		
		// If denominators are same, simply add numerators.
		
		if (this.denominator == secondNumber.denominator) {
			
			return new Rational((this.numerator + secondNumber.numerator), this.denominator);
			
		}
		
		// Else multiply each fraction by the LCM, add, then reduce.
		
		else {
			
			// Find the LCM
			
			
			
		}
		
		return null;
		
	}
	
	public String toString() {
		
		return this.numerator + ":" + this.denominator;
		
	}

}
