/**
 * Title:RadiusProblem
 * Date: 2026.03.06
 * @author zzoingsu
 */
package Problem02;
import java.util.Scanner;  // import의 위치는 class 외부에 넣어야한다 이건 자바공식이다  
//사용자로부터 원의 반지름을 입력받아 원의 넓이를 구하는 프로그램을 작성하라     
// 공식: 넓이 = 3.14 * r * r 
public class RadiusProblem {  
// 나혼자_version
	public static void main(String[] args) { 
		Scanner scr = new Scanner(System.in);
		System.out.print("동작시작\n반지름입력: ");
		String inputData = scr.nextLine();
		int radius = Integer.parseInt(inputData);
			
		double result = 3.14 * radius * radius;
					
		System.out.println("원의넓이: "+result);
		
//개선및수정방
// 1. 반지름은 int 보다 double을 사용하는것이 맞다 -> 반지름이 항상 정수로만 주어지는것은 아니기때문에 실수형인 double을 사용하는것이 맞다 
// 2. 조건이 printf를 사용하는것이라서 이 조건에 맞춰서 시도필요 
// 3. 소수점아래2자리까지 출력 		
	
//	개선및수정_version
	System.out.print("동작시작\n반지름입력: ");
	Scanner scn = new Scanner (System.in);
	String inputData2 = scn.nextLine();
	double radius2 = Double.parseDouble(inputData2);
	double result2 = 3.14 * radius2 * radius2;
	System.out.printf("원의넓이: %.2f ", result2);  
	// printf 사용시 콘솔에러 발생 -> 개선및수정버전에서는 반지름의 길이가 정수뿐만이 아니라 실수임도 생각하고있기때문에 printf에서 d를 사용한다면 컴파일에러는 아니지만
	// 형식 지정자와 값의 타입이 맞지 않아서 실행 중 오류가 발생한다
	scr.close();
	scn.close();
	}              

}
