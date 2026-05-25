package ch14.Thread06_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderRegister {
	public static void main(String[] args) {
		int[] orderPrice = {
				 12000, 85000, 43000, 51000, 9900,
				 76000, 30000, 50000, 49900, 150000,
				 22000, 67000, 39000, 91000, 45000,
				 18000, 53000, 70000, 28000, 60000
		};
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for(int i=0; i<orderPrice.length; i++) {
			final int orderNum = i+1;
			final int price = orderPrice[i];
			executorService.execute(() -> {

                Order order = new Order(orderNum, price);

                System.out.println(Thread.currentThread().getName() + " - " + order);

            });

        }
		}
}
