package sheet15_1_Exceptions;

public class MainForEmployeeClassExceptions {

	public static void main(String[] args) {
		EmployeeClassExceptions Employee1 = new EmployeeClassExceptions();
		System.out.print("Employee number : " + 
				EmployeeClassExceptions.employeeNumberCounter);
		Employee1.setName("Mary");
		Employee1.setAge(45);
		Employee1.setSalary(45_000);
		Employee1.setNoOfSickDays(6);
		System.out.println(Employee1);

		System.out.println("----------------------");
		EmployeeClassExceptions Employee2 = new EmployeeClassExceptions();
		System.out.print("Employee number : " + 
				EmployeeClassExceptions.employeeNumberCounter);
		Employee2.setName("John");
		Employee2.setAge(40);
		Employee2.setSalary(48_000);
		Employee2.setNoOfSickDays(8);
		System.out.println(Employee2);

		System.out.println("----------------------");
		EmployeeClassExceptions Employee3 = new EmployeeClassExceptions();
		System.out.print("Employee number : " + 
				EmployeeClassExceptions.employeeNumberCounter);
		Employee3.setName("Nick");
		Employee3.setAge(28);
		Employee3.setSalary(28_000);
		Employee3.setNoOfSickDays(12);
		System.out.println(Employee3);
	}


}
