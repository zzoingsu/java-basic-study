package SecondReading.Day6.JoinExample;

public class Work {
	Runnable workA = () -> {
		System.out.println("A 작업 실행");
	};
	Thread threadA = new Thread(workA);
	
	Runnable workB = () -> {
		System.out.println("B 작업 실행");
	};
	Thread threadB = new Thread(workB);

	public void startThreadA() {
		threadA.start();
	}
	
	public void startThreadB() {
		threadB.start();
	}
}
