package SecondReading.Day6.RunnableThreadInputProgram;

public class RunnableThreadInputProgramExample {

	public static void main(String[] args) {
		Work work = new Work();
		
		work.threadA.start();
		work.threadB.start();

	}

}
