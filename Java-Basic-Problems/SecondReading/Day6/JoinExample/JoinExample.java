package SecondReading.Day6.JoinExample;

public class JoinExample {

	public static void main(String[] args) {
		Work work = new Work();
		
		work.startThreadA();
		work.startThreadB();
		
		try {
			work.threadA.join();
			work.threadB.join();
			System.out.println("모든 작업 종료");
		} catch(InterruptedException e) {
			e.printStackTrace();
		} 
	}

}
