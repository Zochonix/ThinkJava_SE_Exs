/**
*
* Class representing a Rational Number. (11.4)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Rational {
	
	private int numerator;
	private int denominator;

	/**
	*
	* Default Rational constructor. Creates a Rational object with a
	* given numerator and denominator.
	*
	*/
	
	public Rational() {
		
		this.numerator = 0;
		this.denominator = 1;
		
	}

	/**
	*
	* Value Rational constructor. Creates a Rational object with a
	* received numerator and denominator.
	*
	* @param n A numerical representation for a given numerator.
	* @param d A numerical representation of a given denominator.
	*
	*/
	
	public Rational(int n, int d) {
		
		this.numerator = n;
		this.denominator = d;
		
	}

	/**
	*
	* Prints the contents of a Rational object.
	*
	* @param rational A rational object.
	*
	*/
	
	public void printRational(Rational rational) {
		
		System.out.println("Numerator: " + rational.numerator + " Denominator: " + rational.denominator);
		
	}

	/**
	*
	* Reverses the sign of a Rational object.
	*
	*/
	
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

	/**
	*
	* Swaps the numerator and the denominator for a Rational object.
	*
	*/
	
	public void invert() {
		
		this.numerator = this.denominator;
		this.denominator = this.numerator;
		
	}

	/**
	*
	* Returns the double representation of a Rational object.
	*
	* @return The double representation of a Rational object.
	*
	*/
	
	public Double toDouble() {
		
		float n_float = (float) this.numerator;
		float d_float = (float) this.denominator;
		
		Double n_double = (double) n_float;
		Double d_double = (double) d_float;
		
		Double newNumber = n_double / d_double;
		
		return newNumber;
		
	}

	/**
	*
	* Reduces a Rational object to its lowest terms.
	*
	*/
	
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

	/**
	*
	* Returns the result of adding two Rational objects together.
	*
	* @param secondNumber The second Rational object to add.
	* @return A new Rational object that is the result of adding two
	* separate Rational objects.
	*
	*/
	
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

	/**
	*
	* Returns a string, making clear the numerator and denominator of
	* the Rational object.
	*
	* @return A string representation of the Rational object.
	*
	*/
	
	public String toString() {
		
		return this.numerator + ":" + this.denominator;
		
	}

}
