package sheet14TraineesAndApprentices;

public class MainForTrainee {

	public static void main(String[] args) {
		ComputerAidedDeign cad1 = new ComputerAidedDeign("Mary Lou", "12-12-1980", "12345678m");
		System.out.println("\nComputer Aided Design : \n" + cad1);
		
		Electrician electr1 = new Electrician("Jimmy Joe", "11-11-1979", "14789562k");
		System.out.println("\nElectrician : \n" + electr1);
		
		Carpenter carp1 = new Carpenter("John Lennon", "10-10-1978", "");
		System.out.println("\nCarpenter : \n" + carp1);
		
		SoftwareDeveloper sd1 = new SoftwareDeveloper("Steven Big", "04-05-0981", "78996312f");
		System.out.println("\nSoftware Developer : \n" + sd1);
	
	}

}
