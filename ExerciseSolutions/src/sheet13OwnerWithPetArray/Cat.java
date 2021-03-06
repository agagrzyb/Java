package sheet13OwnerWithPetArray;

public class Cat extends Pet implements Mammal {
	//member variables
	private int numOfLives=9;

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
		numOfLives--;
	}

	public String getTypeOfAnimal(){
		return " Cat";
	}

	//from interface...

	@Override
	public void sleep() {
		System.out.println(getName() + " Sleep time...");
	}
	@Override
	public void walk() {
		System.out.println(getName() + " "
				+ "Walk time...");
	}

	//toString

	@Override
	public String toString() {
		return "Cat  : " + super.toString() +
				",  Number of Lives = " + numOfLives;

	}
}