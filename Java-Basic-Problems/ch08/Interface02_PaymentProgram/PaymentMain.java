
package ch08.Interface02_PaymentProgram;

public class PaymentMain {
	public static void main(String[] args) { 
		Buyer buyer = new Buyer();
		
		Payment cardPayment = new CardPayment();
		buyer.buy(cardPayment, 10000);
		
		Payment cashPayment = new CashPayment();
		buyer.buy(cashPayment, 5000);
	}

}
