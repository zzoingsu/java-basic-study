package ch17.Stream03_DiscountProgram;

public class Product {
	private String name;
	private String category;
	private int price;
	
	public Product(String name, String category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	
	public boolean isElectronicDevice() {
		return category.equals("전자기기");
	}
	public boolean isPriceOver50000() {
		return price >= 50000;
	}
}
