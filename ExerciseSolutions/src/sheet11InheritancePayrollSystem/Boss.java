package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class Boss extends Employee {
	//member variables
	private double weeklySalary;
	private double earnings;

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
	//Implementing Abstract Method from Parent class, 
	//an earnings method to calculate the Boss's earnings
	public double getEarnings(){
		earnings = weeklySalary*52;
		return earnings;
		//System.out.println("");
	}

	//toString
	@Override
	public String toString() {
		return "\nBoss : " + super.toString() +
				"\nWeekly Salary : $" + weeklySalary +
				"\n***Boss Earnings*** : $" + getEarnings();
	}

}
