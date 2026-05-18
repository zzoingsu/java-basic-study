package ch14.Thread04_AutoBackupThread;

public class InterruptedExample {

	public static void main(String[] args) {
		Thread thread = new AutoBackupThread();
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		thread.interrupt();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인스레드 종료");
		
	}

}
