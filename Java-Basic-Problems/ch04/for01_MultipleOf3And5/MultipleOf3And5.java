package ch04.for01_MultipleOf3And5;

public class MultipleOf3And5 {

	public static void main(String[] args) {
		for (int i =1; i <= 100; i++) {
			if (i %3 == 0 && i%5 == 0) {
				System.out.println(i + " ");
			}
	
		}
/*개선및수정 방향
 * println 이랑 (" ")은 같은 말이라서 굳이 같이 쓸필요없다
 */
	}
	
}
