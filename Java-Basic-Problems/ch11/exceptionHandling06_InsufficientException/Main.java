package ch11.exceptionHandling06_InsufficientException;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(10000); 
		try {
			account.withdraw(3000);
			account.withdraw(8000);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
