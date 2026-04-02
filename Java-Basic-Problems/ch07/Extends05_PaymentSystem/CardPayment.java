package ch07.Extends05_PaymentSystem;

public class CardPayment extends Payment {
	String cardCompany;
	
	CardPayment (String user, String cardCompany) {
		super(user);
		this.cardCompany = cardCompany;
	}
	
	@Override
	public void pay() {
		System.out.println("카드로 결제합니다");
	}
	
	public void approveCard() {
		System.out.println("카드 승인을 요청합니다");
	}

}
