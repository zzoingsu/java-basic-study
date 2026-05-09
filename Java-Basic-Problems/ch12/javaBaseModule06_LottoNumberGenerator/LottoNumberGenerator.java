package ch12.javaBaseModule06_LottoNumberGenerator;

import java.util.Arrays;

public class LottoNumberGenerator {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;
			if(isDuplicated(lotto, num, i)) {
				i--;
				continue;
			}
			lotto[i] = num;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	public static boolean isDuplicated (int[] lotto , int num, int count) {
		for(int i=0; i<count; i++) {
			if(num == lotto[i]) {
				return true;
			}
		}return false;
	}

}
