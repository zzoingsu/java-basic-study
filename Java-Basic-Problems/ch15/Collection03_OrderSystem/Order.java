package ch15.Collection03_OrderSystem;

public class Order {
	private int orderId;
	private String customerName;
	private int price;
	private String status;
	
	public Order(int orderId, String customerName, int price, String status) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.price = price;
		this.status = status;
	}
	
	public boolean isStatus(String status) {
		return this.status.equals(status);
	}
	
	public boolean isprice() {
		return this.price>50000;
	}
	
	public void showInfo() {
		System.out.println("주문 번호: " + orderId + ", 고객명: " + customerName + ", 금액: " + price + ", 상태: " + status);
	}

}
