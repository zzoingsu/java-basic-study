package SecondReading.Day7.PostListLookupProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PostListLookupProgramExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql_basic_study", 
					"root", 
					"1234"
					);
			String sql  = new StringBuilder()
					.append("SELECT bno, btitle, bwriter, bdate ")
					.append("FROM boards ")
					.append("ORDER BY bno DESC")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt(1));
				board.setBtitle(rs.getString(2));
				board.setBwriter(rs.getString(3));
				board.setBdate(rs.getDate(4));
				System.out.println(board);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
