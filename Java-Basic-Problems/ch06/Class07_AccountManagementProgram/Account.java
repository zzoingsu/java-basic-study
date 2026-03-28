package ch06.Class07_AccountManagementProgram;

public class Account {	
	String accountNumber;
	String accountHolder;
	int accountBalance;
	
	Account (String accountNumber, String accountHolder, int initialDeposit) {
		this.accountHolder = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = initialDeposit;
	}
	
	void deposit (int inputMoney) {
		if (inputMoney < 0) {
			System.out.println("결과> *잘못된 입력입니다*");
			return;
		}
		this.accountBalance += inputMoney;
		System.out.println("결과> 입금이 성공되었습니다");
	}
	void withDraw (int inputMoney) {
		if (inputMoney < 0) {
			System.out.println("결과> *잘못된 입력입니다*");
			return;
		}
		if (accountBalance < inputMoney) {
			System.out.println("결과> *계좌 잔액이 부족합니다*");
			return;
		}
		this.accountBalance -= inputMoney;
		System.out.println("결과> 출금이 성공되었습니다");
	}
	
	void showAcountInfo () {
		System.out.println( accountNumber + "\t" + accountHolder + "\t" + accountBalance + "\n");
	}
}
