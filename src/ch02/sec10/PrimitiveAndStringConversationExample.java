package ch02.sec10;

public class PrimitiveAndStringConversationExample {

	public static void main(String[] args) {
		//String -> byte
		String str = "10";
		byte value1 = Byte.parseByte(str);
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
		System.out.print(value1,value2,value3,value4,value5, value6  );

	}

}
