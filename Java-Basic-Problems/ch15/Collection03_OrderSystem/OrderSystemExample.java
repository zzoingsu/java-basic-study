package ch15.Collection03_OrderSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderSystemExample {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001, "홍길동", 12000, "READY"));
		list.add(new Order(1002, "김자바", 85000, "SHIPPED"));
		list.add(new Order(1003, "이자바", 43000, "READY"));
		list.add(new Order(1004, "박테스트", 15000, "CANCELLED"));
		list.add(new Order(1005, "최백엔드", 99000, "READY"));
		
		Iterator<Order> iterator = list.iterator(); 
		System.out.println("[전체 주문]");
		while(iterator.hasNext()) {
			Order order = iterator.next();
			order.showInfo();
		}
		System.out.println();
		
		Iterator<Order> iterator2 = list.iterator(); 
		System.out.println("[READY 주문]");
		while(iterator2.hasNext()) {
			Order order = iterator2.next();
			if(order.isStatus("READY")) {
				order.showInfo();
			}
		}
		System.out.println();
		
		Iterator<Order> iterator3 = list.iterator(); 
		System.out.println("[50000원 이상 주문]");
		while(iterator3.hasNext()) {
			Order order = iterator3.next();
			if(order.isprice()) {
				order.showInfo();
			}
		}
		System.out.println();
		
		Iterator<Order> iterator4 = list.iterator();
		System.out.println("[CANCELLED 삭제후]");
		while(iterator4.hasNext()) {
			Order order = iterator4.next();
			if(order.isStatus("CANCELLED")) {
				iterator4.remove();
			}
		}
		System.out.println("총 주문 수: " + list.size());
	}

}
