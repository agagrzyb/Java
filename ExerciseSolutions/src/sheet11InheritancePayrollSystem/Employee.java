package sheet11InheritancePayrollSystem;

import java.time.LocalDate; 

public abstract class Employee {
	//member variables
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	//constructors
	public Employee(){
		
	}
	public Employee( String firstName, String lastName, LocalDate dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	//methods, setters and getters
		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth(){
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	
	//Abstract method
	
	//toString
	public String toString(){
		return "\nFirst name : " + firstName +
				"\nLast name : " + lastName +
				"\nEmployee dateOfBirth : "+dateOfBirth;
				//String.format("%g%02d%d",
				//		dateOfBirth.get(ChronoField.DAY_OF_MONTH),
				//		dateOfBirth.get(ChronoField.MONTH_OF_YEAR),
				//		dateOfBirth.get(ChronoField.YEAR));
						
	}

}
