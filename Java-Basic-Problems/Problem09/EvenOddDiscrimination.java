/**
 * Title: EvenOddDiscrimination
 * Date: 2026.03.12
 * @author zzoingsu
 */
// 사용자로부터 정수를 입력받아 다음을 출력하라.(입력값,짝수인가,3의 배수인가,짝수이면서 3의 배수인가)
// 조건: % 연산자 사용, boolean 사용, && 사용 
package Problem09;

import java.util.Scanner;

public class EvenOddDiscrimination { 
// 나혼자-version
	public static void main(String[] args) { 
		System.out.print("동작시작\n숫자입력: ");
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		
		boolean isEvenNum = inputNum % 2 == 0;
		boolean isMultiOf3 = inputNum % 3 == 0;
		boolean isMultiOf2And3 = isEvenNum && isMultiOf3;
		
		System.out.printf("입력값: %d\n짝수인가: %b\n3의 배수인가: %b\n짝수이고 3의 배수인가: %b\n\n\n", 
				inputNum, isEvenNum, isMultiOf3, isMultiOf2And3);
		sc.close();
	}
/*개선및수정 방향
 * 1. 클래스 이름 어색 : EvenOddDiscrimination -> EvenOddCheck
 * 2. 변수이름 어색 : isEvenNum -> isEven , isMultiOf3 -> isMultipleOf3
 * 3. printf 더 깔끔하게 정렬 필요
 */
// 개선및수정_version
	
	public static void main2(String[] args) {
		System.out.print("동작시작\n숫자입력: ");
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		
		boolean isEven = inputNum % 2 == 0;
		boolean isMultipleOf3 = inputNum % 3 == 0;
		boolean isEvenAndMultipleOf3 = isEven && isMultipleOf3;
		
		System.out.printf(
				"입력값: %d\n짝수인가: %b\n3의 배수인가: %b\n짝수이면서 3의 배수인가: %b",
				inputNum, isEven, isMultipleOf3, isEvenAndMultipleOf3
		);
		sc.close();
// 수정한것 : printf 수정, 변수명 변경
	}
}
