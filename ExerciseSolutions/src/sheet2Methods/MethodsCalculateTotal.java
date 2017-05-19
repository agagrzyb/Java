package sheet2Methods;

public class MethodsCalculateTotal{
	public static void main (String [] args){
		MethodsCalculateTotal m = new MethodsCalculateTotal();
		m.calculateTotal(3.33, 5);
		
	} //end of main
	public void calculateTotal(double price, int quantity){
		double result;
		result = price * quantity;
		System.out.printf("Price %.2f\n" , price);
		System.out.printf("Quantity %d\n" , quantity);
		System.out.printf("Total price of %.2f and %d is %.2f", price, quantity, result);
	}
	
	
} //end of class
