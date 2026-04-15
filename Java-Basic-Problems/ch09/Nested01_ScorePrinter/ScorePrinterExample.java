package ch09.Nested01_ScorePrinter;

public class ScorePrinterExample {

	public static void main(String[] args) {
		Student student = new Student("김철수", 85);
		Student.ScorePrinter printer = student.new ScorePrinter();
		printer.printInfo();
		
	}

}
