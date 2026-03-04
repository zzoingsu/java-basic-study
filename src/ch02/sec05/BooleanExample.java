package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		int x = 10;
		boolean result1 = (x == 20);  // 변수 x 의 값이 20인가? 
		boolean result2 = (x != 20);  // 변수 x 의 값이 20이 아닌가? 
		boolean result3 = (x > 20);   // 변수 x 의 값이 20보다 큰가?
		boolean result4 = (0 < x && x < 20);  //변수 x 의 값이 0보다 크고 20보다 작은가?
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		System.out.println("result3: "+ result3);
		System.out.println("result4: "+ result4);
	
		
		boolean stop = true;   // 변수 stop 이 true 라면  false 라면 시작합니다 출력 
		if (stop) {            // if 조건식은 참일떄만 실행됨으로 변수 stop 을 거짓으로 바꿔도 조건식은 실행되지않는다 
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}
		
		int y = 10;
		boolean result5 = (y == 20);  // 변수 y 의 값이 20인가?
		boolean result6 = (y != 20);  // 변수 y 의 값이 20이 아닌가?
		System.out.println("result5: "+ result5);
		System.out.println("result6; "+ result6);
	}

}
