package ch06.Class07_AccountManagementProgram;

public class Account {	
	int accountNumber;
	String accountHolder;
	int accountBalance;
	
	Account (int accountNumber, String accountHolder, int initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = initialDeposit;
	}
	
	void deposit (int depositMoney) {
		if (depositMoney < 0) {
			System.out.println("결과> *잘못된 입력입니다*");
			return;
		}
		this.accountBalance += depositMoney;
		System.out.println("결과> 예금이 성공되었습니다");
	}
	
	void withdraw (int withdrawMoney) {
		if (withdrawMoney < 0) {
			System.out.println("결과> *잘못된 입력입니다*");
			return;
		}
		if (accountBalance < withdrawMoney) {
			System.out.println("결과> *계좌 잔액이 부족합니다*");
			return;
		}
		this.accountBalance -= withdrawMoney;
		System.out.println("결과> 출금이 성공되었습니다");
	}
	
	boolean checkAccountNumber (int accountNumber) {
		if (this.accountNumber == accountNumber) {
			return true; 
		}else {
			return false;
		}
	}
	
	void showAccountInfo () {
		System.out.println( accountNumber + "\t" + accountHolder + "\t" + accountBalance );
	}

	
	static Account findAccount(Account[] accounts, int accountNumber) {
		for ( int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].checkAccountNumber(accountNumber)) {
				return accounts[i];
			}
		}
		return null;
	}
}
