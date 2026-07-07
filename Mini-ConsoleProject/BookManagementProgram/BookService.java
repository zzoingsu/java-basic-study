package BookManagementProgram;

public class BookService {
	private BookDao bookDao;
	
	public BookService(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	public void create(Book book) throws Exception {
		validate(book);
		bookDao.insert(book);
	}
	
	public void update(Book book) throws Exception {
		validate(book);
		bookDao.update(book);
	}
	
	public void delete(Book book) throws Exception {
        Book foundBook = bookDao.findById(book.getBookId());
        if(foundBook == null) {
            throw new IllegalArgumentException("존재하지 않는 도서입니다.");
        }
        bookDao.delete(foundBook);
    }

    public void clear() throws Exception {
        bookDao.clear();
    }

    public Book findById(int bookId) throws Exception {
        return bookDao.findById(bookId);
    }
    
	public static void validate(Book book) {
		if(book.getTitle().isEmpty() || book.equals(null)) {
			throw new IllegalArgumentException("제목은 필수입니다");
		}
		if(book.getAuthor() == null || book.getAuthor().isBlank()) {
            throw new IllegalArgumentException("저자는 필수입니다.");
        }
        if(book.getPrice() <= 0) {
            throw new IllegalArgumentException("가격은 0보다 커야 합니다.");
        }
	}
}
