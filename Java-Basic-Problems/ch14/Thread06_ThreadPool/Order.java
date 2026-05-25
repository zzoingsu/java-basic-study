package ch14.Thread06_ThreadPool;

public class Order {
	private int orderNum;
	private int price;
	private int deliveryCharge;
	private int totalSum;
	
	public Order(int orderNum, int price) {
		this.orderNum = orderNum;
		this.price = price; 
		this.deliveryCharge = calculateDeliveryCharge(price);
		this.totalSum = price + deliveryCharge;
	}
	
	public int calculateDeliveryCharge(int price) {
		if(price >= 50000) {
			return 0;
		} else {
			return 3000;
		}
	}
	
	@Override
	public String toString() {
		return "주문 번호: " + orderNum + ", 주문금액: " + price + "원, 배송비: " + deliveryCharge + "원, 최종금액: " + totalSum + "원";
	}

}