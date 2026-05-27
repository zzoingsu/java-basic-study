package ch16.Lambda03_OrderDiscountPolicy;

@FunctionalInterface
public interface Discount {
	public int discount(Order order);
}
