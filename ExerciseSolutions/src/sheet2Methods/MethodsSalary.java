package sheet2Methods;

public class MethodsSalary{
	public static void main (String [] args){
		MethodsSalary m = new MethodsSalary();
		
		double yearlySalary = 30_000;
		m.printMonthlySalary(yearlySalary);
		m.printWeeklySalary(yearlySalary);
		m.salaryAfterPayRise(yearlySalary, 4);
		m.salaryAfterPayRise(yearlySalary, 6);	
	} //end of main
	public void printMonthlySalary(double yearlySalary){
		double result = yearlySalary/12;
		System.out.printf("Monthly Salary: %.2f\n" , result);
	}
	public void printWeeklySalary(double yearlySalary){
		double result = yearlySalary/52;
		System.out.printf("Weekly Salary: %.2f\n" , result);
	}
	public void salaryAfterPayRise(double yearlySalary, double payRise){
		double result = yearlySalary +(yearlySalary *( payRise/100 ));
		System.out.printf("Salary after Pay rise %.2f\n", result);
	}
} //end of class
