package ch06.Class06_Account;

public class Account {
	String name;
	private int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	Account (String name) {
		this.name = name;
		balance = 0;
	}
	void deposit (int money) {
		if (money < 0) {
			System.out.println("잘못된 입력입니다");
			return;
		}if (balance + money > MAX_BALANCE) {
			System.out.println("계좌 한도를 초과했습니다\n현재 잔고: " + balance);
			return;
		}else {
			balance += money;
			System.out.println("현재 잔고: " + balance);
		}
	}
	void withdraw (int money) {
		if (money < 0) {
			System.out.println("잘못된 입력입니다");
			return;
		}if (balance - money < MIN_BALANCE) {
			System.out.println("계좌 한도를 초과했습니다\n현재 잔고: " + balance);
			return;
		}else {
			balance -= money;
			System.out.println("현재 잔고: " + balance);
		}
	}

}
