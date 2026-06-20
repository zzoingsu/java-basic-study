package SecondReading.Day2.AnimalSoundProgram;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
