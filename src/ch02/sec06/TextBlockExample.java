/**
 * @author zzoingsu
 */
/*
 * title: TextBlockExample
 *  Date: 2026.03.04
 */
package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		String name = "홍길동"; 
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다 ");
		
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"wiinter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		// str1 과 str2 는 같은 출력이지만 """을 사용함으로 복잡한 일련의 과정없이 출력할수있다 
		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
				""";
		System.out.println(str1);
		System.out.println("---------------------------------");
		System.out.println(str2);
		System.out.println("---------------------------------");
		str = """            
		나는 자바를 \
		학습합니다
		나는 자바 고수가 될 겁니다 
		""";       // 앞부분에서 string 에 대한 선언을 마친 상태임으로 다시 String 을 선언하면 컴파일에러가 생긴다 
		           // 38번 라인에서처럼 텍스트블록에서 줄바꿈은 하고싶지 않지만 출력문에서는 줄을 바꾸고싶을때 \(역슬래시)를 해주면 출력문에서는 줄이 바뀌지않는다 
		System.out.println(str);
	}

}
