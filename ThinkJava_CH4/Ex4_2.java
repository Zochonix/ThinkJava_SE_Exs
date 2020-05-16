
public class Ex4_2 {

	public static void main(String[] args) { // 1
		
		zippo("rattle", 13); // 2

	} // 16
	
	public static void baffle(String blimp) { // 8
		
		System.out.println(blimp); // 9
		zippo("ping", -5); // 10
		
	} // 13
	
	public static void zippo(String quince, int flag) { // 3
		
		if (flag < 0) { // 4, 11
			System.out.println(quince + " zoop"); // 12
		} else { // 5
			System.out.println("ik"); // 6
			baffle(quince); // 7
			System.out.println("boo-wa-ha-ha"); // 14
		} // 15
		
	} // 17

} // 18
