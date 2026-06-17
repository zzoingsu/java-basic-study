package SecondReading.Day1.ProductInventoryManagementSystem;

public class ProductInventorymanagermentSystemExample {

	public static void main(String[] args) {
		Product product = new Product(1, "키보드", 50000, 10);

		product.decreaseStock(3);
		product.increaseStock(5);
		product.decreaseStock(20); 

		System.out.println(product);
	}

}
