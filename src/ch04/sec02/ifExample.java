/**
 * Title: IfExample
 * Date: 2026.03.17
 * @author zzoingsu
 */
package ch04.sec02;

public class ifExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}
		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다");  //if문에서 괄호는 조건식이 하나일때 생략해도되지만 가독성을 위해서 괄호를 사용하는것이 좋다 
		}
		
		int scoreData = 85;
		
		if (scoreData >= 90) {
			System.out.println("점수가 90보다 큽니다\n등급은 A입니다");
		}else {   // 아까와 같은내용이지만 if문을 두개 쓰는것보다 if-else문을 사용하면 더 간단히 처리가능하다 
			System.out.println("점수가 90보다 작습니다\n등급은 B입니다");
		}
		
		int sc = 75;
		
		if (sc >= 90) {
			System.out.println("점수가 100-90입니다\n등급은 A입니다");
		} else if (sc >= 80) {
			System.out.println("점수가 90-80입니다\n등급은 B입니다");
		} else if (sc >= 70) {
			System.out.println("점수가 80-70입니다\n등급은 C입니다");
		} else {
			System.out.println("점수가 70미만 입니다\n등급은 D입니다");
		}
		
		int num = (int)(Math.random()*6) +1;  // Math.random은 0.0부터 1.0까지의 수중하나를 랜덤으로 출력함으로 6을 곱해서 0.0부터 6.0까지 출력시키고 
 											 //1을 더해서 주사위를 굴려서 나오는 정수를 구할수있다 이때 Math.random은 double임으로 int로 캐스팅한다
		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}
		
		int scr = (int) (Math.random()*20) + 80;
		System.out.println("점수: "+scr);
		String grade;
		
		if (scr >= 90) {
			if (scr >= 95) {
				grade = "A+";
			}else if (scr >= 90);{
				grade = "A";
			}
		}else {
			if(scr >= 85) {
				grade = "B+";
			}else {
				grade = "B";
				}	
			}
		System.out.println("학점: "+ grade);
		}
	}


