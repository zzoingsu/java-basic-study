package ch07.Extends02_EmployAndManager;

public class Manager extends Employee{
	public String department;
	
	Manager(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	} 
	
	@Override
	public void printInfo() {
		System.out.println("이름: " + name + ", 급여: " + getSalary() + ", 부서: " + department);
	}
	public void getSalaryInfo() {
		System.out.println("급여 확인: " + getSalary());
	}

}
