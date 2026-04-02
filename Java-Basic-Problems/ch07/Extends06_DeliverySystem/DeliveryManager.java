package ch07.Extends06_DeliverySystem;

public class DeliveryManager {

	public void process(Delivery delivery) {
		delivery.showItem();
		delivery.deliver();
	}
}
