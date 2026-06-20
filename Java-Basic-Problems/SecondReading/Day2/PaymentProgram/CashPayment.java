package SecondReading.Day2.PaymentProgram;

public class CashPayment implements Payment {
	@Override
	public void pay(int amount) {
		if(isInvalidAmount(amount)) {
			printFailMessge();
			return;
		}
		System.out.println("현금으로 " + amount + "원 결제했습니다");
	}


}
