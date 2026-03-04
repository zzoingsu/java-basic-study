package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 10진수 리터널 
		double x = 0.25;
		double y = -3.14;
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);
		// e 또는 E가 포함된 10의 거듭제곱 리터널
		double a = 5e2;
		double b = 0.12e-2;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		//float 타입 대입 
		double var = 3.14;
		double var0 = 312e-2;
		float var00 = 3.14f;  // float 타입에 대입하려면 리터널 끝에 f 를 붙혀야 컴파일에러가 안난다 
		float var000 = 3e6f;
		System.out.println("var: "+ var);
		System.out.println("var0: "+ var0);
		System.out.println("var00: "+ var00);
		System.out.println("var000: "+var000);
		//정밀도 확인 
		float var1 = 0.12345678901234567890f;   //float 타입은 7자리만 출력된다 (컴파일에러는 안난다)
		double var2 = 0.12345678901234567890;   //double 타입은 15까지 출력된다 
		System.out.println(var1);
		System.out.println(var2);
		
		//10의 거듭제곱 리터널
		double var3 = 3E6f;      // 실수타입이기때문에 출력값도 .0으로 나온다 
		float var4 = 3E6f;       //
		double var5 = 2e-3f;     // double 타입에 f 를 붙히면 float 타입으로 생성된다 하지만 컴퓨터는 소수10진수를 정확히 저장하지못한다 
		                         //따라서 0.2를  0.20000004이런식으로 저장하는데 이값이 정밀도가 낮은 float 타입이 double 로 변환하는 과정에서 
		                         //float 의 오차가 그대로 double 로 출력되었다 
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
