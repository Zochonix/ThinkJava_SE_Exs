public class Multadd_4_5 {

	public static void main(String[] args) {
		
		double a, b, c, sum;
		
		a = 1.0;
		b = Math.exp(-a);
		c = Math.sqrt(1 - b);
		
		sum = multadd(a, b, c);
		expSum(sum);

	}
	
	public static double multadd(double a, double b, double c) {
		
		return a * b + c;
		
	}
	
	public static void expSum(double sum) {
		
		System.out.print(sum);
		
	}

}
