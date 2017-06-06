package sheet12xCoffeeShop;

public class MainForOrder {

	public static void main(String[] args) {
		
		Coffee c1 =	Coffee.AMERICANO;
		System.out.println("Coffee price : $" + c1.getCoffee());
		Coffee c2 =  Coffee.ESPRESSO;
		System.out.println("Coffee : " + c2);
		String [] coffees = {};
		
		Order ord1 = new Order(new String []{"Americano"},
				Coffee.AMERICANO);
		System.out.println(ord1);
		
		Order ord2 = new Order(new String [] {"Latte"},
				Coffee.LATTE);
		System.out.println(ord2);
		
		Order ord3 = new Order(new String [] {"Flat White"},
				Coffee.FLAT_WHITE);
		System.out.println(ord3);
		
		Order ord4 = new Order (new String [] {"Mocha"},
				Coffee.MOCHA);
		System.out.println(ord4);
		
		
	}
}