package ch09.nested04_EmployeeInfo;

public class Employee {
	private String name;
	private String department;
	
	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	
	class InfoPrinter {
		public void print() {
			System.out.println("이름: " + name);
			System.out.println("부서: " + department);
		}
	}

}
