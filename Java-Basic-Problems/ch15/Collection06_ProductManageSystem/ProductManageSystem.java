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
		productMap.put("P003", new Product("모니터", 180000, 5));
		productMap.put("P004", new Product("USB허브", 27000, 8));
		
		Set<Entry<String, Product>> entrySet = productMap.entrySet();
		System.out.println("전체 상품 출력");
		for(Entry <String, Product> e : entrySet) {
			System.out.println("상품코드: " + e.getKey() + e.getValue());
		}
		System.out.println();
		
		String searchCode = "P003";
		if(productMap.containsKey(searchCode)) {
			Product value = productMap.get(searchCode);
			System.out.println("검색결과: 상품코드: " + searchCode + value);
		}else {
			System.out.println("해당 상품이 없습니다");
		}
		
		String orderCode = "P001";
		int orderQuantity = 3;
		if(productMap.containsKey(orderCode)) {
			int stock = productMap.get(orderCode).getStock();
			String name = productMap.get(orderCode).getName();
			if(stock >= orderQuantity) {
				System.out.println("구매 완료: " + name + " " + orderQuantity);
				System.out.println("현재 재고: " + (stock - orderQuantity));
				productMap.get(orderCode).setStock(stock - orderQuantity);
			} else {
				System.out.println("재고가 부족합니다");
				System.out.println("현재 재고: " + stock);
			}
		}else {
			System.out.println("해당 상품이 없습니다");
		}
		System.out.println();
		
		System.out.println("[재고 부족 상품]");
		for(Entry<String, Product> e : entrySet) {
			int stock = e.getValue().getStock();
			if(stock <= 10) {
				System.out.println("상품코드: " + e.getKey() + e.getValue());
			}
		}
		
	}

}
