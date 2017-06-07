package sheet15_1_Exceptions;

public class EmployeeClassExceptions {

	//member variables section
	private String name;
	private int age;
	private double salary;
	private int noOfSickDays;

	//Static / class variables
	public static int employeeNumberCounter;

	//Constructors
	//Default constructor
	public EmployeeClassExceptions(){
		employeeNumberCounter++;
	}
	//Constructor setting the name
	public EmployeeClassExceptions(String name){
		this();
		setName(name);
	}
	//Constructor setting all the member variables
	public EmployeeClassExceptions(String name, int age, double salary, 
			int noOfSickDays, double incrSalary){
		this();
		setName(name);
		setAge(age);
		setSalary(salary);
		setNoOfSickDays(noOfSickDays);
	}

	//methods, setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getNoOfSickDays() {
		return noOfSickDays;
	}
	public void setNoOfSickDays(int noOfSickDays) {
		this.noOfSickDays = noOfSickDays;
	}

	//not needed
	//public int getEmployeeNumber() {
	//	return employeeNumber;
	//}
	//public void setEmployeeNumber(int employeeNumber) {
	//	this.employeeNumber = employeeNumber;
	//}
	//increase salary method
	public double increaseSalary(){
		double incrSalary = salary *1.08;
		return incrSalary;
	}
	//toString
	@Override
	public String toString(){
		return "\nEmployee name : " + name +
				"\nAge : " + age +
				"\nSalary : $ " + salary +
				"\nNo of sick days : " + noOfSickDays +
				String.format("\nIncrease salary : $ %.2f ", increaseSalary());
	}
}
