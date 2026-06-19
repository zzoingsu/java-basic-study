package SecondReading.Day1.BankAccountProgram;

public class BankAccountProgramExample {

	public static void main(String[] args) {
		Account acc1 = new Account("111-111", "김자바", 10000);
		Account acc2 = new Account("222-222", "이자바", 5000);

		acc1.deposit(3000);
		acc1.withdraw(20000);
		acc2.withdraw(1000);

		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println("전체 계좌 수: " + Account.getAccountCount());


	}

}
