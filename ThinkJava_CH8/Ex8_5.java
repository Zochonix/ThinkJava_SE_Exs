
public class Ex8_5 {

	public static void main(String[] args) {
		
		double x = 2;
		int n = 3;
		
		System.out.println(power(x, n));

	}
	
	public static double power(double x, int n) {
		
		if (n == 0) {
			
			return 1;
			
		}
		
		return x * power(x, n - 1);
		
	}

}
