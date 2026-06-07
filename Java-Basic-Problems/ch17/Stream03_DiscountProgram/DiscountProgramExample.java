package ch17.Stream03_DiscountProgram;

import java.util.ArrayList;
import java.util.List;

public class DiscountProgramExample {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("키보드", "전자기기", 50000));
		list.add(new Product("마우스", "전자기기", 30000));
		list.add(new Product("노트", "문구", 5000));
		list.add(new Product("모니터", "전자기기", 200000));
		list.add(new Product("펜", "문구", 2000));
		list.add(new Product("헤드셋", "전자기기", 80000));
	
		list.stream()
			.filter(Product :: isElectronicDevice)
			.filter(Product :: isPriceOver50000)
			.map(product -> (int)(product.getPrice()*0.9))
			.forEach(System.out :: println);   
		
	}
}


