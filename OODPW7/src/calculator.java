public class calculator {
 
	public static void main(String[] args) {
		double a = 10.0, b = 20.5;
		double addition = add (a,b);
		double subtraction = subtract(a,b);
		System.out.println(addition);
		System.out.println(subtraction);
	}
 
	public static double add (double x, double y) {
		return x + y;
	}
	 
	public static double subtract (double c, double d) {
		return c - d;
	}
 
}