package oops;

abstract class AnimalBase {

	abstract void eat();

	void sleep() {
		System.out.println("Animal Sleeping");
	}
}

class HorseAnimal extends AnimalBase {

	@Override
	void eat() {
		System.out.println("Horse Eating Grass");
	}
}

public class AbstractClassImplementationExample {
 
	public static void main(String[] args) {

		HorseAnimal horse = new HorseAnimal();

		horse.eat();
		horse.sleep();
	}
}
