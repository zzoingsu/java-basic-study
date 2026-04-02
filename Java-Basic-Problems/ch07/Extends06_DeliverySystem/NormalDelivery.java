package ch07.Extends06_DeliverySystem;

public non-sealed class NormalDelivery extends Delivery {
	String company;
	
	NormalDelivery(String itemName, String company) {
		super(itemName);
		this.company = company;
	}
	@Override
	public void deliver() {
		System.out.println("일반 배송으로 상품을 보냅니다");
	}
	public void trackPackage() {
		System.out.println("배송 위치를 조회합니다");
	}

}
