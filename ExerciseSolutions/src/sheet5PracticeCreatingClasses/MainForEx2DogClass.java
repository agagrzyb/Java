package sheet5PracticeCreatingClasses;

public class MainForEx2DogClass {

	public static void main(String[] args) {
		// class template for creating an object
		//	Ex2DogClass dog = new Ex2DogClass();

		Ex2DogClass dog1 = new Ex2DogClass("Boxer", "Brown", "John"); 
		System.out.println();
		System.out.println(dog1);
		//
		Ex2DogClass dog2 = new Ex2DogClass("Beagle", "Black", "Terry"); 
		System.out.println();
		System.out.println(dog2);
		//
		Ex2DogClass dog3 = new Ex2DogClass("Bulldog", "Grey", "Mary"); 
		System.out.println();
		System.out.println(dog3);
	}
}
