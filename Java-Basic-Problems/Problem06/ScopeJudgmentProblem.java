/**
 * Title: ScopeJudgment
 * Date: 2026.03.10
 * @author zzoingsu
 */
//정수를 입력받아 다음 결과를 출력하시오. 10보다 큰가, 20보다 작은가, 10과 20 사이인가  
package Problem06;
import java.util.Scanner;
public class ScopeJudgmentProblem {
// 나혼자_Version
	public static void main(String[] args) {
		System.out.print("동작시작\n숫자입력: ");
		Scanner sc = new Scanner(System.in);
		int inputData = Integer.parseInt(sc.nextLine());
		
		boolean result1 = (inputData > 10 );
		boolean result2 = (inputData < 20 );
		boolean result3 = (10 <= inputData ) && (inputData <= 20 );
		
		System.out.printf("10보다 크다: %s\n20보다 작다: %s\n10과 20 사이: %s\n\n\n",result1,result2,result3);
// 개선및수정 방향
// 1. 변수명 설정미숙 -> 처음본사람들이 변수명을 읽고 이해가 안간다 result1 -> lessthan10 같은 변수명으로 바꿀필요 
// 2. boolean 에서 불필요한 괄호가 들어간다 boolean은 괄호가 불필요하다 
// 3. printf 출력에서 %s도 컴파일에러는 안나지만 %d 가 더 맞는 표현이다 
		
// 개선및 수정 _Version
		System.out.print("동작시작\n숫자입력: ");
		Scanner scn = new Scanner(System.in);
		int inputData2 = Integer.parseInt(scn.nextLine());
		
		boolean greaterthan10 = inputData2 > 10;
		boolean lessthan20 = inputData2 <20;
		boolean between10And20 = inputData2 >= 10 && inputData2 <=20;
		
		System.out.printf("10보다크다: %b\n20보다작다: %b\n10과20사이: %b",greaterthan10,lessthan20, between10And20);
// boolean 10<inputData<20이 안되는이유 자바는 기본적으로 왼쪽에서부터 읽는데 이떄 처음 10<inputData에서 true 가나오면
// 이는 숫자가 아니기때문에 이를 인지하지못함으로 에러가 난다  
		scn.close();
		sc.close();
	}

}
