package SecondReading.Day2.EmployeePayCalculationProgram;

public abstract class Employee {
	private String name;
	private String employeeId;
	
	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public abstract int calculateSalary();
	
	public void printInfo() {
		System.out.println("직원명: " + name + ", 사번: " + employeeId + ", 급여: "  + calculateSalary());
	}
}
