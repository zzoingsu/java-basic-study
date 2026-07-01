package SecondReading.Day7.PostUpdtateProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PostUpdtateProgramExample {

	public static void main(String[] args) {
		int bno = 18;
		String btitle  = "새 제목";
		String bcontent = "새 내용";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql_basic_study", 
					"root", 
					"1234");
			String sql = new StringBuilder()
					.append("UPDATE boards ")
					.append("SET btitle=?, ")
					.append("bcontent=? ")
					.append("WHERE bno=? ")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setInt(1, bno);
			
			int rows = pstmt.executeUpdate();
			if(rows == 1) {
				System.out.println("게시글 수정 성공");
			} else {
				System.out.println("게시글 수정 실패");
			}
			
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
