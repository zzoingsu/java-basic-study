package ch07.Extends06_DeliverySystem;

public final class RocketDelivery extends Delivery {
	int arrivalHours;
	
	RocketDelivery(String itemName, int arrivalHours) {
		super(itemName);
		this.arrivalHours = arrivalHours;
	}
	@Override
	public void deliver() {
		System.out.println("로켓배송으로 빠르게 배송합니다");
	}
	@Override
	public void showItem() {
		System.out.println("로켓배송 상품: " + itemName + ", 도착예정 " + arrivalHours + "시간");
	}
	public void checkFastDelivery() {
		System.out.println("빠른 배송 상품을 확인합니다");
	}

}
