package sheet12xCoffeeShop;

import java.util.Arrays;

public class Order {
	//member variables
	private String [] coffees; // an array of Coffee Enum values
	private Coffee coffee;  //enum file
	//static / class variable - has to be public
	public static int orderNumber;
	
	//constructors
	public Order(){
		orderNumber++;
	}
	public Order(String [] coffees, Coffee coffee){
		this();
		this.coffees = coffees;
		this.coffee = coffee;
	}
	//methods, setters and getters
	public String[] getCoffees(){
		return coffees;
	} 
	public void setCoffees(String [] coffees){
		this.coffees = coffees;
	}
	//calculate price
	public double calculatePrice(){
		return coffee.getCoffee();
	}	
	//toString
	
	@Override
	public String toString() {
		return "Order Number = " + orderNumber + 
				", coffees = " + Arrays.toString(coffees) + 
				", coffee = " + coffee +
				String.format(", Price = $%.2f", calculatePrice());
	}
}