package sheet12CustomerWithPizzaArray;

public class Pizza {

	//member variables
	private String [] toppings;
	private PizzaSize pizzaSize;

	//String [] toppings = {"cheese", "mushrooms", "onions", "chicken"};
	//public PizzaSize pizzaSize; // enums, in PizzaSize file

	//constructors
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
		//pizzaSize = PizzaSize.getBasePrice();
	}
	public double calculatePrice(){
		return pizzaSize.getBasePrice() + pizzaSize.getPricePerTopping() * toppings.length;
	}
	//toString
	@Override
	public String toString() {
		String text = "Pizza toppings = ";
		for(int i = 0; i< toppings.length; i++){
			text +=toppings[i];
			if(i != toppings.length - 1)
				text += ", ";
		}
		text += ", pizzaSize = " + pizzaSize;
		text += String.format(", Price = $%.2f", calculatePrice());
		return  text;
	}
}

