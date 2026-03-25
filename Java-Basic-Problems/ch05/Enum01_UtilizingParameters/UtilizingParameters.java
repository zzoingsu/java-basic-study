package ch05.Enum01_UtilizingParameters;

public class UtilizingParameters {

	public static void main(String[] args) {
	if (args[0] == "0") {
		System.out.println("요일을 입력하세요");
	}if (args[0] == "MONDAY") {
		System.out.println("오늘은 월요일입니다");
	}else if (args[0] == "SUNDAY") {
		System.out.println("오늘은 일요일입니다");
	}else {
		System.out.println("평일 또는 토요일입니다");
	}
	}
/** 수정및개선 방향
 * 1. args[0] == "0" 은 입력없음 검사가 아님 -> length로 바꿔야함
 * 2.== 가 아니라 .equals를 사용해야한다(객체가 같은지 비교하는게 아니라 무낮열이 같은지를 확인하는것이기때문에) 
 */
	}


