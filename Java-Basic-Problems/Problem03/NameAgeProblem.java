/**
 * Title: NameAgeProblem
 * Date: 2026.03.07
 **/
// 사용자로부터 이름과 나이를 입력받아 "()의 나이는 ()살입니다"를 출력하라
// 조건: 1.Scanner 사용 2.이름은 문자열로 출력 3.나이는 정수 4.문장형태로 출력 
package Problem03;
import java.util.Scanner;
public class NameAgeProblem {
//나혼자_Version 
	public static void main(String[] args) { {
		System.out.print("동작시작\n이름입력:");
		Scanner scn = new Scanner(System.in);
		String nameData = scn.nextLine();
		
		System.out.print("나이입력:");
		String str = scn.nextLine();
		int ageData = Integer.parseInt(str);
		
		System.out.println(nameData+"의 나이는 "+ageData+"살입니다.");
		scn.close();
	}
//수정및개선방향 
// 변수 이름이 어색해서 가독성이 떨어진다 str -> name 처럼 바꾸자 
// 출력 형식 더 다듬기 -> "나이입력:"에서 "; "이 콘솔에서 가독성이 더 좋아진다 
	
//개선및수정_Version 
		System.out.print("동작시작\n이름입력: ");  //println을 사용하면 콘솔에 입력하는값이 이름입력 아래에 입력되는게 가독성에 좋지않아서 print을 사용했다 
		Scanner sc = new Scanner(System.in);
		String nameData2 = sc.nextLine();
		
		System.out.print("나이입력: ");
		String ageData2 = sc.nextLine();
		int age = Integer.parseInt(ageData2);
		
		System.out.println(nameData2+"의 나이는 "+age+"살입니다"); // 코드의 마무리에서는 println이 더 자연스러움 
		sc.close();
	}

}
