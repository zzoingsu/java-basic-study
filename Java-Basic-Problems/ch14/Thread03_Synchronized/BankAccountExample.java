package ch14.Thread03_Synchronized;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);
		
		WorkThread t1 = new WorkThread("User1Thread" , account, 7000);
		WorkThread t2 = new WorkThread("USer2Thread" , account, 7000);
		
		t1.start();
		t2.start();
	}

}
