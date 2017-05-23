package sheet6ArraysOfObjects;

public class MainForCars {

	public static void main(String[] args) {

		// Ex1CarClass class is a template for creating an object
		Cars car1 = new Cars();
		car1.setMake("Audi");
		car1.setModel("Q");
		car1.setEngineSize(3.0);

		Cars car2 = new Cars();
		car2.setMake("Toyota");
		car2.setModel("Avensis");
		car2.setEngineSize(1.9);

		Cars car3 = new Cars("WV", "Passat", 2.2); 
		Cars car4 = new Cars("Nissan", "Micra", 1.4); 		
		Cars car5 = new Cars("Ford", "Fiesta", 1.6); 

		// Create and populate an array of Car objects
		Cars [] allCars = {car1, car2, car3, car4, car5};
		printCarsArray(allCars);
	}
	//create a method to print out the entire contents of Car array
	public static void printCarsArray(Cars [] arrayOfCars){
		//loop through the Car objects
		for(Cars oneCar : arrayOfCars)
			System.out.println(oneCar);
	}
}
