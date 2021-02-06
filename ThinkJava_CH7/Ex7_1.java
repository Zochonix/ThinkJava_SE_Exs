
public class Ex7_1 {

	public static void main(String[] args) {
		
		// Some test code.
		
		int[] array = {1, 2, 3};
		
		System.out.println(banana(array));
		System.out.println(grapefruit(array, 2));
		System.out.println(pineapple(array, 2));

	}
	
	// Takes an array of integers.
	
	public static int banana(int[] a) {
		
		// Creates two integer variables.
		
		int kiwi = 1;
		int i = 0;
		
		while (i < a.length) {
			
			kiwi = kiwi * a[i];
			i++;
			
		}
		
		return kiwi;
		
	}
	
	public static int grapefruit(int[] a, int grape) {
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == grape) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
	public static int pineapple(int[] a, int apple) {
		
		int pear = 0;
		
		for (int pine : a) {
			
			if (pine == apple) {
				
				pear++;
				
			}
			
		}
		
		return pear;
		
	}

}
