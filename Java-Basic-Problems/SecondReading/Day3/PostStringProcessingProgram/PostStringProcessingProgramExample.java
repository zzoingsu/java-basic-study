package SecondReading.Day3.PostStringProcessingProgram;

public class PostStringProcessingProgramExample {

	public static void main(String[] args) {
		Post post = new Post(
			    "자바 2회독 후기",
			    "오늘은 예외처리와 문자열 API를 공부했다 생각보다 중요하다",
			    "winter"
			);

			System.out.println(post.getSummary());
			System.out.println("단어 수: " + post.getWordCount());
			System.out.println(post.buildPostInfo());
	}

}
