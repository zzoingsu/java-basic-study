package ch04.ConfirmationQuestion;

import java.util.Scanner;

public class ConfirmationQuestion {

	public static void main(String[] args) {
		
		// 문제 2
		String grade = "B";
		
		int Score1 = switch (grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield  result;
			}
			default -> 60;
			
		};
		System.out.println(Score1);
		
		// 문제 3
		int sum = 0;
		for (int i =1; i <= 100; i++) {
			if( i % 3 == 0) {
			sum += i;
			}
		}
		System.out.println(sum);
		
		// 문제 4
	    int num1 = 0;
	    int num2 = 0;
		
		while (num1 + num2 != 5) {
			num1  = (int)(Math.random()*6 +1);
			num2  = (int)(Math.random()*6 +1);
			if (num1 + num2 == 5) {
				break;
			}
		}
		System.out.println("(" + num1 + ") ("+ num2 + ")" ); 
		
		//문제 5
		int x ;
		int y ;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				if(x*4 + y*5 == 60) {
					System.out.println("X:" + x + "\tY: " + y);
				}
			}
		}	
		//문제 7
			Scanner sc = new Scanner(System.in);
			int acount = 0;
			boolean run = true;
			
			while(run) {
				System.out.println("\n\n\n\n------------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
				System.out.println("------------------------------------");
				System.out.print("선택>");
				int number = Integer.parseInt(sc.nextLine());
				
				switch (number) {
				case 1 -> {
					System.out.print("예금액>");
					int bankIn = Integer.parseInt(sc.nextLine());
					acount += bankIn;
				}
				case 2 -> {
					System.out.print("출금액>");
					int bankOut = Integer.parseInt(sc.nextLine());
					acount -= bankOut;
				}
				case 3 -> {
					System.out.print("잔고> "+ acount);
				}
				case 4 -> {
					System.out.print("종료");
					run = false;
				}
				default -> {
					System.out.print("잘못된 번호입니다");
				}
				
				};
				
			}
			sc.close();
			
		}
	
	}			
					
			
		
	
