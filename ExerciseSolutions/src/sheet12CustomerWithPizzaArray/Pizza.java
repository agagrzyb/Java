package sheet12CustomerWithPizzaArray;

import java.util.Arrays;

public class Pizza {

	//member variables
	String [] toppings = {"cheese", "mushrooms", "onions", "chicken"};
	public PizzaSize pizzaSize; // enums, in PizzaSize file

	//constructors
	public Pizza(){

	}
	public Pizza(String[] toppings, PizzaSize pizzaSize) {
		this.toppings = toppings;
		this.pizzaSize = pizzaSize;
	}

	//methods,
	public String[] getToppings() {
		return toppings;
	}
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public double calculatePrice(){
		return 0;
	}

	//toString
	@Override
	public String toString() {
		return  "\nPizza toppings = " + Arrays.toString(toppings) + 
				"\nPizzaSize = " + pizzaSize;
	}
}

