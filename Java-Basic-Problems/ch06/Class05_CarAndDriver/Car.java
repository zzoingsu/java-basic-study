package ch06.Class05_CarAndDriver;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
		speed = 0;
	}
	void accelerate(int value) {
		if (value < 0) {
			System.out.println("잘못된 입력입니다");
		}else {
		speed += value;
		}
	}
	void brake(int value) {
		if (value < 0) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		if (speed >= value) {
		speed -= value;
		return;
		}
		if (speed < value) {
			System.out.println("속도는 0보다 낮아질수 없습니다");
			speed = 0;
		}
	}
	void showStatus () {
		System.out.printf("모델명: %s, 현재 속도: %d\n", model, speed);
	}
}
