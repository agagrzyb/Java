package sheet13OwnerWithPetArray;

public class Main {

	public static void main(String[] args) {
		//Owner owner = new Owner();
		//System.out.println(owner);
			
		//Snake snake = new Snake();
		//System.out.println(snake);
		Snake snake2 = new Snake("Bambi", "Python", 2, "Yellow", true);
		//System.out.println(snake2);
		
		//Cat cat = new Cat();
		//System.out.println(cat);
		Cat cat2 = new Cat("Mimi", "Persia Cat", 1, "White", true, 7);
		//System.out.println(cat2);
		
		//Dog dog = new Dog();
		//System.out.println(dog);
		Dog dog2 = new Dog("Max", "Pug", 5, "Brown", false);
		//System.out.println(dog2);
		
		Dog dog3 = new Dog("Fred", "Spaniel", 7, "Brown", false, "1213", true);
		//System.out.println(dog3);
		
		//Hamster hamster = new Hamster();
		//System.out.println(hamster);
		Hamster hamster2 = new Hamster("Pipi", "Syrian", 2, "Golden", false);
		//System.out.println(hamster2);
		
		Owner owner2 = new Owner("Mary Lou", "Finglas Training Centre", "01-814-0250",
				new Pet [] {cat2, dog2});
		System.out.println("Owner 2 : " + owner2);
		
		System.out.println("------------------------------");
		Pet [] pets = {snake2, cat2, dog2, dog3, hamster2};
		for (Pet p : pets){
			System.out.println(p.toString());
			System.out.println("Printing abstract method....");
			System.out.println(p.getTypeOfAnimal());
		}
		
		//array of Pets
		System.out.println("\nArray of pets...  Interface.... ");
		Pet [] allPets = {snake2, cat2, dog2, dog3, hamster2};
		for(int i=0;i<allPets.length;i++){
			
			if(allPets[i] instanceof Mammal){
				((Mammal)allPets[i]).walk();
				((Mammal)allPets[i]).sleep();
			}
		}
		
		
		
	
	}

}
