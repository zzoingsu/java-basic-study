package ch14.Thread01_WorkThread;

public class WorkThreadExample {

	public static void main(String[] args) {
		WorkThread threadA = new WorkThread("Thread-A");
		WorkThread threadB = new WorkThread("Thread-B");
		
		threadA.start();
		threadB.start();
	}

}
