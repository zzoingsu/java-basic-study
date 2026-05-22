package ch15.Collection06_ProductManageSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProductManageSystem {

	public static void main(String[] args) {
		Map<String, Product> productMap = new HashMap<>();
		
		productMap.put("P001", new Product("키보드", 35000, 10));
		productMap.put("P002", new Product("마우스", 22000, 15));
		productMap.put("P003", new Product("모니터", 18000, 5));
		productMap.put("P004", new Product("USB허브", 27000, 8));
		
		Set<Entry<String, Product>> entrySet = productMap.entrySet();
		System.out.println("전체 상품 출력");
		for(Entry <String, Product> e : entrySet) {
			System.out.println("상품코드: " + e.getKey() + e.getValue());
		}
	}

}
