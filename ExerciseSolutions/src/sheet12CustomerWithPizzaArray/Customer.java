package sheet12CustomerWithPizzaArray;

public class Customer {
	//member variables
	private String name;
	private String address;
	private String phone;
	private Pizza [] pizzas; // an array of Pizza objects
		
	//constructor	
	public Customer(String name, String address, String phone, Pizza[] pizzas) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pizzas = pizzas;
	}
	//methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Pizza[] getPizzas() {
		return pizzas;
	}
	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}//getTotalCost only... and loop through all pizzas to calculate TotalCost
	public double getTotalCost() {
		double totalCost = 0;
		
		for(Pizza one : pizzas ){
			totalCost += one.calculatePrice();
		}
		return totalCost;
	}
	 //toString
	public String toString(){
	String text = "Name : " + name;
	text += "\nAddress: " + address;
	text += "\nPhone : " + phone;
	
	for(int i = 0; i < pizzas.length;i++ ){
		text +="\n" + (i + 1) + ": " + pizzas[i];
		if(i != pizzas.length - 1)
			text += ", ";
	}
	text += String.format("\nTotal Cost : $%.2f", getTotalCost());
	
	return text;
 }
}