
public class Ex8_2 {

	public static void main(String[] args) {
		
		int n = 29;
		
		System.out.println(oddSum(n));

	}
	
	public static int oddSum(int n) {
		
		if (n == 1) {
			
			return 1;
			
		}
		
		int total = oddSum(n - 2);
		
		return n + total;
		
	}

}
