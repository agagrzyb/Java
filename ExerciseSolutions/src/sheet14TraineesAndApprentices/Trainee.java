package sheet14TraineesAndApprentices;

import java.time.LocalDate;
import java.time.temporal.ChronoField;;

public abstract class Trainee {
	//member variables
	private String name;
	private LocalDate dateOfBirth;
	private String ppsNumber;
	
	//constructors
	public Trainee() {
		
	}
	public Trainee(String name, LocalDate dateOfBirth, String ppsNumber) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.ppsNumber = ppsNumber;
	}
	//methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPpsNumber() {
		return ppsNumber;
	}
	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	
	//toString
	@Override
	public String toString() {
		return "Trainee name = " + name + 
				", \nDate of Birth = " + 
				String.format("%02d/%02d/%d",dateOfBirth.get(ChronoField.DAY_OF_MONTH),
										dateOfBirth.get(ChronoField.MONTH_OF_YEAR),
										dateOfBirth.get(ChronoField.YEAR)) + 
				", \nPPS Number = " + ppsNumber;
	}
}
