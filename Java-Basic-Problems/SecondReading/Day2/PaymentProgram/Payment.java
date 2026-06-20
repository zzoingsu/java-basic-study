package SecondReading.Day2.PaymentProgram;

public interface Payment {
	public void pay(int amount);
	
	default boolean isInvalidAmount(int amount) {
		return amount<=0;
	}
	default void printFailMessge() {
		System.out.println("결제 실패했습니다");
	}
}
