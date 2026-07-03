package BookManagementProgram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	private Connection conn;
	
	public BookDao(Connection conn) {
		this.conn = conn;
	}
	
	public List<Book> findAll() throws Exception {
		List<Book> books = new ArrayList<>();
		String sql = new StringBuilder()
				.append("SELECT book_id, author, price, created_at, title ")
				.append("FROM books")
				.toString();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Book book = new Book();
			book.setBook_Id(rs.getInt(1));
			book.setAuthor(rs.getString(2));
			book.setPrice(rs.getInt(3));
			book.setCreated_At(rs.getDate(4));
			book.setTitle(rs.getString(5));
			books.add(book);
		}
		pstmt.close();
		rs.close();
		return books;
	}
	
	public Book findById(int book_id) throws Exception {
		Book book = null;
		String sql = new StringBuilder()
				.append("SELECT book_id, author, price, created_at, title ")
				.append("FROM books")
				.append("WHERE book_id=?")
				.toString();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, book_id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			book = new Book();
			book.setBook_Id(rs.getInt(1));
			book.setAuthor(rs.getString(2));
			book.setPrice(rs.getInt(3));
			book.setCreated_At(rs.getDate(4));
			book.setTitle(rs.getString(5));
		}
		pstmt.close();
		rs.close();
		return book;
	}

	public void insert(Book book) throws Exception {
		String sql = new StringBuilder()
				.append("INSERT INTO books (author, price, title) ")
				.append("VALUES (?, ?, ?)")
				.toString();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, book.getAuthor());
		pstmt.setInt(2, book.getPrice());
		pstmt.setString(3, book.getTitle());
		pstmt.executeUpdate();
		pstmt.close();
	}
	
	public void update(Book book) throws Exception {
		String sql = new StringBuilder()
				.append("UPDATE books SET author=?, price=?, title=? ")
				.append("WHERE book_id=?")
				.toString();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, book.getAuthor());
		pstmt.setInt(2, book.getPrice());
		pstmt.setString(3, book.getTitle());
		pstmt.setInt(4, book.getBook_Id());
		pstmt.executeUpdate();
		pstmt.close();
	}
	
	public void delete(Book book) throws Exception {
		String sql = new StringBuilder()
				.append("DELETE FROM books WHERE book_id=? ")
				.toString();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, book.getBook_Id());
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
