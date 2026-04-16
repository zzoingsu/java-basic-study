package ch09.nested04_EmployeeInfo;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee employee = new Employee("김민수", "개발팀");
		Employee.InfoPrinter infoPrinter = employee.new InfoPrinter();
		infoPrinter.print();
	}

}
