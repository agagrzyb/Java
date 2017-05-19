package sheet5PracticeCreatingClasses;

public class Ex3GymMembership {

	// member variables section
	private int id; 				// membership number
	private String name;			// membership name
	private int paymentFrequency;	// payment frequency
	private double membershipCost;	// membership cost	

	static int idCounter = 100;		// a static variable to hold a default '0'
									// member number when not set 

	// Static class variables
	public static final int ONCEOFF = 1;	
	public static final int YEARLY = 2;
	public static final int MONTHLY = 3;

	//Constructors
	public Ex3GymMembership(){
		id=idCounter;
		idCounter++;
		paymentFrequency=MONTHLY;

	}						//no int id needed
	public Ex3GymMembership(String name, int paymentFrequency){
		this();
		this.name = name;
		setPaymentFrequency(paymentFrequency); // Validation
	
	}

	//Methods setters getters
	public void setName(String name){
		this.name = name;
	} 
	//this method is not needed in constructors
	public void setMembershipCost(){
		//int yearlyCost = 450;
		//int monthlycost = 40;
		//int onceOffCost = 7;

		if(paymentFrequency==ONCEOFF){
			this.membershipCost=7;				//this.membershipCost=onceOffCost;
		}else if(paymentFrequency==YEARLY){
			this.membershipCost=450;			//this.membershipCost=yearlyCost;
		}else{
			this.membershipCost=40;				//this.membershipCost=monthlyCost;
		}
	}
	public void setPaymentFrequency(int paymentFrequency){
		if (paymentFrequency>=1 && paymentFrequency<=3){
			this.paymentFrequency = paymentFrequency;
		}else{
			System.out.println("Invalid payment frequency");
		}
	}

	//no setId needed
	int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getMembershipCost(){
		return membershipCost;
	}
	public int getPaymentFrequency(){
		return paymentFrequency;
	}
	public String getPaymentFrequencyAsString(){
		switch(paymentFrequency){
		case MONTHLY:
			return "Monthly payment";
		case ONCEOFF:
			return "Once off payment";
		case YEARLY:
			return "Yearly payment";
		default:
			return "Invalid payment frequency";
		}
	}

	//toString
	public String toString(){
		return  "\nMembership number : " + Ex3GymMembership.idCounter +
				"\nName : " + getName() +
				"\nPayment Frequency : "+ getPaymentFrequencyAsString() +
				"\nMembership cost : $ " + getMembershipCost();

	}
}



