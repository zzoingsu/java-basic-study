package ch06.Class05_CarAndDriver;

public class CarAndDriveMain {

	public static void main(String[] args) {
		Car myCar = new Car("택시");
		Driver myDriver = new Driver("zzoingsu");
		
		myDriver.drive (myCar, 50);
		myCar.showStatus();
		myDriver.stop(myCar, 20);
		myCar.showStatus();
		myDriver.stop(myCar, 40);
		myCar.showStatus();
	}

}
