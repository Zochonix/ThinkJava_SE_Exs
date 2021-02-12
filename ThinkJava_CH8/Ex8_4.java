public class Ex8_4 {

	public static void main(String[] args) {
		
		int m = 4;
		int n = 4;
		
		System.out.println(ack(m, n));

	}
	
	public static int ack(int m, int n) {
		
		if (m == 0) {
			
			return (n + 1);
			
		}
		
		else if (m > 0 && n == 0) {
			
			return ack(m - 1, 1);
			
		}
		
		else {
		
		return ack(m - 1, ack(m, n - 1));
		
		}
		
	}

}
