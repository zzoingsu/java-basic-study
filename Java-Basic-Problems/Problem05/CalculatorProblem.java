/**
 * Title: CalculatorExample
 * Date: 2026.03.10
 * @author zzoingsu
 */
package Problem05;
import java.util.Scanner;
public class CalculatorProblem {

	public static void main(String[] args) {
// 나혼자_version
		System.out.print("동작시작\nx: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int x = Integer.parseInt(str1);
		
		System.out.print("y: ");
		String str2 = sc.nextLine();
		int y = Integer.parseInt(str2);
		
		int plus = x+y;
		int minus = x-y;
		int multi =x*y;
		double divi = (double)x/y;
		int rest = x%y;
		
		System.out.printf("합:%1$d\n차:%2$d\n곱:%3$d\n나누기:%4$f\n나머지:%5$d\n\n\n",plus,minus,multi,divi,rest);
	
// 수정및개선 방향
// 1. 변수명이 어색하다 plus -> sum , minus -> diff , multi -> product , divi -> qoutient , rest -> remainser 으로 바꿀필요 
// 2. printf에서 위치지정자는 굳이 안써도 된다 오히려 복잡하게 보인다 
// 3. 나누기 소수점이 너무 길게 나올수도있으니 적당한 선에서 끊기 필요
	
//수정및 개선_version
	System.out.print("동작시작\na: ");
	Scanner scn = new Scanner(System.in);
	String str3 = scn.nextLine();
	int a = Integer.parseInt(str3);

	System.out.print("b: ");
	String str4 = scn.nextLine();   
	int b = Integer.parseInt(str4);
	
	int sum = a+b;
	int diff = a-b;
	int product = a*b;
	double quotient = (double)a/b;
	int remainder = a%b;
	
	System.out.printf("합: %d\n차: %d\n곱: %d\n몫: %.2f\n나머지: %d",sum,diff,product,quotient,remainder);
	// String str4 = sc.nextLine();
	// int b = Integer.parseInt(); 부분을 한 문장으로 줄일수있는데 이는 int b = Integer.parseInt(nextLine());으로 쓰면 한문장으로 축소가능하다
	// nextLine()은 항상 입력된수를 문자열로 저장하기에 굳이 String을 선언하고 변환하지 않아도된다 
	}
}
