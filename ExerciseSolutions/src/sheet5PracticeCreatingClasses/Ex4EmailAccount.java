package sheet5PracticeCreatingClasses;

public class Ex4EmailAccount {

	// member variables section
	private int id;					// user id
	private String emailAddress; 	// must contain '@' and '.'
	private String password;		// must be less than 20 char
	private int limit;				// PREMIUM, BASIC, FREE
	static int idCounter;			// user idCounter

	// static class variables
	public static final int PREMIUM = 1;
	public static final int BASIC = 2;
	public static final int FREE = 3;

	// constructors
	public Ex4EmailAccount(){
		id=idCounter;
		idCounter++;
	}
	public Ex4EmailAccount(String emailAddress, String password, int limit){
		this();
		setEmailAddress(emailAddress);	// Validation
		setPassword(password); 			// Validation
		setLimit(limit);				// Validation
	}
	// methods, setters&getters
	// set&get for emailAddress
	public void setEmailAddress(String emailAddress){
		if( (emailAddress.contains("@")) && (emailAddress.contains(".")) ){
			this.emailAddress=emailAddress;
		}else{
			System.out.println("Invalid email address");
		}
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	// set&get for password
	public void setPassword(String password){
		if(password.length()<=20){
			this.password=password;
		}else{
			System.out.println("Password is too long");
		}
	}
	public String getPassword(){
		return password;
	}
	// set&get for limit
	public void setLimit(int limit){
		switch(limit){
		case BASIC:
		case FREE:
		case PREMIUM:
			this.limit=limit;
			break;
		default:
			System.out.println("Invalid maximum storage limit, setting to Free");
			this.limit = FREE;
			break;
		}
	}
	public int getLimit(){
		return limit;
	}
	// get ONLY for user id
	int getId(){
		return id;
	} 
	// get AsString
	private String getLimitAsString(){
		switch(limit){
		case BASIC:
			return "Basic 500 GB";
		case PREMIUM:
			return "Premium 1TB";
		default:
			return "Free 100 GB";
		}
	}
	// toString
	public String toString(){
		return "\nUser number : " + Ex4EmailAccount.idCounter + 
				"\nEmail address : " + emailAddress +
				"\nPassword : " + password + 
				"\nMaximum storage limit : " + getLimitAsString();
	}

}
