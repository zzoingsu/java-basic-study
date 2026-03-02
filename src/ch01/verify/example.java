package ch01.verify;
/**
 * @author zzoingsu
 */
/*
 * title: example01 (3in1)
 * 2026.03.02
 */
public class example {

	public static void main(String[] args) {
        String x= "개발자가 되기 위한 필수 개발 언어 Java "; // 변수 x 선언 및 저장 
        System.out.println(x); 
      // x에 저장된 값을 콘솔에 출력 
	
        System.out.println("개발자가 되기 위한 필수 개발 언어 Java!"); // 콘솔에 관호 친 내용 나오도록 출력 
      // 메소드 블록 안에 위치해야 추가 메소드 선언 없이 가능 {}범위 잘 챙겨보기 
	
       String A= "개발자가 되기 위한";  //변수A 선언 및 저장 
       String B= "필수 개발 언어"; 
       String C= "Java!!";
       String result=A+B+C;  // result 선언및 A,B,C 더한값 저장 (이 변수 설정없이 println(A+B+C)로 출력 가능)
       System.out.println(result);
       // 문장일때는 char 이 아니라 string 사용 
	}	
}
 