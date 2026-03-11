/**
 * Title: BitLogicExample
 * Date: 2026.03.11
 * @author zzoingsu
 */
package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
// 단순 논리연산 
		System.out.println("45 & 25 = "+ (45 & 25));
		System.out.println("45 | 25 = "+ (45 | 25));
		System.out.println("45 ^ 25 = "+ (45 ^ 25)); // 비트 논리 연산에서는 정수만 드러온다 실수는 못들어온다 
		System.out.println("~ 45 = "+ (~ 45)); // 논리부정은 하나의 비트을 부정한다
		
		byte receiveData = -120;
//  방법1: 비트 논리곱 연산으로 unSignedInt값 얻기 (& 255 사용)  		
		int unSignedInt1 = receiveData & 255;
		System.out.println("unsignedInt1: "+ unSignedInt1);
		
// 방법2: 자바 api 이용해서 unSignedInt값 얻기
		int unSignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println("unSignedInt2: "+ unSignedInt2);
		
		int test = 136;
		byte btest = (byte) test;  // 오버플로우 발
		System.out.println(btest);
		
	}

}
