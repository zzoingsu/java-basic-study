package ch04.for02_StarOutPrint;

import java.util.Scanner;

public class StarOutPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별 피라미드 높이 입력: ");
		int tallOfPyramid = Integer.parseInt(sc.nextLine());
		
		for (int n = 1; n <= tallOfPyramid; n++) {
			for (int space = 1; tallOfPyramid - n >= space; space++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= n; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
