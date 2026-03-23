package ch05.Array02_FindingMaximumNumber;

public class FindingMaximumNumber {

	public static void main(String[] args) {
		int [] scores = {65, 82, 90, 74, 88, 59, 100};
		int over80 = 0;
		int largestNumber = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 80) {
				over80++;
			}if (i == 6) {
				break;
			}if (scores[i] <= scores[i+1]) {
				largestNumber = scores[i+1];
			}else if( scores[i] > scores[i+1]) {
				largestNumber = scores[i];
			}
		}
		System.out.printf("최대값: %d\n80점 이상 개수: %d", largestNumber, over80);
/** 개선및수정 방향
 * 1. int largestNumbe = 0;은 만약 배열이 음수일떄 최대값이 0으로 고정된다는 위험이있다  -> int largestNumber = int scores[0]
 * 2. if (i == 6) 은 만약 배열의 길이가 달라지면 위험해진다
 * 3. 최대값을 구하는게 아니라 인접한 값비교가 되어버렸다
 * 4. lergestNumber 덮어쓰기가 되어버렸다 
 */
	}

}
