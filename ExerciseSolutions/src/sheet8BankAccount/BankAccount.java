package sheet8BankAccount;

public class BankAccount {

	//member variable section
	private String name;
	private String address;
	private int accountNumber;
	private int balance;

	// Static / class variables
	public static int currentInterestRate;
	public static int numberOfBankAcc;
	public static int accountNumberCounter;

	//constructors
	public BankAccount(){

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

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	//toString
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ","+ 
				" address=" + address + ","	+ 
				" accountNumber=" + accountNumber + ","+
				" balance="+ balance + "]";
	}
}
