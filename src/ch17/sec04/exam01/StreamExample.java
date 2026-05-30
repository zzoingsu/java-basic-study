package ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		for(int i=0; i<6; i++) {
			Product product = new Product(i, "상품"+i, "좋은회사", (int)(Math.random()*10000));
			list.add(product);
		}
		Stream<Product> listStream = list.stream();
		listStream.forEach(p -> System.out.println(p));
	}

}
