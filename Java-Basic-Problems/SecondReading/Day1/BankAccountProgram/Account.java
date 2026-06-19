package SecondReading.Day1.BankAccountProgram;

public class Account {
	private static final int MIN_BALANCE = 0;
	private static int accountCount;

	private final String accountNumber;
	private String owner;
	private int balance;
	
	public Account(String accountNumber, String owner, int balance) {
		validateMoney(balance);
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
		accountCount++;
	}
	public void deposit(int amount) {
		validateMoney(amount);
		this.balance += amount;
		System.out.println("입금 완료");
	}
	public void withdraw(int amount) {
		validateMoney(amount);
		if(balance<amount) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		this.balance -= amount;
		System.out.println("출금 완료");
	}
	
	@Override
	public String toString() {
		return "Account{accountNumber='" + accountNumber + "', owner='" + owner + "', balance=" + balance + "}"; 
	}
	
	public static void validateMoney (int balance) {
		if(balance<MIN_BALANCE) {
			throw new  IllegalArgumentException("금액은 음수가 될수 없습니다");
		}
	}
	public static int getAccountCount() {
		return accountCount;
	}


}
