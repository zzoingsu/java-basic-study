package ch04.switch01_MenuSelectionProgram;

import java.util.Scanner;

public class MenuSelectionProgram {

	public static void main(String[] args) {
		System.out.print("메뉴 번호 입력: ");
		Scanner sc = new Scanner(System.in);
		int menuNumber = Integer.parseInt(sc.nextLine());
		
		String menu = switch(menuNumber) {
			case 1 -> "아메리카노";
			case 2 -> "카페라떼";
			case 3 -> "카푸치노";
			case 4 -> "콜드브루";
			default -> "없는 메뉴입니다";
		};
		
		System.out.print("선택한 메뉴: " + menu );
		sc.close();
		
/**개선및수정 방향 
 * 1. 마지막 출력에서는 print보다 println이 더 자연스러움
 * 2. 변수명 menu -> menuName이 더 좋음
 */
	}

}
