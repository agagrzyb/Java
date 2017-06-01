package sheet13OwnerWithPetArray;

public class Hamster extends Pet  {
	
	//constructors

	public Hamster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hamster(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
		// TODO Auto-generated constructor stub
	}	
	//methods

	public String getTypeOfAnimal(){
		return " ";
	}
	//toString
	public String toString(){
		return "Hamster : " + super.toString();
	}

}
