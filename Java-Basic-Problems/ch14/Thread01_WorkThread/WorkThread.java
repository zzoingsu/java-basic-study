package ch14.Thread01_WorkThread;

public class WorkThread extends Thread {
	public WorkThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(getName() + "- 작업 " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				return;
			}
		}
	}

}
