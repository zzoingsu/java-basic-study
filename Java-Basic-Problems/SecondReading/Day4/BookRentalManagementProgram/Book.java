package SecondReading.Day4.BookRentalManagementProgram;

class Book {
	private String isbn;
	private String title;
	private String author;
	private boolean borrowed;

	public Book (String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(Boolean borrowed) {
		this.borrowed = borrowed;
	}
	@Override
	public String toString() {
		return "Book{isbn= '" + isbn + "', title= '" + title + "', author= '" + author + "', borrowed= " + borrowed + "}";
	}
}
