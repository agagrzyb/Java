package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class PieceWorker extends Employee  {
	//member variables
	private double wagePerPiece;
	private int quantity;
	
	//constructors
	public PieceWorker(){
		
	}
	public PieceWorker(String firstName, String lastName, LocalDate dateOfBirth) {
		super(firstName, lastName, dateOfBirth);

	}
	//methods, setters and getters

	//Abstract method
	public void earnings(){
		System.out.println("PieceWorker's earnings : $300");
	}

	//toString
	@Override
	public String toString() {
		return "\nPieceWorker : " + super.toString();
	}
}
