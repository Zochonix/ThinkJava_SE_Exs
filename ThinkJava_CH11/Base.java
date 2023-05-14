/**
*
* Class used as base for Exercise 11. (Ex11)
*
* @author Kane Kennedy
* @version 1.0
*
*/

public class Base {

	/**
	*
	* Calls methods for exercises.
	*
	*/

	public static void main(String[] args) {
		
		Ex11_2();
		Ex11_3();
		Ex11_4();
		
	}

	/**
	*
	* Calls methods for Ex11.2.
	*
	*/
	
	public static void Ex11_2() {
		
		Tile newTile = new Tile('Z', 10);
		newTile.printTile(newTile);
		
	}


	/**
	*
	* Calls methods for Ex11.3.
	*
	*/
	
	public static void Ex11_3() {
		
		Date birthday = new Date(2000, 04, 11);
		
	}

	
	/**
	*
	* Calls methods for Ex11.4.
	*
	*/
	
	public static void Ex11_4() {
		
		Rational rational = new Rational(1785, 546);
		rational.printTile(rational);
		//rational.negate();
		rational.reduce();
		
	}

}
