package sheet2Methods;

public class Ex9TemperatureConversion{
	public static void main (String [] args){
		
		Ex9TemperatureConversion ex9 = new Ex9TemperatureConversion();
		
		double celsius = 20;
		double fahrenheit = 101;
		ex9.calculateCelsToFahr(celsius);
		ex9.calculateFahrToCels(fahrenheit);
	}
		public void calculateCelsToFahr(double celsius){
				
			double result = celsius * 9/5 + 32;
			System.out.printf("Celsius to fahrenheit: %.1f\n", result);
		}
		public void calculateFahrToCels(double fahrenheit){
				
			double result =  fahrenheit * 5/9 - 32;
			System.out.printf("Fahrenheit to celsius: %.1f", result);			
		
		}
} //end of class

