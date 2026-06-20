package SecondReading.Day2.EmployeePayCalculationProgram;

public class PartTimeEmployee extends Employee {
	private int hourlyWage;
	private int workingHours;
	
	public PartTimeEmployee(String name, String employeeId, int hourlyWage, int workingHours) {
		super(name, employeeId);
		if(hourlyWage <= 0) {
            throw new IllegalArgumentException("시급은 0원 이하일 수 없습니다.");
        }
        if(workingHours <= 0) {
            throw new IllegalArgumentException("근무 시간은 0 이하일 수 없습니다.");
        }
		this.hourlyWage = hourlyWage;
		this.workingHours = workingHours;
	}
	@Override
	public int calculateSalary() {
		return hourlyWage * workingHours; 
	}

}
