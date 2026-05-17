package ch14.Thread03_Synchronized;

public class WorkThread extends Thread {
	private BankAccount bankAccount;
	private int money;
	
	public WorkThread(String name, BankAccount bankAccount, int money) {
		setName(name);
		this.bankAccount = bankAccount;
		this.money = money;
	}
	
	@Override
	public void run() {
		try {
			bankAccount.withDraw(money);
		} catch (InterruptedException e) {
			return;
		}
	}

}
