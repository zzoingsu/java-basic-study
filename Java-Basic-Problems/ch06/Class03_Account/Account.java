package ch06.Class03_Account;

public class Account {
	int accountNumber;
	String owner;
	int balance;
	
	Account(int accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	int desposit (int inputMoney) {
		return balance += inputMoney;
	}
	
}
