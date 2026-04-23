package ch11.exceptionHandling04_printScore;

public class ExceptionHandling {
	public static void parseScore(String data) {
		try {
		int parseData = Integer.parseInt(data);
		System.out.println("점수: " + parseData);
		}catch(NumberFormatException e) {
			System.out.println("잘못된 점수입력입니다");
		}finally {
			System.out.println("[score 검사 종료]");
		}
	}
	
	public static void main(String[] args) {
		parseScore("90");
		System.out.println();
		parseScore("구십");
	}
}
