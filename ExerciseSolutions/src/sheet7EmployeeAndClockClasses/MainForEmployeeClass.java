package sheet7EmployeeAndClockClasses;

public class MainForEmployeeClass {

	public static void main(String[] args) {
		EmployeeClass Employee1 = new EmployeeClass();
		System.out.print("Employee number : " + 
				EmployeeClass.employeeNumberCounter);
		Employee1.setName("Mary");
		Employee1.setAge(45);
		Employee1.setSalary(45_000);
		Employee1.setNoOfSickDays(6);
		System.out.println(Employee1);

		System.out.println("----------------------");
		EmployeeClass Employee2 = new EmployeeClass();
		System.out.print("Employee number : " + 
				EmployeeClass.employeeNumberCounter);
		Employee2.setName("John");
		Employee2.setAge(40);
		Employee2.setSalary(48_000);
		Employee2.setNoOfSickDays(8);
		System.out.println(Employee2);

		System.out.println("----------------------");
		EmployeeClass Employee3 = new EmployeeClass();
		System.out.print("Employee number : " + 
				EmployeeClass.employeeNumberCounter);
		Employee3.setName("Nick");
		Employee3.setAge(28);
		Employee3.setSalary(28_000);
		Employee3.setNoOfSickDays(12);
		System.out.println(Employee3);
	}


}
