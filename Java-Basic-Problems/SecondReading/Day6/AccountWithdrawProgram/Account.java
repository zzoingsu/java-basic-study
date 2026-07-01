package SecondReading.Day6.AccountWithdrawProgram;

public class Account {
	private int balance;
	
	public Account(int balance) {
		validatedMoney(balance);
		this.balance = balance;
	}
	
	public synchronized void withdraw(int money) { 
		validatedMoney(money);
		if(balance<money) {
			System.out.println("잔액 부족");	
			return;
		} 
		balance -= money;
		System.out.println("[출금 성공] " + balance);
		}
	
	public void withdrawStart(int count, int money) {
		Runnable work = () -> {
			for(int i=0; i<count; i++) {
				withdraw(money);
				try {
					Thread.sleep(1);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				}
			};
			Thread threadA = new Thread(work);
			Thread threadB = new Thread(work);
			
			threadA.start();
			threadB.start();
			
			try {
				threadA.join();
				threadB.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
	public int getBalance() {
		return balance;
	}
	
	public static void validatedMoney(int money) {
		if(money<0) {
			throw new IllegalArgumentException("금액은 음수일 수 없습니다");
		}
	}
	
}
