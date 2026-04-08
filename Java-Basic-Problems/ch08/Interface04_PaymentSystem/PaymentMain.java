package ch08.Interface04_PaymentSystem;

public class PaymentMain {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		
		buyer.setPayment(new CardPayment());
		buyer.buy(12000);
		
		buyer.setPayment(new KakaoPayment());
		buyer.buy(8000);
	}

}
