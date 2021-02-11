
public class Ex7_5 {

	public static void main(String[] args) {
		
		int n = 10;
		int[] array = {0, 1, 2, 3, 4, 5};
		
		System.out.println(areFactors(n, array));

	}
	
	public static boolean areFactors(int n, int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 0) {
				
				return false;
				
			}
			
			if (!(n % numbers[i] == 0)) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}

}
