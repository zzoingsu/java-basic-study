package ch06.Class05_CarAndDriver;

public class Driver {
	String name;
	
	Driver(String name) {
		this.name = name;
	}
	void drive(Car car, int speed) {
		car.accelerate(speed);
	}
	void stop (Car car, int speed) {
		car.brake(speed);
	}

}
