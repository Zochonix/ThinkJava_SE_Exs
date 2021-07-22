
public class Test {

	public static void main(String[] args) {
		
		ex1();
		ex4();
		ex5();


	}
	
	public static void ex1() {
		
		// Some variables and data types
		
		String a = "first";
		boolean b = true;
		char c = 'b';
		int d = 2;
		double e = 2.17;
		
		System.out.println(a + b);
		System.out.println(a + c);
		System.out.println(a + d);
		System.out.println(a + e);
		
		System.out.println(b + a);
		//System.out.println(b + b);
	//	System.out.println(b + c);
		//System.out.println(b + d);
		//System.out.println(b + e);
		
		System.out.println(c + a);
		//System.out.println(c + b);
		System.out.println(c + d);
		System.out.println(c + e);
		
		System.out.println(d + a);
		//System.out.println(d + b);
		System.out.println(d + c);
		System.out.println(d + e);
		
		System.out.println(e + a);
		//System.out.println(e + b);
		System.out.println(e + c);
		System.out.println(e + d);
		
	}
	
	public static void ex4() {
		
		
		//char testChar = testChar + 152;
		
		//System.out.println(testChar);
		
		
	}
	
	public static void ex5() {
		
		String test = "";
		
		System.out.println(test + 1);
		System.out.println(test + "hello");
		System.out.println(test + true);
		System.out.println(test + 'a');
		System.out.println(test + 1.17);
		
		
	}

}
