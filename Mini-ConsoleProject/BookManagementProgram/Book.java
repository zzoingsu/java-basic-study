package BookManagementProgram;

import java.util.Date;
import lombok.Data;

@Data
public class Book {
	private int bookId;
	private String title;
	private String author;
	private int price;
	private Date createdAt;

}
