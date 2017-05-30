package sheet11InheritancePayrollSystem;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {
		
	Boss b = new Boss("Bill", "Gates", LocalDate.of(1960, Month.APRIL, 13));
	System.out.println(b);


	}

}
