package SecondReading.Day3.PostStringProcessingProgram;

public class Post {
	private String title;
	private String content;
	private String writer;

	public Post(String title, String content, String writer) {
		validateTitle(title);
		validateContent(content);
		validateWriter(writer);
		
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public String getSummary() {
		if(content.length()>20) {
			return content.substring(0, 20) + "...";
		}
		return content;
	}
	public int getWordCount() {
		 return content.split(" ").length;
	}
	public String buildPostInfo() {
		String data = new StringBuilder()	
				.append("제목: " + title + "\n")
				.append("작성자: " + writer +"\n")
				.append("내용: " + content)
				.toString();
		return data;
	}
	public static void validateTitle(String title) {
		if(title == null || title.isBlank()) {
			throw new IllegalArgumentException("제목은 빈칸일 수 없습니다");
		}
	}
	public static void validateContent(String content) {
		if(content == null || content.isBlank()) {
			throw new IllegalArgumentException("내용은 빈칸일 수 없습니다");
		}
	}
	public static void validateWriter(String writer) {
		if(writer == null || writer.isBlank()) {
			throw new IllegalArgumentException("작성자는 빈칸일 수 없습니다");
		}
	}
	@Override
    public String toString() {
        return "Post{title='" + title + "', content='" + content + "', writer='" + writer + "'}";
    }

}
