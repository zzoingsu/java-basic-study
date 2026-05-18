package ch14.Thread04_AutoBackupThread;

public class AutoBackupThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("백업 진행중...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			} 
			}
			System.out.println("백업 스레드 종료");
		}
	}