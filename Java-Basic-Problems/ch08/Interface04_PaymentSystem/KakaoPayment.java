package ch08.Interface04_PaymentSystem;

public class KakaoPayment implements Payment { 
	@Override
	public void pay(int amount) {
		System.out.println("카카오페이로 " + amount + "원 결제합니다.");
	}

}
