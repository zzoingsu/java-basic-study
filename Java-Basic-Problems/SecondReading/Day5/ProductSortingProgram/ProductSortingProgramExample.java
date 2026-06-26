package SecondReading.Day5.ProductSortingProgram;

import java.util.List;

public class ProductSortingProgramExample {

	public static void main(String[] args) {
		List<Product> products = List.of(
			    new Product("키보드", 50000, 10, "전자기기"),
			    new Product("마우스", 30000, 0, "전자기기"),
			    new Product("노트북", 1500000, 5, "전자기기"),
			    new Product("책상", 200000, 2, "가구"),
			    new Product("의자", 100000, 8, "가구")
			);
		products.stream()
			.filter(product -> product.getPrice()>=100000)
			.forEach(product -> System.out.println(product));
		System.out.println();
		
		products.stream()
			.filter(product -> product.getStock()>=1)
			.forEach(product -> System.out.println(product));
		System.out.println();
		
		products.stream()
			.sorted((p1, p2) -> Integer.compare(p1.getPrice(), p2.getPrice()))
			.forEach(product -> System.out.println(product));
		System.out.println();
		
		products.stream()
			.sorted((p1, p2) -> Integer.compare(p2.getPrice(), p1.getPrice()))
			.forEach(product -> System.out.println(product));
		System.out.println();

		int sum = products.stream()
			.mapToInt(Product :: getPrice)
			.sum();
		System.out.println(sum + "\n");
		
		int totalStock = products.stream()
				.mapToInt(Product :: getStock)
				.sum();
		System.out.println(totalStock + "\n");
		
		List<String> productname = products.stream()
				.map(Product :: getName)
				.toList();
		System.out.println(productname);
	}

}
