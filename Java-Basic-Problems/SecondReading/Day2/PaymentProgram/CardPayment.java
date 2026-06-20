package SecondReading.Day2.PaymentProgram;

public class CardPayment implements Payment{
	@Override
	public void pay(int amount) {
		if(isInvalidAmount(amount)) {
			printFailMessge();
			return;
		}
		System.out.println("카드로 " + amount + "원 결제했습니다");
	}

}
