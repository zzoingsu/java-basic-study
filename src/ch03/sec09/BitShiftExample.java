/**
 * Title: BitShiftexample
 * Date: 2026.03.11 
 * @author zzoingsu
 */
package ch03.sec09;

public class BitShiftExample {

	public static void main(String[] args) {
		int test1 = 1 << 3; // 좌측이동 연산자를 사용하면 3만큼 1의 2진수값이 왼쪽으로 이동한후 오른쪽 공란은 0으로 채워진다 
		System.out.println("test1: "+ test1); // 좌측이동 연산자를 사용한 결과값은 2의 3배수가 된다 
		
		int test2 = -8 >> 3; // 우측이동 연산자(>>)를 사용하면 3만큼 -8의 2진수값이 이동한후 공란이 최상위 비트와 동일한 값으로 채워진다 
		System.out.println("test2: "+test2); // 우측이동 연산자를 사용한 결과값은 2의 3배수를 나눈값이 된다 
		
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2,3); // Math.pow는 2를 3제곱시킨후 double타입으로 산출한다 
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 /(int) Math.pow(2,3);
		System.out.println("result3: "+ result3);
		System.out.println("result4: "+ result4);
		
		int result5 = -8 >>> 3; // 우측이동연산자(>>>)를 사용하면 -8의 2진법값이 우측으로 3이동하고 왼쪽 공란은 무조건 0으로 채워진다 
		System.out.println("result5: "+ result5); // 왼쪽 공란이 0으로 채워져서 0001..으로 처리되서어서 값이536870911이 된다 
		
		int value = 772;
		// 우측으로 3byte(24bit) 만큼 이동하고 끝 1바이트만 읽음 
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;  // 255을 사용해야 부호에 영향을 받지 않은 원래의 bit테이터가 나온다 
		System.out.println("첫 번째 바이트 부호없는 값: "+ int1);
		
		byte byte2 = (byte) (value >>> 16);
		int int2 = byte2 & 255;
		System.out.println("두번쨰 바이트 부호 없는값: "+ int2);
		
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("3번째 바이트 부호 없는값: "+ int3);
		
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.print("4번째 바이트 부호 없는값: "+ int4);
		// 만약 byte에 127 보다 작은수가 들어가면 굳이 byte,toUnsignedInt();를 사용할 필요는 없으나보다 큰값이 들어올수도있기 떄문에 toUnsignedInt() 사용한다 
				
		
	}

}
