package ch07.Extends02_EmployAndManager;

public class Employee {
	public String name;
	private int salary;
	
	Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + ", 급여: " + salary);
	}
	public int getSalary () {
		return salary;
	}

}
