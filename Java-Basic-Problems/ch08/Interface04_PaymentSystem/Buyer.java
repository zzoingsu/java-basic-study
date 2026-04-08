package ch08.Interface04_PaymentSystem;

public class Buyer {
	Payment payment;
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void buy(int amount) {
		payment.pay(amount);
		payment.printResult();
	}

}
