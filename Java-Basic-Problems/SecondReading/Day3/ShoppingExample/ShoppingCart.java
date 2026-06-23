package SecondReading.Day3.ShoppingExample;

public class ShoppingCart {
	private String owner;
	private CartItem[] items;
	private int count;

	public ShoppingCart(String owner, int maxSize) {
		this.owner = owner;
		this.items = new CartItem[maxSize];
	}
	
	public void addItem(String productName, int price, int quantity) {
		validateProductName(productName);
		validateInt(price);
		validateInt(quantity);
		if(count >= items.length) {
			System.out.println("장바구니가 가득 찼습니다");
		}else {
			items[count] = new CartItem(productName, price, quantity);
			count++;
		}
	}
	
	public int getTotalPrice() {
		int totalPrice = 0;
		for(int i=0; i<count; i++) {
			totalPrice += items[i].getPrice()*items[i].getQuantity();
		}
		return totalPrice;
	}
	
	public void printCart() {
		System.out.println(owner + "님의 장바구니");
		for(int i=0; i<count; i++) {
			System.out.println("상품명: " + items[i].getProductName() + ", 가격: " + items[i].getPrice() + "원 , 수량: " + items[i].getQuantity() + "개");
		}
	}
	class CartItem{
		private String productName;
		private int price;
		private int quantity;
		
		public CartItem (String productName, int price, int quantity) {
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}
		public String getProductName() {
			return productName;
		}
		public int getPrice() {
			return price;
		}
		public int getQuantity() {
			return quantity;
		}

	}
	public static void validateProductName(String productName) {
		if(productName == null || productName.isBlank()) {
			throw new IllegalArgumentException("상품명은 빈칸일 수 없습니다");
		}
	}
	public static void validateInt(int intValue) {
		if(intValue<=0) {
			throw new IllegalArgumentException("가격이나 수량은 0보자 작을 수 없습니다");
		}
	}
	
}
