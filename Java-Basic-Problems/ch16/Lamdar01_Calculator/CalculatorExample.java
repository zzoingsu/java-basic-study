package ch16.Lamdar01_Calculator;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.calculator(10, 4, (x, y) -> x + y);
		calculator.calculator(10, 4, (x, y) -> x - y);
		calculator.calculator(10, 4, (x, y) -> x * y);
		calculator.calculator(10, 0, (x, y) -> x / y);
	}

}
