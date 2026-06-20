package SecondReading.Day2.EmployeePayCalculationProgram;

public class EmployeePayCalculationProgramExample {

	public static void main(String[] args) {
		Employee[] employees = {
			    new FullTimeEmployee("김자바", "E001", 3000000),
			    new PartTimeEmployee("이자바", "E002", 10000, 80),
			    new ContractEmployee("박자바", "E003", 2500000)
			};

			for(Employee employee : employees) {
			    employee.printInfo();
			}
	}

}
