package sheet5PracticeCreatingClasses;

public class Ex1CarClass {

	// member variables section, always PRIVATE, access to them from outside the class must go through the PUBLIC methods ... ENCAPSULATION
	private String make;
	private String model;
	private double engineSize;

	//constructors - Never has a return type
	//			   - Sets up an object in memory,  
	//'default constructor'- 'no args-constructor' for using: Ex1CarClass ex1 = new Ex1CarClass();
	// 
	public Ex1CarClass(){

	}
	public Ex1CarClass(String make, String model, double engineSize){
		//set the value passed in directly to the member variable,
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
	}

	//methods - set methods allow access from outside the class to the private members variables
	//        - set methods pass values and assign them to the member variable
	//		  - methods can include validation

	//setters
	public void setMake(String newMake){
		make = newMake;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setEngineSize(double newEngineSize){
		engineSize = newEngineSize;
	}

	//getters
	//		- each get method will return a member variable
	public String getMake(){
		return make;
	}
	public String getModel(){
		return model;
	}
	public double getEngineSize(){
		return engineSize;
	}

	//toString - overriding the toString() from the Object class 

	@Override
	public String toString(){
		return "\nMake is:  " + make +
				"\nModel is: " + model +
				"\nEngine size is: " + engineSize;
	}

}
