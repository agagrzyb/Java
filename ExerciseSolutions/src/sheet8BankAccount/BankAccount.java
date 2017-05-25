package sheet8BankAccount;

public class BankAccount {

	//member variable section
	private String name;
	private String address;
	private double balance;


	// Static / class variables
	private static double currentInterestRate = 3;
	public static int numberOfBankAcc;
	public static int accountNumberCounter= 50008000;


	//constructors
	// Should be PRIVATE so account must be created with min: name and address. 
	public BankAccount(){
		numberOfBankAcc++;
		accountNumberCounter++;

	}
	public BankAccount(String name, String address, double balance){
		this();
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	//methods, setters & getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance > 0){
			this.balance = balance;
		}else{
			System.out.println("Balance is $ 0.00");
		}
	}

	public double calculateInterest(){
		double currentInterestRate = 1.03;
		balance = balance * currentInterestRate; 
		return balance;
	}
	public void addDeposit(double deposit){
		balance = balance + deposit;
	}
	public void withdrawMoney(double withdraw){
		balance = balance - withdraw;
	}

	//toString
	@Override
	public String toString() {
		return "\n---------------CLASS--output--------------- " +
				"\nName : " + name + 
				"\nAddress : " + address + 
				"\nBalance : $" + balance  +
				"\nCurrent interest rate : % " + currentInterestRate +
				"\nBalance with interest : $" + calculateInterest() +
				//"\nDeposit Money : $"  + 
				//"\nWithdraw Money : $" + 
				"\nBalance : $" + balance  +
				"\nNumber of Bank Accounts : " + numberOfBankAcc +
				"\nAccount number counter : " + accountNumberCounter;
	}
}
