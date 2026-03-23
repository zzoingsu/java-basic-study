package ch05.sec03;

public class ReferenceCalculate {

	public static void main(String[] args) {
		int[] arr1;  // 배열 변수 arr1 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1, 2, 3 };  // 배열 생성후 변수에 저장
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2; // 배열 변수 arr2의 값을 arr3에 저장
		
		System.out.println( arr1 == arr2 );  // 저장 항목은 같더라도 대입되는 번지는 다르다
		System.out.println( arr2 == arr3 );  // 같은 변수의 번지 대입으로 같은 배열 참조
	}
}