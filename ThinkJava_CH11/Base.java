public class Base {

	public static void main(String[] args) {
		
		Ex11_2();
		Ex11_3();
		Ex11_4();
		
	}
	
	public static void Ex11_2() {
		
		Tile newTile = new Tile('Z', 10);
		newTile.printTile(newTile);
		
	}
	
	public static void Ex11_3() {
		
		Date birthday = new Date(2000, 04, 11);
		
	}
	
	public static void Ex11_4() {
		
		Rational rational = new Rational(1785, 546);
		rational.printTile(rational);
		//rational.negate();
		rational.reduce();
		
	}

}
