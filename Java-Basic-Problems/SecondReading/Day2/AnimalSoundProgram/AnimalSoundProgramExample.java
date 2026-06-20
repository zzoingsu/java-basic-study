package SecondReading.Day2.AnimalSoundProgram;

public class AnimalSoundProgramExample {

	public static void main(String[] args) {
		Animal dog = new Dog("바둑이");
		Animal cat = new Cat("나비");
		Animal bird = new Bird("짹돌이");

		dog.introduce();
		dog.sound();

		cat.introduce();
		cat.sound();

		bird.introduce();
		bird.sound();
	}

}
