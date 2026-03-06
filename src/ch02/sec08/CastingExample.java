/**
 * @author zzoingsu
 */
/*
 * title: CastingExample
 *  Date: 2026.03.04
 */
package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
// int -> byte
		int intvalue = 10;
		byte bytevalue = (byte) intvalue;   // 변환하려는 타입이 작은경우 강제로 타입을 변환 시킬수있다 
		System.out.println("bytevalue: " + bytevalue);   //intvalue의 값이 bytevalue의 허용범위 안에 있기때문에 이경우 값은 보존된다  
		intvalue = 128;    // 이경우 byte 타입의 범위를 넘겨서 강제타입변화 시킴으로 원래의 값이보존되지않고 -128이라는 값이 나온다(컴파일에러는 나오지않는다) 
		bytevalue = (byte) intvalue;
		System.out.println("bytevalue; " + bytevalue);

// long -> int		
		long longvalue = 300l;
		intvalue = (int)longvalue;   // 강제타입변화 후에 값 300 그대로 유지 
		System.out.println("intvalue: " +  intvalue);
		
// int -> char		
		intvalue = 65;  //char의 허용범위인 0~65535의 값만 원래의 값을 유지한다 범위를 넘기면 값이 보존되지않는다 
		char charvalue = (char) intvalue;  //intvalue 의 값을 charvalue 로 강제변화시킨후 값을 유니코드하여 출력 
		System.out.println("charvalue: " + charvalue);
		
//실수 -> 정수
		double doublevalue = 3.14;
		intvalue = (int) doublevalue;
		System.out.println("intvalue: " + intvalue);
		
// 강제타입변환
		intvalue = 10;
		bytevalue = (byte)intvalue;
		System.out.println("bytevalue: " + bytevalue);
		longvalue = 300l;
		intvalue = (int) longvalue;
		System.out.println("intvalue: " + intvalue);
		intvalue = 65;
		charvalue = (char) intvalue;
		System.out.println("charvalue: " + charvalue);
		doublevalue = 3.14;
		intvalue = (int) doublevalue;
		System.out.println("intvalue: " + intvalue);
	}

}
