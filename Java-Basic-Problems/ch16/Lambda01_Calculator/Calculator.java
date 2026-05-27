package ch16.Lambda01_Calculator;

public class Calculator {
	public void calculator( double x, double y, Calculable calculable) {
		System.out.println("결과: " + calculable.cal(x, y));
	}
}
