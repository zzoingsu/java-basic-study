package ch09.Nested02_RemoteControl;

public class OrderService {	
	public void processOrder(String productName, int price) {
		class Receipt {
			public void printReceipt(){
				System.out.println("상품명: " + productName);
				System.out.println("가격: " + price);
				System.out.println("주문이 완료되었습니다");
			}
		}
		Receipt receipt = new Receipt();
		receipt.printReceipt();
	}
}
