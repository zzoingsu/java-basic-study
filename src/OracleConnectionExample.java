import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionExample {

	public static void main(String[] args) {
		 String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
	     String user = "study";
	     String password = "1234";
	        try {
	            Connection conn = DriverManager.getConnection(url, user, password);
	            System.out.println("Oracle 연결 성공");
	            conn.close();
	        } catch (SQLException e) {
	            System.out.println("Oracle 연결 실패");
	            e.printStackTrace();
	        }
	}

}
