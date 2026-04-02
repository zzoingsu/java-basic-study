package ch07.Extends06_DeliverySystem;

public sealed class Delivery permits RocketDelivery, NormalDelivery {
	protected String itemName;
	
	Delivery(String itemName) {
		this.itemName = itemName;
	}
	
	public void deliver() {
		System.out.println("상품을 배송합니다");
		}
	public void showItem() {
		System.out.println("상품명: " + itemName);
	}

}
