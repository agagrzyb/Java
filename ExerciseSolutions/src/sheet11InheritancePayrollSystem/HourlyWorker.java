package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class HourlyWorker extends Employee {
	//member variables
	private double wage;
	private double hoursWorked;
	
	//constructors
	public HourlyWorker(){
		
	}
	public HourlyWorker(String firstName, String lastName, LocalDate dateOfBirth) {
		super(firstName, lastName, dateOfBirth);

	}
	//methods, setters and getters

	//Abstract method
	public void earnings(){
		System.out.println("HourlyWorker's earnings : $200");
	}

	//toString
	@Override
	public String toString() {
		return "\nHourlyWorker : " + super.toString();
	}
}
