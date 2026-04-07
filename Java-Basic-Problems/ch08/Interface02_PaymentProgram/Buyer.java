package ch08.Interface02_PaymentProgram;

public class Buyer {
	void buy (Payment payment, int amount) {
		payment.pay(amount);
	}

}
