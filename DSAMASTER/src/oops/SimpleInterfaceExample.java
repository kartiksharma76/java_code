package oops;

interface AnimalAction {
	void sound();
}

class DogAction implements AnimalAction {

	@Override
	public void sound() {
		System.out.println("Dog Barks");
	}

}

public class SimpleInterfaceExample {
	public static void main(String[] args) {
		DogAction dog = new DogAction();
		dog.sound();
	}
}
