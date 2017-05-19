package sheet2Methods;

public class Ex8MethodsSalary{
	public static void main (String [] args){
		
		int yearlySalary;
		yearlySalary = 30_000;
		double payRise;
		payRise = 1.04;
		
		Ex8MethodsSalary m = new Ex8MethodsSalary();
		
		double answer1 = m.getMonthlySalary(yearlySalary);
		System.out.println("result " + answer1);
		double answer2 = m.getWeeklySalary(yearlySalary);
		System.out.println("result " + answer2);
		double answer3 = m.getSalaryAfterPayRise(yearlySalary, payRise);
		System.out.println("result " + answer3);
		
	} //end of main
	public double getMonthlySalary(int yearlySalary){
		double result;
		result = yearlySalary/12;
		return result;
	}
	public double getWeeklySalary(int yearlySalary){
		double result;
		result = yearlySalary/52;
		return result;
	}
	public double getSalaryAfterPayRise(int yearlySalary, double payRise){
		double result;
		result = yearlySalary * payRise;
		return result;
	}
	
} //end of class

/*
	public static void main(String [] args){
			
		Ex7CalculateVolume m = new Ex7CalculateVolume();
		
		double answer = m.getArea(3.33, 5.5, 2.2);
		System.out.println("result " + answer);
	
	}
	public double getArea(double depth, double width, double breadth) {
		double result;
		result = (depth * width * breadth);	
	
	return result;
	}
	
*/