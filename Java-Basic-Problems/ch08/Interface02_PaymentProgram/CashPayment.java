package ch08.Interface02_PaymentProgram;

public class CashPayment implements Payment { 
	@Override
	public void pay (int amount) {
		System.out.println("현금으로 " + amount + "원 결제합니다");
	}

}
