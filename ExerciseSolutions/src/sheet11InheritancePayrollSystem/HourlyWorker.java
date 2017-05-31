package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class HourlyWorker extends Employee {
	//member variables
	private double wage;
	private double hoursWorked;
	private double earnings;

	//constructors
	public HourlyWorker(){

	}
	public HourlyWorker(String firstName, String lastName, LocalDate dateOfBirth,
			double wage, double hoursWorked) {
		super(firstName, lastName, dateOfBirth);
		this.wage = wage;
		this.hoursWorked = hoursWorked;

	}
	//methods, setters and getters

	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	//Implementing Abstract Method from Parent class
	public double getEarnings(){
		// calculating overtime	

		if(hoursWorked>40){
			earnings = wage*40 +( wage*(hoursWorked- 40)* 1.5);

		}else{
			earnings = wage*hoursWorked;
		}
		return earnings;
		//System.out.println();
	}

	//toString
	@Override
	public String toString() {
		return "\nHourlyWorker : " + super.toString() + 
				"\nWage : $" + wage + 
				"\nHours worked : " + hoursWorked +
				"\n***HourlyWorker Earnings*** : $" + getEarnings();
	}
}
