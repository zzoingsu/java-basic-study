package ch11.exceptionHandling06_InsufficientException;

public class Account {
	int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int money) throws InsufficientBalanceException {
		if(balance < money) {
			throw new InsufficientBalanceException("잔고 부족: 현재 잔액은 " + balance + "원 입니다");
		}
		balance -= money;
		System.out.println("출금 성공: 남은 잔액 " + balance + "원");
	}
}
