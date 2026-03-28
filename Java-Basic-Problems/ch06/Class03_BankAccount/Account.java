package ch06.Class03_BankAccount;

public class Account {
	String accountNumber;
	String owner;
	int balance;
	
	Account(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit (int money) {
		if (money < 0) {
			System.out.println("잘못된 금액입니다");
		}else {
		balance += money;
		System.out.println("현재 잔액: " + balance);
		}
	}
	void withdraw (int money) {
		if (balance < money) {
			System.out.println("잔액이 부족합니다");
		}else if (money < 0) {
			System.out.println("잘못된 금액입니다");
		}else {
		balance -= money;
		System.out.println("현재 잔액: " + balance);
		}
	}
	void showBalance () {
		System.out.println("현재 잔액: " +  balance);
	}
}
