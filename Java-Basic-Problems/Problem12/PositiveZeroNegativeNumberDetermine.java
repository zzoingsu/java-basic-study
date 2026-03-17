/**
 * Title: PositiveZeroNegativeNumberDetermine
 * Date: 2026.03.17
 * @author zzoingsu
 */
package Problem12;

import java.util.Scanner;

public class PositiveZeroNegativeNumberDetermine {

	public static void main(String[] args) {
	// 나혼자_version	
		System.out.print("동작시작\n입력값: ");
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		
		if (number >= 0) {
			if (number > 0) {
				System.out.print("판별결과: 양수");
			}else if (number == 0) {
				System.out.print("판별결과: 0");
			}
		}else {
			System.out.print("판별결과: 음수");
		}
		
	
/**수정및개선 방향
 * 1.조건식을 더 간단하게 풀수있었음 -> if문을 복합해서 짰는데 복합하지말고 바로 조건식을 풀어서 할수있었음
 **/
	//개선및수정_version
	System.out.print("동작시작\n입력값: ");
	Scanner scn = new Scanner(System.in);
	int numberData = Integer.parseInt(scn.nextLine());
	
	if (numberData > 0) {
		System.out.print("판별결과: 양수");
	}else if(numberData == 0) {
		System.out.print("판별결과: 0");
	}else {
		System.out.print("판별결과: 음수");
	}
	scn.close();
	sc.close();
	
	}
	
}
