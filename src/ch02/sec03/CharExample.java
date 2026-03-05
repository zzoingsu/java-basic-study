/**
 * @author zzoingsu
 */
/*
 * title: CharExample
 *  Date: 2026.03.04
 */
package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
		char var1 = 65;                     //char 타입을 사용할떄 한단어가 아닌 유니코드를 사용해도 정상적으로 출력된다 
		char var2 = '가';
		System.out.println(var1);
		System.out.println(var2);
		
		char c1 = 'A';                     //문자 저장 
		char c2 = 65;                      //유니코드 직접 저장 
		char c3 = '가';
		char c4= 44032;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		char c = ' ';          // 변수에 문자를 대입하지않고 초기화 목적으로  빈문자를 대입시킬때 '를 붙혀서 쓰는게 아닌 빈칸을 남겨둔다 (공백 유니코드32)
		char c5 = 32;          //변수 이름에 - 사용불가 (컴파일에러)
		System.out.println(c);
		System.out.println(c5);
	}
}
