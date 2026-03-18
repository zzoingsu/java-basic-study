/**
 * Title: BitoutPutProgram
 * Date ; 2026.03.12
 * @author zzoingsu
 */
// 사용자로부터 정수하나를 입력받고 다음을 계산하라(입력값,2배값,4배값,2로 나눈 ,최하위 비트)
// 조건 >> , << , >> , & 사용
package ch03.Operator07_BitOutput;

import java.util.Scanner;

public class BitOutPut {
// 나혼자_version
	public static void main(String[] args) {
		System.out.print("입력값: ");
		Scanner sc = new Scanner(System.in);
		int inputNum = Integer.parseInt(sc.nextLine());
		
		int doubleTheNum = inputNum << 1;
		int quadrupleTheNum = inputNum << 2;
		int dividingByTwo = inputNum >> 1;
		int lowestBit = inputNum & 1; 
		
		System.out.printf(
				"2배 값: %d\n4배값: %d\n2로 나눈값; %d\n최하위 비트: %d\n\n\n\n",
				doubleTheNum, quadrupleTheNum, dividingByTwo, lowestBit
				);
		
/*개선및수정 방향
 * 1. 변수명 조금더 다듬기 : doubledTheNum -> doubled
 * 2. 출력문구 다듬기 
 * 3. printf 에서 마지막줄 공백 없애기
 * 최하위 비트는 &1을 하면 알수있다(최상위 비트와 햇갈릴수있음)
 */ 
		// 개선및수정_version
		System.out.print("입력값: ");
		Scanner scn = new Scanner(System.in);
		int inputData = Integer.parseInt(scn.nextLine());
		
		int doubled = inputData << 1;
		int quadrupled = inputData << 2;
		int dividedByTwo = inputData >> 1;
		int lowestBit1 = inputData & 1;
		
		System.out.printf(
				"2배 값: %d\n4배값: %d\n2로 나눈 값: %d\n최하위 비트: %d",
				doubled, quadrupled, dividedByTwo, lowestBit1 
		);
		scn.close();
		sc.close();
	}

}
