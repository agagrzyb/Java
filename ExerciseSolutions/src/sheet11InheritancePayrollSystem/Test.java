package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		
	Boss boss = new Boss("Bill", "Gates", LocalDate.of(1960, Month.APRIL, 13), 5_000);
	System.out.println(boss);

	
	CommissionWorker cw = new CommissionWorker("Jimmy", "Joe",
			LocalDate.of(1956, Month.DECEMBER,24), 500, 10, 20);
	System.out.println(cw);

	
	PieceWorker pw = new PieceWorker("Mary", "Rose",
			LocalDate.of(1975, Month.FEBRUARY, 14), 20, 45);
	System.out.println(pw);
	
	
	HourlyWorker hw = new HourlyWorker("John", "Lemon", 
			LocalDate.of(1980, Month.MARCH, 17), 15, 42);
	System.out.println(hw);
	
	Employee [] allEmpl = {boss, cw, pw, hw};
	System.out.println("\nPrinting an Array of Employee Objects");
	for (Employee one: allEmpl){
		System.out.println(one);
	//	System.out.println(one.getEarnings());
		
	}
	System.out.println("\nLooping again....");
	for(int i = 0;i < allEmpl.length;i++){
		System.out.println(allEmpl[i]);
	}

	
	


	}

}
