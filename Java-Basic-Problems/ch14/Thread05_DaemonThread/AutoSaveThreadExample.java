package ch14.Thread05_DaemonThread;

public class AutoSaveThreadExample {

	public static void main(String[] args) {
		Thread thread = new AutoSaveThread();
		boolean daemonThread = false;
		if(daemonThread) {
			thread.setDaemon(true);
		}
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}

}
