public class Multadd_4_4_Log {

	public static void main(String[] args) {
		
		double a, b, c, sum;
		
		a = 1.0;
		b = Math.log(10.0);
		c = Math.log(20.0);
		
		sum = multadd(a, b, c);
		System.out.print(sum);

	}
	
	public static double multadd(double a, double b, double c) {
		
		return a * b + c;
		
	}

}
