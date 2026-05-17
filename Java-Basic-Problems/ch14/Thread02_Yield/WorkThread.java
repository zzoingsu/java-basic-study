package ch14.Thread02_Yield;

public class WorkThread extends Thread {
	public boolean work = true;
	public boolean running = true;
	
	public WorkThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		while(running) {
			if(work) {
			System.out.println(getName() + " 작업 처리");
			} else {
				Thread.yield();
			}
			
		}
	}
}
