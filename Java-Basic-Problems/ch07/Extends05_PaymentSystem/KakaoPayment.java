package ch07.Extends05_PaymentSystem;

public class KakaoPayment extends Payment {
	String phoneNumber;
	
	KakaoPayment (String user, String phoneNumber) {
		super(user);
		this.phoneNumber = phoneNumber;
	}
	@Override
	public void pay() {
		System.out.println("카카오페이로 결제합니다");
	}

	public void sendNotification() {
		System.out.println("결제 알림을 전송합니다");
	}
}
