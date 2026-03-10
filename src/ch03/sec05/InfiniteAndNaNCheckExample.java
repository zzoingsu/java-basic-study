/**
 * Title:InfininteAndNanCheckExample
 * Date: 2026.03.10
 * @author zzoingsu
 */
package ch03.sec05;

public class InfiniteAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		// 잘못된 코드 
		System.out.println(z); 
		//값이 무한대로 나오기때문에 연산을 계속하더라도 결과값은 계속 무한대로 나온다 
		// 따라서 값이 infinite인지 nan인지 확인한후 연산을 해야한다 
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {  // is.Infinite() 나 is.NaN()을 사용하면 출력값이 infinite인지NaN인지 알수있
			System.out.println("값 산출불가");             // || 은 둘둥하나라도 참이라면 모두 참으로 해석하기때문에 "값 산출불가'가 출력되었
		} else {
			System.out.println(z + 2);
		}
	}

}
