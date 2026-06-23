package SecondReading.Day3.ShoppingExample;

public class ShoppingMain {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart("winter", 3);

		cart.addItem("키보드", 50000, 1);
		cart.addItem("마우스", 30000, 2);
		cart.addItem("모니터", 200000, 1);
		cart.addItem("노트북", 1500000, 1);

		cart.printCart();
		System.out.println("총 금액: " + cart.getTotalPrice() + "원");

	}

}
