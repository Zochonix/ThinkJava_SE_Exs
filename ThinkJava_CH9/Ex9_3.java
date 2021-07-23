import java.math.BigInteger;

public class Ex9_3 {

	public static void main(String[] args) {
		
		System.out.print(pow(2, 10));

	}
	
	public static BigInteger pow(int x, int n) {
		
		if (n == 0) {
			
			return BigInteger.ONE;
			
		}
		
		BigInteger t = pow(x, n / 2);
		
		if (n % 2 == 0) {
			
			return t.multiply(t);
			
		}
		
		else {
			
			return t.multiply(t).multiply(BigInteger.valueOf(x));
			
		}
		
	}

}