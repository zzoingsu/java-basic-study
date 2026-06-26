package SecondReading.Day5.OrderManagingProgram;

import java.util.Comparator;
import java.util.List;

public class OrderManagingProgramExample {

	public static void main(String[] args) {
		List<Order> orders = List.of(
			    new Order("O001", "winter", "키보드", 50000, 1, true),
			    new Order("O002", "summer", "마우스", 30000, 2, false),
			    new Order("O003", "winter", "노트북", 1500000, 1, false),
			    new Order("O004", "spring", "의자", 100000, 4, true),
			    new Order("O005", "fall", "책상", 200000, 1, true)
			);
		orders.stream()
			.filter(order -> order.isDelivered())
			.forEach(order -> System.out.println(order));
		System.out.println();
		
		orders.stream()
			.filter(order -> !order.isDelivered())
			.forEach(order -> System.out.println(order));
		System.out.println();
		
		orders.stream()
			.filter(order ->order.getTotalPrice()>=100000)
			.forEach(order -> System.out.println(order));
		System.out.println();
		
		orders.stream()
			.filter(order ->order.getCustomerName().equals("winter"))
			.forEach(order -> System.out.println(order));
		System.out.println();
		
		int totalPrice = orders.stream()
				.mapToInt(Order :: getTotalPrice)
				.sum();
		System.out.println(totalPrice + "원\n");
		
		long countNotDelivered = orders.stream()
				.filter(order -> !order.isDelivered())
				.count();
		System.out.println(countNotDelivered + "\n");
		
		orders.stream()
			.sorted(Comparator.comparing(Order :: getPrice))
			.forEach(order -> System.out.println(order));
		System.out.println();
		
		orders.stream()
			.sorted(Comparator.comparing(Order :: getPrice).reversed())
			.forEach(order -> System.out.println(order));
		System.out.println();
		
		List<String> productName = orders.stream()
				.map(Order :: getProductName)
				.toList();
		System.out.println(productName);
	}

}
