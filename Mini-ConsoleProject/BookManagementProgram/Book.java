package BookManagementProgram;

import java.util.Date;
import lombok.Data;

@Data
public class Book {
	private int book_Id;
	private String title;
	private String author;
	private int price;
	private Date created_At;

}
