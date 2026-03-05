/**
 * @author zzoingsu
 */
/*
 * title: PrimitiveAndStringConversationExample
 *  Date: 2026.03.05
 */
package ch02.sec10;

public class PrimitiveAndStringConversationExample {

	public static void main(String[] args) {
		//String -> byte
		String str = "10";
		byte value1 = Byte.parseByte(str);   // 괄호안에 항상 변수가 들어가지않아도 된다 , 변수대신 문자열이 직들어갈수있다 
		//String -> short
		short value2 = Short.parseShort(str);
		//String -> int
		int value3 = Integer.parseInt(str);
		//String -> long
		long value4 = Long.parseLong(str);
		//String -> float
		float value5 = Float.parseFloat(str);
		//String -> double
		double value6 = Double.parseDouble(str);
		//String -> boolean
		String str1 = "true";
		boolean value7 = Boolean.parseBoolean(str1);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
	    String value = String.valueOf(10);   // 문자열 "10"이 value 에 저장되었다 
	    System.out.println(value);           // 콘솔에는 10으로 나오지만 이는 문자열로 출력된상태이다 
	    
//문자열을 기본타입으로 변환
	    int value8 = Integer.parseInt("10");
	    double value9 = Double.parseDouble("3.14");
	    boolean value10 = Boolean.parseBoolean("true");
	    System.out.println(value8);
	    System.out.println(value9);
	    System.out.println(value10);
	    
	   String str2 = String.valueOf(10);
	   String str3 = String.valueOf(3.14);
	   String str4 = String.valueOf(true);
	   System.out.println(str2);
	   System.out.println(str3);
	   System.out.println(str4);
	   
	   
	    

	}

}
