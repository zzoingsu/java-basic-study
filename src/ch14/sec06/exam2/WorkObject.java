package ch14.sec06.exam2;

public class WorkObject {
	public synchronized void methodA() {
		Thread threadA = Thread.currentThread();
		System.out.println(threadA.getName() + ": methodA 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {}
	}
	public synchronized void methodB() {
		Thread threadB = Thread.currentThread();
		System.out.println(threadB.getName() + ": methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {}
	}

}
