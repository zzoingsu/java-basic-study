package SecondReading.Day4.DuplicateIdCheckingProgram;

public class DuplicateIdCheckingProgramExample {

	public static void main(String[] args) throws Exception {
		NicknameManager manager = new NicknameManager();

		manager.addNickname("winter");
		manager.addNickname("summer");
		manager.addNickname("winter");

		System.out.println(manager.containsNickname("summer"));

		manager.removeNickname("spring");
		manager.printNicknames();

	}

}
