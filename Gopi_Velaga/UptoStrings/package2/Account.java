package package2;

public class Account {
	String accountholderName;
	long accountNumber;
	double balance;
	
	
	//[A.M] datatype varName; 
	
	/*Account(String name, long no, double bal){
		accountholderName = name;
		accountNumber = no;
		balance = bal;
	}*/
	
	void createAccount(String name, long accNumber, double balance) {
		accountholderName = name;
		accountNumber = accNumber;
		this.balance = balance;
	}
	
	void getDetails() {
		System.out.println("\nAccount Holder Details");
		System.out.println("Account Holder Name: "+accountholderName);
		System.out.println("Account Holder Number: "+accountNumber);
	}
	
	void withdraw(double amount) {
		if(balance >= amount) {
			balance = balance - amount;
			System.out.println("\nWithdrawl Complete");
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("\nBalance is in sufficient");
			System.out.println("Current Balance: "+balance);
		}
	}
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("\nDeposit Complete");
		System.out.println("Current Balance: "+balance);
	}
	
	void checkBalance() {
		System.out.println("\nCurrent Balance: "+balance);
	}
}
