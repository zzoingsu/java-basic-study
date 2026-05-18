package ch14.Thread05_DaemonThread;

public class AutoSaveThread extends Thread{
	@Override
	public void run() {
		while(true) {
		System.out.println("자동 저장 완료");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			break;
		}
		}
	}

}
