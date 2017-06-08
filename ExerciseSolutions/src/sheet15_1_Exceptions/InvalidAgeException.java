package sheet15_1_Exceptions;


 public class InvalidAgeException extends Exception {

	public InvalidAgeException() {}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}

