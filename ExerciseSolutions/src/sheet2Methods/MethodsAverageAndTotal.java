package sheet2Methods;

public class MethodsAverageAndTotal{
	public static void main (String [] args){
		MethodsAverageAndTotal m = new MethodsAverageAndTotal();
		m.getAverage(3.33, 5.5, 2);
		m.getTotal(22.2, 152.45, 123);
		
	} //end of main
	public void getAverage(double a, double b, int c){
		double result;
		result = (a + b +c)/3;
		System.out.printf("The average of %.2f and %.2f and %d is %.2f\n", a, b, c, result);
	}
	public void getTotal(double a, double b, int c){
		double result;
		result = (a + b +c);
		System.out.printf("The total of %.2f and %.2f and %d is %.2f", a, b, c, result);
		
	}
	
	
} //end of class
