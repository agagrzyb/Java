package sheet2Methods;

public class MethodsCalculateVolume{
	public static void main (String [] args){
		MethodsCalculateVolume m = new MethodsCalculateVolume();
		m.calculateVolume(3.33, 5.5, 2.2);
		
	} //end of main
	public void calculateVolume(double depth, double width, double breadth){
		double result;
		result = (depth * width * breadth);
		System.out.printf("The volume for %.2f and %.2f and %.2f is %.2f\n", depth, width, breadth, result);
	}
} //end of class
