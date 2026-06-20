package SecondReading.Day2.AnimalSoundProgram;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public abstract void sound();
	
	public void introduce() {
	System.out.println("저는 " + name + "입니다");	
	}
}
