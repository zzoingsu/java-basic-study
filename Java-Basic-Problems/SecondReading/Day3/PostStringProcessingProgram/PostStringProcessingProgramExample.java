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
class Solution {
    public String[] solution(String[] record) {
        for (int i=0; i<record.length; i++) {
        	Log log = new Log(record[i].split(" ")[0], record[i].split(" ")[1], record[i].split(" ")[2]);
            System.out.println(record[i].split(" ")+ "\n");
        }
        String[] answer = {};
        return answer;
    }
}
class Log{
    private String accessRecord;
    private String userId;
    private String userName;
    
    public Log(String accessRecord, String userId, String userName) {
        this.accessRecord = accessRecord;
        this.userId = userId;
        this.userName = userName;
    }
    @Override
    public String toString() {
        return  userName + "님이 들어왔습니다.";
    }
}
