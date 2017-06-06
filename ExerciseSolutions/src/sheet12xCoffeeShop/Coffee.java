package sheet12xCoffeeShop;

public enum Coffee {
	//values or constants
	//enum  datatype(value)
	AMERICANO(2.50),
	FLAT_WHITE(2.75),
	LATTE(2.75),
	MOCHA(2.90),
	CAPUCCINO(2.90),
	ESPRESSO(2.00);
	
	private double coffee;
	
	//constructor
	private Coffee(double coffee){
		this.coffee=coffee;
	}
	// get method, retrieving the member variable values for
	// each constant/value
	public double getCoffee(){
		return coffee;
	}
}
