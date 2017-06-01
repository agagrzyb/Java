package sheet12CustomerWithPizzaArray;

public class MainForPizza {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		System.out.println(c1);
		Customer c2 = new Customer("John Lemon", "Finglas Training Centre", "87-123-4567",
								new Pizza[]{new Pizza(new String[]{"cheese"}, PizzaSize.MEDIUM)});
		Customer c3 = new Customer("Mary Lou", "Grafton street, Dublin 1", "089-456-4758",
								new Pizza[]{new Pizza(new String[]{"cheese, onions"}, PizzaSize.EXTRA_LARGE)});
		System.out.println(c2);
		System.out.println(c3);

		Pizza p1 = new Pizza();
		System.out.println(p1);
		//Pizza p2 =  new Pizza(/*toppings,*/ PizzaSize.LARGE);
		//System.out.println(p2);


	}

}

//PizzaSize p1 = PizzaSize.MEDIUM;
//System.out.println(p1.getBasePrice());
//System.out.println(p1.getPricePerTopping());

//String [] toppings = {"cheese", "tomato"};

//Pizza p1 = new Pizza (toppings, PizzaSize.SMALL);