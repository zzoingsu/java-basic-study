package ch02.sec02;
/**
 * @author zzoingsu
 */
/*
 * title: IntegerLiternalExample
 *  Date: 2026.03.04
 */
public class IntegerLiteralExample {

	public static void main(String[] args) {
		int x = 0xB3;	
		int y = 0x2A0F;
		System.out.println("x:"+x + ", y:"+y);
		
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0Xb3;
		System.out.println("var1: "+ var1);
		System.out.println("var2: "+ var2);
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		
		
		byte var5 = -128;
		byte var6 = -30;
		byte var7 = 0;
		byte var8 = 30;
		byte var9 = 127;
	    System.out.println("var5: "+ var5);
	    System.out.println("var6: "+ var6);
	    System.out.println("var7: "+ var7);
	    System.out.println("var8: "+ var8);
	    System.out.println("var9: "+ var9);
	}
}
