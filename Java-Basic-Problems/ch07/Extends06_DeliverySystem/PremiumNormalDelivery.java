package ch07.Extends06_DeliverySystem;

public class PremiumNormalDelivery extends NormalDelivery {
	boolean morningArrival;
	
	PremiumNormalDelivery(String itemName, String company, boolean morningArrival) {
		super(itemName, company);
		this.morningArrival = morningArrival;
	}
	@Override
	public void deliver() {
		System.out.println("프리미엄 일반 배송을 시작합니다");
	}
	
	public void showPremiumService() {
		System.out.println("프리미엄 배송 서비스를 제공합니다");
	}

}
