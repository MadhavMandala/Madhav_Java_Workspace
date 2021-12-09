package mooc.fi.two4;

public class Methods12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = average(4, 3, 6, 1);
	    System.out.println("Average: " + result);
	}
	
	public static double sum(double a, double b, double c, double d) {
		double sum = a + b + c + d;
		return sum;
	}
	
	public static double average(double a, double b, double c, double d) {
		double average = sum(a, b, c, d)/4;
		return average;
	}
}
