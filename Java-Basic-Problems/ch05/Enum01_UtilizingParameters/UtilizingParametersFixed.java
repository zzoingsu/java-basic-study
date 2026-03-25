package ch05.Enum01_UtilizingParameters;

public class UtilizingParametersFixed {

	public static void main(String[] args) {
		enum Week {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
			}
			
			if (args.length == 0) {
				System.out.println("요일을 입력하세요");
			}else {
			Week today = Week.valueOf(args[0]); // 문자열과 enum은 직접 비교하는게 안되기떄문에 타입 변환을 시키고 비교해준다
			if (today.equals(Week.MONDAY)) {
				System.out.println("오늘은 월요일입니다");
			}else if (today.equals(Week.SUNDAY)) {
				System.out.println("오늘은 일요일입니다");
			}else {
				System.out.println("평일 또는 토요일입니다");
			}
			}
	}

}
