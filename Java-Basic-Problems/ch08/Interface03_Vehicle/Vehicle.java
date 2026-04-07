package ch08.Interface03_Vehicle;

public interface Vehicle {
	void run();
	
	default void stop() {
		System.out.println("차량이 멈춥니다");
	}

}
