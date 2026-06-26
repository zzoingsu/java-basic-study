package SecondReading.Day5.OrderManagingProgram;

import lombok.Data;

@Data
public class Order {
	private String orderId;
	private String customerName;
	private String productName;
	private int price;
	private int quantity;
	private boolean delivered;
	
	public Order(String orderId, String customerName, String productName, int price, int quantity, boolean delivered) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.delivered = delivered;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public int getTotalPrice() {
		return price * quantity;
	}
	
	public String toString() {
		return "[주문 번호: " + orderId + ", 고객명: " + customerName + ", 제품명: " + productName + ", 가격: " + price + ", 수량: " + quantity + ", 배송 여부: " + delivered + "]";
	}

}
