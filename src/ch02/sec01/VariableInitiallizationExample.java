package ch02.sec01;
/**
 * @author zzoingsu
 */
/*
 * title: VariableInitallizationExample
 * date: 2026.03.03
 */
public class VariableInitiallizationExample {

	public static void main(String[] args) {
		int value = 90;
		int result = value + 10;
		System.out.println(result);

		
		
		int hour= 3;
		int minute= 5;
		System.out.println(hour + "시간" + minute + "분" );
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute +"분"); 
		// 콘솔에 출력할때 (") 사용하기 (') 사용하면 "시간"이 두글자여서 (') 사용불가
		// 또한 '을 사용하더라도 시와 분을 아스키코드로  인식해서 컴파일은 되지만 잘못된 결과 출력
		// 콘솔에 출력할때 hour에 저장된값과 minute에 저장된값이 문자 취급됨으로 + 사용 
		
		
		int x= 3;
		int y= 5;
		System.out.println("X:"+x +", Y:"+y);
		
		int temp= x;
		x = y; //이때는 int x 선언이 아니라 변수 x에 y의 값을 대입시켜야 하기 때문에 int같은변수 선언을 하지않는다 
		y= temp;// 또한 위에서 이미 변수x에 대해 선언을 한 상태
		System.out.println("X:"+x+", Y:"+y);
		
	}
}
