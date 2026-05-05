package ch12.javaBaseModule03_Dice;

public class Dice {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int count1 = 0;
		int count6 = 0;
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = (int)(Math.random()*6) + 1;
			System.out.print(numbers[i] + " ");
			if(numbers[i] == 1) {
				count1++;
			}else if(numbers[i] == 6) {
				count6++;
			}
		}
		System.out.println();
		System.out.println("1의 개수: " + count1);
		System.out.println("6의 개수: " + count6);
	}

}
