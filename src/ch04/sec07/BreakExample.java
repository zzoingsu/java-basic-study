package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) throws Exception {
		while (true) {
			int num = (int)(Math.random()*6 + 1);
			System.out.println(num);
			if (num == 6) {
			System.out.println("프로그램 종료");
			System.out.println();
			break;
			}
		}
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper+ "-" + lower);
				if (lower == 'g') {
					System.out.print("프로그램 실행 종료");
					break Outter;  // break만 쓰면 lower이 g까지 출력하고 upper로 올라간다 
				}
			}
		}
	}

}
