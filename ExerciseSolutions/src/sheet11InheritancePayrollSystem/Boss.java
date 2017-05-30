package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class Boss extends Employee {
	//member variables
	private double weeklySalary;

	//constructors
	public Boss(){
		
	}
	public Boss(String firstName, String lastName, LocalDate dateOfBirth, double weeklySalary) {
		super(firstName, lastName, dateOfBirth);
		this.weeklySalary = weeklySalary;
	}
	//methods, setters and getters

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	//Abstract method
	public void earnings(){
		System.out.println();
	}

	//toString
	@Override
	public String toString() {
		return "\nBoss : " + super.toString() +
				"\nWeekly Salary : $" + weeklySalary;
	}

}
