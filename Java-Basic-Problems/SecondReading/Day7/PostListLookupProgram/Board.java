package SecondReading.Day7.PostListLookupProgram;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {
	private int bno;
	private String btitle; 
	private String bcontent;
	private String bwriter;
	private Date bdate;

	public String toString() {
		return bno + btitle + bwriter + bdate;
	}
}
