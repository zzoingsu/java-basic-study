package SecondReading.Day2.EmployeePayCalculationProgram;

public class ContractEmployee extends Employee {
	private int contractAmount;
	
	public ContractEmployee(String name, String employeeId, int contractAmount) {
		super(name, employeeId);
		  if(contractAmount <= 0) {
	            throw new IllegalArgumentException("계약 금액은 0원 이하일 수 없습니다.");
	        }
		this.contractAmount = contractAmount;
	}
	@Override
	public int calculateSalary() {
		return contractAmount;
	}
}
