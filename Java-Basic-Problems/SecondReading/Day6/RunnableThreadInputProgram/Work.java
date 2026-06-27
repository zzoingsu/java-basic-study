package SecondReading.Day6.RunnableThreadInputProgram;

public class Work {
	Runnable workA = () -> {
		for(int i=1; i<6; i++) {
			System.out.println("A 작업 " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	Thread threadA = new Thread(workA);
	
	Runnable workB = () -> {
		for(int i=1; i<6; i++) {
			System.out.println("B 작업 " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	Thread threadB = new Thread(workB);
}
