package sheet14TraineesAndApprentices;

import java.time.LocalDate;
import java.time.Month;

public class MainForTrainee {

	public static void main(String[] args) {
		ComputerAidedDesign cad1 = new ComputerAidedDesign("Mary Lou", LocalDate.of(1988, Month.APRIL, 7), "12345678m");
		System.out.println("\nComputer Aided Design : \n" + cad1);
		SoftwareDeveloper sd1 = new SoftwareDeveloper("Steven Big", LocalDate.of(1981, Month.DECEMBER, 24), "78996312f");
		System.out.println("\nSoftware Developer : \n" + sd1);

		Electrician electr1 = new Electrician("Jimmy Joe", LocalDate.of(1987, Month.FEBRUARY, 14), "14789562k", Carpenter.PHASE_ONE , "Electric Ireland");
		System.out.println("\nElectrician : \n" + electr1);
		Electrician electr2 = new Electrician("Ray Duffy", LocalDate.of(1969, Month.JANUARY, 1), "12121212J", Apprentice.PHASE_TWO , "Power Ltd");
		System.out.println("\nElectrician : \n" + electr2);
		Electrician electr3 = new Electrician("Adam White", LocalDate.of(1991, Month.JULY, 5), "45645456A", Apprentice.PHASE_FIVE , "BG IRE");
		System.out.println("\nElectrician : \n" + electr3);

		Carpenter carp1 = new Carpenter("John Lennon", LocalDate.of(1988, Month.NOVEMBER, 11), "94785263p", 2 , "Carpets LTD");
		System.out.println("\nCarpenter : \n" + carp1);
		Carpenter carp2 = new Carpenter("Patrick Brown", LocalDate.of(1977, Month.JUNE, 7), "78777878E", Electrician.PHASE_THREEE , " Woodies");
		System.out.println("\nCarpenter : \n" + carp2);
		Carpenter carp3 = new Carpenter("Arthur King", LocalDate.of(1960, Month.SEPTEMBER, 30), "99999987W", 6 , "B&Q");
		System.out.println("\nCarpenter : \n" + carp3);
		
		//Loop through the array, every time an apprentice is encountered and they are currently
		//in phase two, print out the apperentice's name and their employer's name
		System.out.println("\n---- Array -----");
		Trainee []  allTrainees = {cad1, sd1, electr1, electr2, electr3, carp1, carp2, carp3};
		for (Trainee one : allTrainees){
			if(one instanceof Apprentice && ((Apprentice)one).getPhase()==2){
				System.out.println("Apprentice PHASE TWO Employers Name : " + 
						((Apprentice) one).getEmployersName() +
						"\nApprentice's name : " + one.getName()); //one.getName()!!!! to get name

			}
		}
	}
}
