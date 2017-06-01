package sheet13OwnerWithPetArray;

public class Cat extends Pet {
	//member variables
	private int numOfLives;
	
	//constructors
	public Cat() {
	}

	public Cat(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
	}
	
	public Cat(String name, String breed, int age, String colour, boolean isFemale, int numOfLives) {
		super(name, breed, age, colour, isFemale);
		this.numOfLives = numOfLives;
	}

	//methods
	public int getNumOfLives() {
		return numOfLives;
	}

	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}
	public void justLostALife(){
		
	}

	public String getTypeOfAnimal(){
		return " ";
	}
	//toString

	@Override
	public String toString() {
		return "Cat  : " + super.toString() +
				",  Number of Lives = " + numOfLives;
	}
}
