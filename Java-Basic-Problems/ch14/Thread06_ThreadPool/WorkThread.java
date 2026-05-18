package ch14.Thread06_ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkThread extends Thread {
	int orderNum;
	int price;
	
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public void run() {
		
	}
	
	ExecutorService executorService = Executors.newFixedThreadPool(4);
	Future<Integer> future = executorService.submit(new Callable<Integer>() {
		@Override
		public Integer call() throws Exception {
			return null;
		}
	});

}
