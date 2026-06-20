package SecondReading.Day2.AnimalSoundProgram;

public class Bird extends Animal{
	public Bird(String name) {
		super(name);
	}
	@Override
	public void sound() {
		System.out.println("짹짹");
	}

}
