/**
 * Title: MultiplicativeLogicalProblem
 * Date ; 2026.03.11
 * @author zzoingsu
 */
// 정수를 입력받아 다음 결과를 출력하시오 (2의 배수인가, 3의 배수인가, 5의 배수인가, 2와 3의 배수인가, 2 또는 5의 배수인가)
package ch03.Operator04_MultiplicativeLogic;
import java.util.Scanner;
public class MultiplicativeLogic {
// 나혼자_version
	public static void main(String[] args) { 
		System.out.print("동작시작\n숫자입력: ");
		Scanner sc = new Scanner(System.in);
		int inputNumber = Integer.parseInt(sc.nextLine());
		
		boolean multipleOf2 = inputNumber % 2 == 0;
		boolean multipleOf3 = inputNumber % 3 == 0;
		boolean multipleOf5 = inputNumber % 5 == 0;
		boolean multipleOf2And3 = multipleOf2 && multipleOf3; // 이곳에서 boolean변수 사용해서 중복은 잘함 
		boolean multipleOf2Or5 = multipleOf2 || multipleOf5;
		
		System.out.printf("2의 배수: %b\n3의 배수: %b\n5의배수: %b\n2와 3의배수: %b\n2 또는 5의 배수: %b\n\n\n", 
				multipleOf2, multipleOf3, multipleOf5, multipleOf2And3, multipleOf2Or5);
	
/*
 * 개선및수정 방향
 * 1. 출력 문구 띄어쓰기 정리 -> 출력에서 띄어쓰기가 재각각이라서 통일성 저해
 * 2. 변수명에서 is를 넣으면 boolean타입 변수라는게 더 잘보여서 가독성 증가  
 */

	
//개선및수정_version
		System.out.print("동작시작\n숫자입력: ");
		Scanner scn = new Scanner(System.in);
		int inputNum = Integer.parseInt(scn.nextLine());
		
		boolean isMultipleOf2 = inputNum % 2 == 0;
		boolean isMultipleOf3 = inputNum % 3 == 0;
		boolean isMultipleOf5 = inputNum % 5 == 0;
		boolean isMultipleOf2And3 = isMultipleOf2 && isMultipleOf3;
		boolean isMultipleOf2Or5 = isMultipleOf2 || isMultipleOf5;
		
		System.out.printf("2의 배수: %b\n3의 배수: %b\n5의 배수: %b\n2와3의 배수: %b\n2또는5의 배수: %b", 
				isMultipleOf2, isMultipleOf3, isMultipleOf5, isMultipleOf2And3, isMultipleOf2Or5);
		
		scn.close();
		sc.close();
/*
 * 수정한것: multipleOf2 -> isMultipleOf2 , 2의배수 -> 2의 배
 */
	}
}