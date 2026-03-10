/**
 * Title: OverFlowUnderFlowExample
 * Date: 2026.03.09
 * @author zzoingsu
 */
package ch03.sec03;

public class OverflowUnderFlowExample {

	public static void main(String[] args) {
		byte value = 127;
		value++;  //오버플로우 발생 
		System.out.println(value);// 따라서 결과값이 128이 아닌 -128로 출력된다
		value = -128;
		value--;  // 언더플로우 발생 
		System.out.println(value); // short,int,long 타입들도 값의범위가 다를뿐 오버,언더플로우가 발생한다 
		
		byte var1 = 125;
		for(int i=0; i<5;i++) {   //{}를 5번 반복시행 
			var1++;
			System.out.println("var1: " +var1);
		}
		byte var2 = -125;
		for(int i=0; i<5; i++) {  // {}를 5번 반복시행 
		var2--;
		System.out.println("var2; "+var2);
		}
	}
}
