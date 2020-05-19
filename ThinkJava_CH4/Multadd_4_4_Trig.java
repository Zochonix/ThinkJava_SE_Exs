public class Multadd_4_4_Trig {

	public static void main(String[] args) {
		
		double a, b, c, sum;
		
		a = 0.5;
		b = Math.cos(Math.PI / 4.0);
		c = Math.sin(Math.PI / 4.0);
		
		sum = multadd(a, b, c);
		System.out.print(sum);

	}
	
	public static double multadd(double a, double b, double c) {
		
		return a * b + c;
		
	}

}
