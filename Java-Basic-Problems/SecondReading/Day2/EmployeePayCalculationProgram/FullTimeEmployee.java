package SecondReading.Day2.EmployeePayCalculationProgram;

public class FullTimeEmployee extends Employee {
	private int monthlySalary;
	
	public FullTimeEmployee(String name, String employeeId, int monthlySalary) {
		super(name, employeeId);
		if(monthlySalary <= 0) {
            throw new IllegalArgumentException("월급은 0원 이하일 수 없습니다.");
        }
		this.monthlySalary = monthlySalary;
	}
	@Override
	public int calculateSalary() {
		return monthlySalary;
	}

}
