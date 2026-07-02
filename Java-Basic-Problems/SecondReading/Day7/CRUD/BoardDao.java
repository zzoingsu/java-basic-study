package SecondReading.Day7.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private Connection conn;
	
	public BoardDao(Connection conn) {
		this.conn = conn;
	}
	public List<Board> findAll() throws Exception {
		List<Board> boards = new ArrayList<>();
		String sql = "SELECT bno, btitle, bwriter, bdate FROM boards ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Board board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBdate(rs.getDate("bdate"));
			boards.add(board);
		}
		rs.close();
		pstmt.close();
		return boards;
	}
	
	public Board findByBno(int bno) throws Exception {
		String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		ResultSet rs = pstmt.executeQuery();
		Board board = null;
		if (rs.next()) {
			board = new Board();
			board.setBno(rs.getInt("bno"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBwriter(rs.getString("bwriter"));
			board.setBdate(rs.getDate("bdate"));
		}
		rs.close();
		pstmt.close();
		return board;
	}
	
	public void insert(Board board) throws Exception {
		String sql = "INSERT INTO boards (btitle, bcontent, bwriter) VALUES (?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.executeUpdate();
		pstmt.close();
	}
	
	public void update(Board board) throws Exception {
		String sql = "UPDATE boards SET btitle=?, bcontent=?, bwriter=? WHERE bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.setInt(4, board.getBno());
		pstmt.executeUpdate();
		pstmt.close();
	}
	
	public void delete(int bno) throws Exception {
		String sql = "DELETE FROM boards WHERE bno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bno);
		pstmt.executeUpdate();
		pstmt.close();
	}
	
	public void clear() throws Exception {
		String sql = "TRUNCATE TABLE boards";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		pstmt.close();
	}

}

