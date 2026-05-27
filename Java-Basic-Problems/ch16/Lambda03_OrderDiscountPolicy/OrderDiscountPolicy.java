package ch16.Lambda03_OrderDiscountPolicy;

public class OrderDiscountPolicy {

	public static void main(String[] args) {
		Order[] orders = {
			new Order(1, "키보드", 50000, "NORMAL"),
            new Order(2, "모니터", 200000, "VIP"),
            new Order(3, "노트북", 1200000, "VVIP"),
            new Order(4, "마우스", 30000, "VIP")
		};
		System.out.println("[등급별 할인]");
		applyDiscount(orders, order -> {
			if(order.getMembershipGrade().equals("VIP")) {
				return (int)(order.getPrice()*0.9);
			}else if(order.getMembershipGrade().equals("VVIP")) {
				return (int)(order.getPrice()*0.8);
			}else{
				return order.getPrice();
			}
		});
		System.out.println();
		
		System.out.println("[금액별 할인]");
		applyDiscount(orders, order -> {
			if(order.getPrice() >= 100000) {
				return order.getPrice()-15000;
			}
			return order.getPrice();
		});
		System.out.println();
		
		System.out.println("[상품별 할인]");
		applyDiscount(orders, order -> {
			if(order.getProduct().equals("노트북")) {
				return order.getPrice()-50000;
			}
			return order.getPrice();
		});
	}
	public static void applyDiscount(Order[] orders, Discount discount) {
		for(int i=0; i<orders.length; i++) {
			int discountedPrice = discount.discount(orders[i]);
		
		System.out.println("주문번호: " + orders[i].getOrderNum() + ", 상품명: " + orders[i].getProduct() + ", 원가: " +orders[i].getPrice()+ ", 할인가: " + discountedPrice);
		}
	}

}
