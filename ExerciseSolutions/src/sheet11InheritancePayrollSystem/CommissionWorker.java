package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class CommissionWorker extends Employee  {
	//member variables
	private double salary;
	private double commission;
	private int quantity;
	
	//constructors
	public CommissionWorker(){
		
	}
	public CommissionWorker(String firstName, String lastName, LocalDate dateOfBirth) {
		super(firstName, lastName, dateOfBirth);

	}
	//methods, setters and getters

	//Abstract method
	public void earnings(){
		System.out.println("CommissionWorker's earnings : $100");
	}

	//toString
	@Override
	public String toString() {
		return "\nCommisionWorker : " + super.toString();
	}
}
