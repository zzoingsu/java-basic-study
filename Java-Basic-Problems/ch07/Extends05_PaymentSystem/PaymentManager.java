package ch07.Extends05_PaymentSystem;

public class PaymentManager {
	public void process(Payment payment) {
		payment.showUser();
		payment.pay();
	}

}
