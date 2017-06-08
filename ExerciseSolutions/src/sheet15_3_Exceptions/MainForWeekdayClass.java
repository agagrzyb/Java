package sheet15_3_Exceptions;

public class MainForWeekdayClass {

	public static void main(String[] args) {
		WeekdayClassExceptions wce1 = new WeekdayClassExceptions();
		
		//try catch block
		try{
		wce1.setWeekday("monday");
		}catch(InvalidWeekdayException e){
			System.out.println("In th Main : Invalid weekday = " + e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("In the finally block");
		}
	}

}
