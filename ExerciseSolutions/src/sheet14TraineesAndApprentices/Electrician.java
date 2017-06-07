package sheet14TraineesAndApprentices;

import java.time.LocalDate;

public class Electrician extends Trainee implements Apprentice{
	
	private int phase;
	private String employersName;

	public Electrician() {

	}

	public Electrician(String name, LocalDate dateOfBirth, String ppsNumber, int phase , String employersName) {
		super(name, dateOfBirth, ppsNumber);
		this.employersName = employersName;
		this.phase = phase;
	}
	//implement the inherited abstract methods
	@Override
	public void setPhase() {
	}
	@Override
	public int getPhase() {
		return phase;
	}
	@Override
	public void setEmployersName() {
	}
	@Override
	public String getEmployersName() {
		return employersName;
	}
	public void printPhase(){
		
	}
	//toString
	@Override
	public String toString() {
		return "Electrician "  + super.toString() +
				"\nPhase = " + phase + 
				"\nEmployers Name = " + employersName;
	}
}
