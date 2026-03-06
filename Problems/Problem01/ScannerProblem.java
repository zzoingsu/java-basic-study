/**
 * Title: Scannerproblem
 * Date: 2026.03.06
 */
package Problem01;
//두 정수를 입력받아 합을 출력하라 
import java.util.Scanner;   //Scanner 을 사용할때는 import java.util.Scanner; 이라는 코드를 실행시켜서 사용해야한다 

public class ScannerProblem {

	public static void main(String[] args) {
// 나혼자_version		
		{System.out.println("입력 시작");             // 동작시작이라는 글을 콘솔에 보여줌으로서 콘솔에 입력을 시작하는것을 알려준다 
		
		Scanner scnx  = new Scanner(System.in);   // .은 코드나 객체에 접근해서 사용하는것이라서 
		String str1 = scnx.nextLine();    //위의 코드에서 콘솔에 입력한 값을 scnx에 저장했음으로 저장한 값을 문자열로 변환시키는 코드이기때문에 nextLine의 앞은 변수명이 와야한다 
		int x = Integer.parseInt(str1);    // 문자열로 저장된걸 정수로 바꿔서 저장한다 
		System.out.println("X: " + x);
		
		Scanner scny = new Scanner(System.in);
		String str2 = scny.nextLine();
		int y = Integer.parseInt(str2);
		System.out.println("Y: " + y);
		
		int result = x+y;
		System.out.println("result:" + result + "\n\n");
		
	
		}
/* 수정및개선방향 	
 * 1.Scanner scnx + new Scanner(System.in);을 두번만든것 -> 입력스트림 경쟁으로 충돌가능성 높음 
 * 2.변수명 어색함
 * 3.입력안내메세지 추가 
 * 출력형식 개선필요 더 깔끔하게 수정 	
 */
		
		
// 수정및개선_version	
		Scanner sn = new Scanner(System.in); // Scanner를 하나만 생성해서 같은 System.in 입력 스트림을 일관되게 사용한다.
		System.out.print("동작시작\n");   // 기존 입력시작에서 바로 x값을 입력하는것에서 동작시작을 출력해서 실행준비가 되었음을 알려준다 
		
		System.out.print("x값입력:\t"); 
		String inputData1 = sn.nextLine();
		int x = Integer.parseInt(inputData1);
		
		System.out.print("\ny값입력:\t");
		String inputData2 = sn.nextLine();
		int y = Integer.parseInt(inputData2);
		
		int result = x + y;
		System.out.print("\n합: " + result);
		
		sn.close ();
		
	}
}
		
	
		