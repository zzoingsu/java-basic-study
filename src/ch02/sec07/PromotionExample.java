package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		byte bytevalue = 10;         //int 타입이 byte 타입보다 허용범위가 크기 때문에 자동타입변화가 가능
		int intvalue = bytevalue;    //byte 타입이 int 타입으로 자동타입변환 
		System.out.println(intvalue);  // print 는 출력후 줄이 바뀌지않음 줄을 바꾸려면은 println을 사용해야함 한번 print를 사용하면 이후 println을 사용해도 줄이 바뀌지않
	
//정수타입의 실수타입으로 자동타입변화
		long longvalue = 5000000000l;    //long 타입이 float 타보다 byte 크기는 크지만 허용범위까지 건 아니기에 자동타입변화 가능 
		float floatvalue = longvalue;    // 5.0e9f으로 저장(float 타입이기 떄문에 f)    
		double doublevalue = longvalue;  // 5.0e9으로 저장 
		System.out.println("floatvalue: "+ floatvalue + "\t doublevalue: "+ doublevalue);
		
		char charvalue = 'A';
		intvalue = charvalue;  //자동타입변화후 유니코드 출력 
		System.out.println("intvalue: " + intvalue);
		// byte bytevalue = 65;
		// char charvalue = bytevalue; 는 컴파일 오류가 생기는데 byte는 음수를 포함하기에 허용범위로 치지않는다 
		
		//자동타입변화 
		bytevalue = 10;
		intvalue =bytevalue;
		System.out.println("\nintvalue: " + intvalue);
		
		charvalue = '가';
		intvalue = charvalue;
		System.out.println("가의 유니코드: " + intvalue);
		
		intvalue = 50;
		longvalue = intvalue;
		System.out.println("longvalue: " + longvalue);
		
		longvalue = 100;
		floatvalue = longvalue;
		System.out.println("floatvalue: " + floatvalue);
		
		floatvalue = 100.5f;
		doublevalue = floatvalue;
		System.out.println("doublevalue: " + doublevalue);
	}
}
