package ch14.Thread03_Synchronized;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized boolean withDraw(int money) throws InterruptedException {
		if(balance < money || money < 0) {
			System.out.println(Thread.currentThread().getName() +" 출금 실패: " + money + ", 현재 잔액: " + getBalance());
			return false;
		}else {
			Thread.sleep(1000);
			balance -= money;
			System.out.println(Thread.currentThread().getName() +" 출금 성공: " + money + ", 남은 잔액: " + getBalance());
			return true;
		}
	}

}
