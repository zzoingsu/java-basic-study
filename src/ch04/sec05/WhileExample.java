package ch04.sec05;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		int sum = 0;
		int l = 0; 
		while (l <= 100) {
			sum += l;
			l++;
		}
		System.out.print("1~" + (l-1) + " 합: " + sum);
	
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("\n\n\n--------------------------");
			System.out.println("1. 가속 | 2. 감속 | 3. 정지");
			System.out.println("--------------------------");
			System.out.print("선택: ");
			
			String strNum = sc.nextLine();
			
			if (strNum.equals("1")) {
				speed += 1;
				System.out.print("\n현재 속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed -= 1;
				System.out.print("현재 속도 = " + speed);
			} else {
				run = false;
			}
		}
		System.out.print("프로그램 종료");
		sc.close();

	}

}
