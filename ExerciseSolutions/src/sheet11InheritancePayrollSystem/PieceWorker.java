package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class PieceWorker extends Employee  {
	//member variables
	private double wagePerPiece;
	private int quantity;
	private double earnings;

	//constructors
	public PieceWorker(){

	}
	public PieceWorker(String firstName, String lastName, LocalDate dateOfBirth,
			double wagePerPiece, int quantity) {
		super(firstName, lastName, dateOfBirth);
		this.wagePerPiece = wagePerPiece;
		this.quantity = quantity;

	}
	//methods, setters and getters

	public double getWagePerPiece() {
		return wagePerPiece;
	}
	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//Implementing Abstract Method from Parent class
	public double getEarnings(){
		earnings = wagePerPiece*quantity;
		return earnings;
		//System.out.println();
	}

	//toString
	@Override
	public String toString() {
		return "\nPieceWorker : " + super.toString() + 
				"\nWage Per Piece : $" + wagePerPiece + 
				"\nQuantity : " + quantity + " items" +
				"\n***PieceWorker Earnings*** : $" + getEarnings();
	}
}
