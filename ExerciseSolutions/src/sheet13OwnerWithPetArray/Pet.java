package sheet13OwnerWithPetArray;

public abstract class Pet {
	//member variables
	private String name;
	private String breed;
	private int age;
	private String colour;
	private boolean isFemale;
	
	public static final boolean FEMALE = true;
	public static final boolean MALE = false;
	
	//constructors
	public Pet(){
		
	}
	public Pet(String name, String breed, int age, String colour, boolean isFemale) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
	}
	//methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	//abstract method
	public abstract String getTypeOfAnimal();
	
	
	//public static boolean isFemale() {
	//	return FEMALE;
	//}
	//public static boolean isMale() {
	//	return MALE;
	//}
	//toString
	@Override
	public String toString() {
		return "Pet name = " + name + 
				", breed = " + breed + 
				", age = " + age + 
				", colour = " + colour + 
				", Female or Male ? : " + String.format( (isFemale == true) ? "Female" : "Male");
	}
}
//(average >= 50) ? "Pass" : "Fail";