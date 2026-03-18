package ch04.sec04;

public class ForExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " "); // 출력될때까지 반복됨으로 " "를 사용해서 간격 벌리기 가능
		}
	int sum = 0;
	int i;
	
	for (i = 1; i <= 100; i++) {
		sum += i;
	}
	System.out.println("1~" + (i-1) + " 합: " + sum); // 변수선언을 블록 외부에서 했음으로 출력문이 블록밖에 위치해도됨
	
	for (int m = 2; m <= 9; m++) {
		System.out.println("***" + m + "단 ***");
		for (int n = 1; n <= 9; n++) {
			System.out.println(m + " X " + n + " = " + (m*n));
		}
	}
	
	
	} 

}
