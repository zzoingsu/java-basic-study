/**
 * @author zzoingsu
 */
/*
 * title: ScannerExample
 *  Date: 2026.03.04
 */
package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);  // . 은 객체 사용법이라서 변수선언과정에서는 사용하지않는다 
		
		System.out.print("입력시작");
		String inputData = scn.nextLine();     
		System.out.print("->: "+inputData);  
 // scn .nextLine 에서 scn은 변수 이름으로 'scanner.nextLine'이 하나의 명령어처럼 사용되지않는다 
 // 코드를 돌리면 콘솔창에  System.out.print();속 ()에 적었던 문장이 나오는데 이때 콘솔에 내가 문장을 입력할수있다 
 // 문장을 입력하고 엔터키를 누르면 내가 콘솔에 입력한 내용이 String inputData에 저장된다 
 // ()에 입력할때는 "를 써야 컴파일 에러가 나지않는다 
	
	    System.out.print("\nX값 입력: ");
	    String strx = scn.nextLine();
	    int x = Integer.parseInt(strx);
		
	    System.out.print("\nY값 입력: ");
	    String stry = scn.nextLine();
	    int y = Integer.parseInt(stry);
	    
	    int result = x + y;
	    System.out.println(result);
	    
	    while(true) {   // 중괄호를 무한 바녹하는 코드 설명을 추후에 
	    System.out.print("입력 문자열: ");
	    String data = scn.nextLine();
	    if(data.equals("q")) {
	    	break;
	    }
	    System.out.println("출력문자열: "+ data);
	    System.out.println();
	    }
	    System.out.println("종료");
	    scn.close();
	   
	}
}