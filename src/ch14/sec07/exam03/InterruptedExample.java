package ch14.sec07.exam03;

public class InterruptedExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			return;
		} finally {
			thread.interrupt();
		}
	}

}
