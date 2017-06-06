package sheet13OwnerWithPetArray;

public class Hamster extends Pet implements Mammal {

	//constructors

	public Hamster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hamster(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);

	}	
	//methods

	public String getTypeOfAnimal(){
		return "Hamster";
	}

	//interface Mammal
	@Override
	public void sleep() {
		System.out.println(getName() + " Sleep time...");

	}

	@Override
	public void walk() {
		System.out.println(getName() + " Walk time...");

	}
	//toString
	public String toString(){
		return "Hamster : " + super.toString();
	}

}
