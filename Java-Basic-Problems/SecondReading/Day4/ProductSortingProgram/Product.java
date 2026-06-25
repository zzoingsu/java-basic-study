package SecondReading.Day4.ProductSortingProgram;

public class Product {
	private int productId;
	private String name;
	private int price;
	private int stock;
	
	public Product(int productId, String name, int price, int stock) {
		validatePrice(price);
		validateStock(stock);
		
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	@Override
	public String toString() {
		return "상품 번호: " + productId + ", 상품명: " + name + ", 상품 가격: " + price + ", 재고: " + stock; 
	}
	public static void validatePrice(int price) {
		if(price<0) {
			throw new IllegalArgumentException("가격은 0보다 커야합니다");
		}
	}
	public static void validateStock(int stock) {
		if(stock<0) {
			throw new IllegalArgumentException("재고는 0보다 커야합니다");
		}
	}

}
