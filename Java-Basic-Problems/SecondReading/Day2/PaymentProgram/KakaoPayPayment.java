package SecondReading.Day2.PaymentProgram;

public class KakaoPayPayment implements Payment {
	@Override
	public void pay(int amount) {
		if(isInvalidAmount(amount)) {
			printFailMessge();
			return;
		}
		System.out.println("카카오페이로 " + amount + "원 결제했습니다");
	}


}
