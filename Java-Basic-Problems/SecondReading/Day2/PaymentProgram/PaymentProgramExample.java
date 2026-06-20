package SecondReading.Day2.PaymentProgram;

public class PaymentProgramExample {

	public static void main(String[] args) {
		Payment[] payments = {
			    new CardPayment(),
			    new KakaoPayPayment(),
			    new CashPayment()
			};
		
		for(Payment payment : payments) {
			payment.pay(5000);
		}

	}

}
