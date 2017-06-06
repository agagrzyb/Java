package sheet13OwnerWithPetArray;

public class Dog extends Pet implements Mammal {
	//member variables
	private String microChipNumber;
	private boolean isMicroChipped;
	
	public static final boolean IS_MICRO_CHIPPED = true;
	public static final boolean IS_NOT_MICRO_CHIPPED = false;
	
	//constructors
	public Dog() {

	}
	public Dog(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
		
	}
	public Dog(String name, String breed, int age, String colour, boolean isFemale, String microChipNumber,
			boolean isMicroChipped) {
		super(name, breed, age, colour, isFemale);
		this.microChipNumber = microChipNumber;
		this.isMicroChipped = isMicroChipped;
	}
	//methods
	/*
	public String getMicroChipNumber() {
		return microChipNumber;
	}
	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}
	public boolean isMicroChipped() {
		return isMicroChipped;
	}
	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}
	public static boolean isMicroChipped() {
		return IS_MICRO_CHIPPED;
	}
	public static boolean isNotMicroChipped() {
		return IS_NOT_MICRO_CHIPPED;
	}
	*/
	
	public String getTypeOfAnimal(){
		return " Dog";
	}	
	
	// interface Mammal
		@Override
	public void sleep() {
			System.out.println(getName() + " Sleep time...");
		
	}
	@Override
	public void walk() {
		System.out.println(getName() + " Walk time...");
		
	
	}
	//toString
	@Override
	public String toString() {
		return "Dog : " + super.toString() +
				", Micro Chip Number = " + microChipNumber + 
				", is Micro-Chipped ? : " + String.format( (isMicroChipped == true) ? "Yes" : "No");
	}
	
}
