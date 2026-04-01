package ch07.Extends03_GameCharactorType;

public class GamePratice {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("아레스", 100);
		Wizard wizard = new Wizard("메르", 70);
		
		warrior.greet();
		warrior.showStatus();
		warrior.attack();
		
		wizard.greet();
		wizard.showStatus();
		wizard.attack();
		
	}

}
