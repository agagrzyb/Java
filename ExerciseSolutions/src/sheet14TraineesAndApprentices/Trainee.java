package sheet14TraineesAndApprentices;

public abstract class Trainee {
	//member variables
	private String name;
	private String dateOfBirth;
	private String ppsNumber;
	
	//constructors
	public Trainee() {
		
	}
	public Trainee(String name, String dateOfBirth, String ppsNumber) {
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
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
				", \nDate of Birth = " + dateOfBirth + 
				", \nPPS Number = " + ppsNumber;
	}
	
	

}
