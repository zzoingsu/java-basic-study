package SecondReading.Day5.Calculator;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator add = (a,b) -> a + b;
		Calculator subtract = (a,b) -> a - b;
		Calculator multiply = (a,b) -> a * b;
		Calculator divide = (a,b) -> {
			if(b == 0) {
				throw new IllegalArgumentException("b는 0일수 없습니다");
			}
			return  a / b;
		};
		
		System.out.println(add.calculate(10, 5));
		System.out.println(subtract.calculate(10, 5));
		System.out.println(multiply.calculate(10, 5));
		System.out.println(divide.calculate(10, 5));
	}

}
