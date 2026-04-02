package ch07.Extends06_DeliverySystem;

public class DeliveryMain {

	public static void main(String[] args) {
		Delivery[] deliveries = new Delivery[3];
		
		deliveries[0] = new RocketDelivery("노트북", 3);
		deliveries[1] = new NormalDelivery("책", "CJ대한통운");
		deliveries[2] = new PremiumNormalDelivery("의류", "롯데택배", true);
		
		DeliveryManager deliveryManager = new DeliveryManager();
		for(int i = 0; i < deliveries.length; i++) {
			if(deliveries[i] instanceof RocketDelivery rocketDelivery) {
				rocketDelivery.checkFastDelivery();
				deliveryManager.process(deliveries[i]);
				}else {
				deliveryManager.process(deliveries[i]);
			}if(deliveries[i] instanceof PremiumNormalDelivery premiumNormalDelivery) {
				premiumNormalDelivery.showPremiumService();
			}else if (deliveries[i] instanceof NormalDelivery normalDelivery) {
				normalDelivery.trackPackage();
			}
		}
	}

}
