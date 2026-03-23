package ch05.sec05;

public class StringType {

	public static void main(String[] args) {
		String strVar1 = "zzoingsu";
		String strVar2 = "zzoingsu";
		
		if ( strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("문자열이 같음");
		}
		
		String strVar3 = new String("zzoingsu");
		String strVar4 = new String("zzoingsu");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3와 strVar4는 참조가 다름");
		}
		
		if (strVar3.equals(strVar4)); {
			System.out.println("문자열이 같음");
		}
		
		String ssn = "0123453789123";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다");
			break;
		}
		int length = ssn.length();
		if (length == 13) {
			System.out.println("자리수가 맞습니다");
		}else {
			System.out.println("자리수가 틀립니다");
		}
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 불변입니다";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if (location != -1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		boolean result = subject.contains("자바");
		if (result == true) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
		String board = "1, 자바 학습,참조 타입 String을 학습합니다, zzoingsu ";
		
		String[] tokens = board.split(",");
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
