package sheet5PracticeCreatingClasses;

public class Ex2DogClass {
	//member variables
	private String breed;
	private String colour;
	private String ownersName;

	//constructors

	public Ex2DogClass(){

	}// no validation needed so can use - 'this.' and the Set Methods can be used
	public Ex2DogClass(String breed, String colour, String ownersName) {
		this.breed = breed;
		this.colour = colour;
		this.ownersName = ownersName;
	}

	//methods
	//setters , 'this.' - refers to the current executing object
	//					- can be used to access memebers (variable and methods) of this class
	public void setBreed(String breed){
		this.breed = breed;
	}
	public void setColour(String colour){
		this.colour = colour;
	}
	public void setOwnersName(String ownersName){
		this.ownersName = ownersName;
	}
	
	//getters
	public String getBreed(){
		return this.breed;
	}
	public String getColour(){
		return this.colour;
	}
	public String getOwnersName(){
		return this.ownersName;
	}

	//toString - overriding the toString() from the Object class 
	
		@Override
		public String toString(){
			return "\nBreed :  " + breed +
					"\nColour : " + colour +
					"\nOwner's name : " + ownersName;
		}

}
