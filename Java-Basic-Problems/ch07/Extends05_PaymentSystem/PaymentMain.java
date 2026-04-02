package ch07.Extends05_PaymentSystem;

public class PaymentMain {

	public static void main(String[] args) {
		Payment[] payment = new Payment[2];
		
		payment[0] = new CardPayment("김철수", "현대카드");
		payment[1] = new KakaoPayment("이영희", "010-1234-1234");
		
		PaymentManager manager = new PaymentManager();
	for(int i = 0; i < payment.length; i++) {
		manager.process(payment[i]);
		if (payment[i] instanceof CardPayment cardPayment) {
			cardPayment.approveCard();
		}else if (payment[i] instanceof KakaoPayment kakaoPayment){
			kakaoPayment.sendNotification();
			}
		
		}
	
	}
	
}
