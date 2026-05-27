package ch16.Lambda04_EventProcessingSystem;

@FunctionalInterface
public interface EventProcess {
	public String eventProcess(Event event);
}
