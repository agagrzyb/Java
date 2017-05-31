package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public final class CommissionWorker extends Employee  {
	//member variables
	private double salary;
	private double commission;
	private int quantity;
	private double earnings;
	
	//constructors
	public CommissionWorker(){
		
	}
	public CommissionWorker(String firstName, String lastName, LocalDate dateOfBirth, double salary,
			double commission, int quantity) {
		super(firstName, lastName, dateOfBirth);
		this.salary = salary;
		this.commission = commission;
		this.quantity = quantity;

	}
	//methods, setters and getters
	

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	//Implementing Abstract Method from Parent class
	public double getEarnings(){
		earnings = salary + (commission*quantity);
		return earnings;
		//System.out.println();
	}

	//toString
	@Override
	public String toString() {
		return "\nCommisionWorker : " + super.toString() +
				"\nSalary : $" + salary + 
				"\nCommission : $" + commission + " per item" +
				"\nQuantity : " + quantity + " items" +
				"\n***CommissionWorker Earnings*** : $" + getEarnings();
	}
}
