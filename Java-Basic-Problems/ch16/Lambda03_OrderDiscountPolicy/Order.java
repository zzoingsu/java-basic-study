package ch16.Lambda03_OrderDiscountPolicy;

public class Order {
	private int orderNum;
	private String product;
	private int price;
	private String membershipGrade;
	
	public Order(int orderNum, String product, int price, String membershipGrade) {
		this.orderNum = orderNum;
		this.product = product;
		this.price = price;
		this.membershipGrade = membershipGrade;
	}
	public String getMembershipGrade() {
		return membershipGrade;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public String getProduct() {
		return product;
	}

}
