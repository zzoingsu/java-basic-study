package ch06.Class03_BankAccount;

public class AccountExample {

	public static void main(String[] args) {
		Account myAccount = new Account( "01234512345","zzoingsu",0);
		
		myAccount.deposit(10000);
		myAccount.withdraw(12000);
		myAccount.withdraw(1000);
		myAccount.showBalance();
		
	}

}
