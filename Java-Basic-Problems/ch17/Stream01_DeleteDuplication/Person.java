package ch17.Stream01_DeleteDuplication;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public boolean isOver20() {
		return age >= 20;
	}
	
}
