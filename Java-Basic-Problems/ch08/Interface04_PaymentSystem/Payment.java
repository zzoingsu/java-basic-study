package ch08.Interface04_PaymentSystem;

public interface Payment {
	void pay(int amount);
	
	default void printResult() {
		System.out.println("결제가 완료되었습니다.");
	}

}
