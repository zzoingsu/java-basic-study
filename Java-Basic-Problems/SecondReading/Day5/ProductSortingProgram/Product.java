package SecondReading.Day5.ProductSortingProgram;

public class Product {
	private String name;
	private int price;
	private int stock;
	private String category;
	
	public Product(String name, int price, int stock, String category) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
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
	public String getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return "[이름: " + name + ", 가격: " + price + ", 재고: " + stock + ", 카테고리: " + category + "]"; 
 	}

}
