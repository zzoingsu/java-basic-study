package SecondReading.Day7.MemberRegisterProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberRegisterProgramExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql_basic_study",
					"root", 
					"1234");
			String sql = new StringBuilder()
					.append("INSERT INTO users ")
					.append("(userid, username, userpassword, userage, useremail) ")
					.append("VALUES (?, ?, ?, ?, ?)")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "zzoingsu");
			pstmt.setString(2, "choi jongsu");
			pstmt.setString(3, "1234");
			pstmt.setInt(4, 23);
			pstmt.setString(5, "nininick@naver.com");
			
			int row = pstmt.executeUpdate();
			if(row == 1) {
				System.out.println("회원 등록 성공");
			} else {
				System.out.println("회원 등록 실패");
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

}
