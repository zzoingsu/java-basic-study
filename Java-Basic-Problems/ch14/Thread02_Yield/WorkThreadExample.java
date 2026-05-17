package ch14.Thread02_Yield;

public class WorkThreadExample {

	public static void main(String[] args) throws Exception {
		WorkThread workThreadA = new WorkThread("WorkThreadA");
		WorkThread workThreadB = new WorkThread("WorkThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		Thread.sleep(3000);
		workThreadA.work = false;
		
		Thread.sleep(3000);
		workThreadA.work = true;
		
		Thread.sleep(3000);
		workThreadA.running = false;
		workThreadB.running = false;
	}

}