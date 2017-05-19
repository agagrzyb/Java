package sheet5PracticeCreatingClasses;

public class MainForEx1CarClass {
	public static void main(String[]args) { 

		// Ex1CarClass class is a template for creating an object
		Ex1CarClass ex1 = new Ex1CarClass();
		//
		ex1.setMake("Audi");
		ex1.setModel("Q");
		ex1.setEngineSize(3.0);
		System.out.println("Make : " + ex1.getMake());
		System.out.println("Model: " + ex1.getModel());
		System.out.println("Engine size: " + ex1.getEngineSize());
		//
		Ex1CarClass ex2 = new Ex1CarClass();
		ex2.setMake("Toyota");
		ex2.setModel("Avensis");
		ex2.setEngineSize(1.9);
		System.out.println();
		System.out.println("Make : " + ex2.getMake());
		System.out.println("Model: " + ex2.getModel());
		System.out.println("Engine size: " + ex2.getEngineSize());
		//
		Ex1CarClass ex3 = new Ex1CarClass("WV", "Passat", 2.2); 
		System.out.println();
		System.out.println(ex3);
		//
		Ex1CarClass ex4 = new Ex1CarClass("Nissan", "Micra", 1.4); 
		System.out.println();
		System.out.println(ex4);
		//
		Ex1CarClass ex5 = new Ex1CarClass("Ford", "Fiesta", 1.6); 
		System.out.println();
		System.out.println(ex5);
	}
}
