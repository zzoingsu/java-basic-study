package ch16.Lambda04_EventProcessingSystem;

public class EventProcesser {
	public void registerHandler(Event[] events, EventProcess eventprocess) {
		for(int i=0; i<events.length; i++) {
			if(events[i].getEventType().equals("LOGIN")) {
				System.out.println("[" + events[i].getEventType() + "]");
				System.out.println();
			}
		}
	}

}
