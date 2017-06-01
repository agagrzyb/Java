package sheet12CustomerWithPizzaArray;

import java.util.Arrays;

public class Customer {
	//member variables
	private String name;
	private String address;
	private String phone;
	private Pizza [] pizzas; // an array of Pizza objects
	private double totalCost;
		
	//constructors
	public Customer(){
		
	}
	public Customer(String name, String address, String phone, Pizza[] pizzas) {
		super();
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
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	 //toString
	@Override
	public String toString() {
		return "\nCustomer name = " + name + 
				"\nAddress = " + address + 
				"\nPhone = " + phone + 
				"\nPizzas = "+ Arrays.toString(pizzas) + 
				"\nTotal Cost = " + getTotalCost() ;
	}
}