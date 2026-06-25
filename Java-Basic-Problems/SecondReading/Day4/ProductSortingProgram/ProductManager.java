package SecondReading.Day4.ProductSortingProgram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	public void printAllProducts() {
		for(Product product : products) {
			System.out.println(product);
		}
	}
	public void printProductsByPriceAsc() {
		List<Product> copiedProducts = new ArrayList<>(products);
		copiedProducts.sort(Comparator.comparingInt(Product :: getPrice));
		for(Product product : copiedProducts) {
			System.out.println(product);
		}
	}
	public void printProductsByStockDesc() {
		List<Product> copiedProducts = new ArrayList<>(products);
		copiedProducts.sort(Comparator.comparingInt(Product :: getStock).reversed());
		for(Product product : copiedProducts) {
			System.out.println(product);
		}
	}
	public void printProductsByNameAsc() {
		List<Product> copiedProducts = new ArrayList<>(products);
		copiedProducts.sort(Comparator.comparing(Product :: getName));
		for(Product product : copiedProducts) {
			System.out.println(product);
		}
	}
}
