package sheet8BankAccount;

public class MainForBankAccount {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.setName("Mary Lemon");
		acc1.setAddress("Finglas Training Centre, Finglas, D11");
		System.out.println("\n-------------MAIN---output--------------");
		System.out.println("Name : " + acc1.getName());
		System.out.println("Address : " + acc1.getAddress());
		acc1.setBalance(1000);
		System.out.println("Balance from Main : " + acc1.getBalance());
		acc1.addDeposit(100);
		System.out.println("Balance after Deposit from Main : " + acc1.getBalance());
		acc1.withdrawMoney(600);
		System.out.println("Balance after Withdraw from Main : " + acc1.getBalance());
		System.out.println("Number of Bank Accounts : " + BankAccount.numberOfBankAcc);
		System.out.println("Number of Bank Accounts : " + BankAccount.accountNumberCounter);
		


		System.out.println(acc1);
		BankAccount acc2 = new BankAccount("Jimmy Joe", "Grafton Street, Dublin 1", 2500);
		System.out.println(acc2);


	}

}
