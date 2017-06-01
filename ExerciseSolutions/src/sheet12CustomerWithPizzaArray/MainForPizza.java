package sheet12CustomerWithPizzaArray;

import java.util.ArrayList;

public class MainForPizza {

	public static void main(String[] args) {
		Customer c1 = new Customer("Jimmy Joe", "Malahide Road, Dublin 13", "01-123-4567", 
						new Pizza[]{new Pizza(new String[]{"tomato"}, PizzaSize.SMALL)});
		Customer c2 = new Customer("John Lemon", "Finglas Training Centre", "87-123-4567",
						new Pizza[]{new Pizza(new String[]{"cheese"}, PizzaSize.MEDIUM)});
		Customer c3 = new Customer("Mary Lou", "Grafton street, Dublin 1", "089-456-4758",
						new Pizza[]{new Pizza(new String[]{"cheese, onions"}, PizzaSize.EXTRA_LARGE)});
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//an ArrayList
		System.out.println("\n------An ArrayList------\n");
		Customer [] customersList = {c1, c2, c3};
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		for(Customer one : customerList){
			System.out.println(one);
		}
	}
}
