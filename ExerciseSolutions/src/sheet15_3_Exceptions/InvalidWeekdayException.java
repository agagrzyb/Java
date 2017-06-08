package sheet15_3_Exceptions;

public class InvalidWeekdayException extends Exception{

	public InvalidWeekdayException() {
	}
	public InvalidWeekdayException(String message) {
		super(message);
	}	
}
