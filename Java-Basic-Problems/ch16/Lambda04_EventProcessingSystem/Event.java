package ch16.Lambda04_EventProcessingSystem;

public class Event {
	private String eventType;
	private String name;
	private String message;
	private int importance;
	
	public Event(String eventType, String name, String message, int importance) {
		this.eventType = eventType;
		this.name = name;
		this.message = message;
		this.importance = importance;
	}
	
	public String getEventType() {
		return eventType;
	}
	public String getName() {
		return name;
	}
	public String getMessage() {
		return message;
	}
	public int getImportance() {
		return importance;
	}
	

}
