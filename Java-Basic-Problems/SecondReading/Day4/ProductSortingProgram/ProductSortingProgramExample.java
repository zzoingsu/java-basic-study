package SecondReading.Day4.ProductSortingProgram;

public class ProductSortingProgramExample {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();

		manager.addProduct(new Product(1, "키보드", 50000, 10));
		manager.addProduct(new Product(2, "마우스", 30000, 30));
		manager.addProduct(new Product(3, "모니터", 200000, 5));

		manager.printProductsByPriceAsc();
		System.out.println();
		manager.printProductsByStockDesc();
		System.out.println();
		manager.printProductsByNameAsc();

	}

}
