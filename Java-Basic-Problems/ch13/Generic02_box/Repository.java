package ch13.Generic02_box;

public class Repository <T> {
	private T[] items;
	private int size;
	
	public Repository(int capacity) {
		this.items = (T[]) new Object [capacity];
		this.size = 0;
	}
	
	public boolean add(T item) {
		if(isFull()) {
			return false;
		}
		items[size] = item;
		size++;
		return true;
	}
	
	public T get(int index) {
		if(index < 0 || size <= index) {
			return null;
		}
		return items[index];
	}
	
	public boolean isFull() {
		return size == items.length;
	}
	
	public int size() {
		return size;
	}

}
