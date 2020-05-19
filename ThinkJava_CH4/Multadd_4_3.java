public class Multadd_4_3 {

	public static void main(String[] args) {
		
		double a, b, c, sum;
		
		a = 1.0;
		b = 2.0;
		c = 3.0;
		
		sum = multadd(a, b, c);
		System.out.print(sum);

	}
	
	public static double multadd(double a, double b, double c) {
		
		return a * b + c;
		
	}

}
