package ch07.Extends05_PaymentSystem;

public class Payment {
	protected String user;
	
	Payment(String user) {
		this.user = user;
	}
	
	public void pay() {
		System.out.println("결제를 진행합니다");
	}
	public void showUser() {
		System.out.println("사용자: " + user);
	}

}
