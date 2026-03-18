package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()* 6) + 1;
		
		switch (num) {
			case 1:
				System.out.println("1번이 나왔습니다");
				break;   //break를 생략하면 case의 값과 상관없이 출력된다
			case 2:
				System.out.println("2번이 나왔습니다");
				break;
			case 3:
				System.out.println("3번이 나왔습니다");
				break;
			case 4:
				System.out.println("4번이 나왔습니다");
				break;
			case 5:	
				System.out.println("5번이 나왔습니다");
				break;
			default:  // default가 필요없을때는 생략 가능
				System.out.println("6번이 나왔습니다");
		}
		
		char grade = 'B';
		
		switch (grade) {
			case 'A','a':
				System.out.println("우수 회원입니다");
				break;
			case 'B','b':
				System.out.println("일반 회원입니다");
				break;
			default:
				System.out.println("손님입니다");
		}
		
		switch (grade) {
			case 'A','a' -> {   // -> 를 사용하면 break 안써도 정상적으로 출력된다
				System.out.println("우수 회원입니다");	
			}
			case 'B','b' -> {     // -> 와 : 는 동시에 사용하면 오류가 난다
				System.out.println("일반 회원입니다");
			}
			default -> {
				System.out.println("손님 입니다");
			}
				
		}
		String rate = "B";
		// 자바 11 이전 문법
		int Score1 = 0;
		switch(rate) {
			case "A":
				Score1 = 100;
				break;
			case "B" :
				int result = 100 - 20;
				Score1 = result;
				break;
			default:
				Score1 =60;
		}
		System.out.println("Score1: " + Score1);
		
		// 자바 13부터 가능
		int Score2 = switch(rate) {
			case "A" -> 100;  //  기존에 Score에 저장된 100이 ->으로 바로 반환된다
			case "B" -> {
				int result =100 -20;
				yield result;   // result에 저장된값이 yield로 인해서 Score2로 반환
			}
			default -> 60;
		};
		System.out.println("score2: " + Score2);
	
}
}