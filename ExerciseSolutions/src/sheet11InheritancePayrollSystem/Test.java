package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		
	Boss b = new Boss("Bill", "Gates", LocalDate.of(1960, Month.APRIL, 13), 150_000);
	System.out.println(b);
	b.earnings();
	
	CommissionWorker cw = new CommissionWorker("Jimmy", "Joe",LocalDate.of(1956, Month.DECEMBER, 24));
	System.out.println(cw);
	cw.earnings();
	
	PieceWorker pw = new PieceWorker("Mary", "Rose", LocalDate.of(1975, Month.FEBRUARY, 14));
	System.out.println(pw);
	pw.earnings();
	
	HourlyWorker hw = new HourlyWorker("John", "Lemon", LocalDate.of(1980, Month.MARCH, 17));
	System.out.println(hw);
	hw.earnings();
	
	


	}

}
