package sheet11InheritancePayrollSystem;

import java.time.LocalDate;

public class Boss extends Employee {
	//member variables

	//constructors
	public Boss() {

	}
	public Boss(String firstName, String lastName, LocalDate dateOfBirth) {
		super(firstName, lastName, dateOfBirth);

	}
	//methods, setters and getters
	
	//toString
	@Override
	public String toString() {
		return  super.toString();
	}

}
