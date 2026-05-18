package ch14.Thread06_ThreadPool;

public class Order {
	Order[] orders = new Order[20];
	
	private int orderNum;
	private int price;
	private int totalSum;
	
	WorkThread thread = new WorkThread();
	
	public Order(int orderNum, int price) {
		this.orderNum = orderNum;
		this.price = price; 
	}
	
	
	
	public void ShowInfo() {
		System.out.println("");
	}

}
