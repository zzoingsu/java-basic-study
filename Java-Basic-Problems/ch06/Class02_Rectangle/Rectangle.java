package ch06.Class02_Rectangle;

public class Rectangle {
	
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea () {
		return  width * height;
	}
	void showArea () {
		System.out.println("넓이: " + getArea());
	}
}
