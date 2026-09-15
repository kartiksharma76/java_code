package oops;

class AnimalTwo {

	void eat() {
		System.out.println("Animal Eating");
	}
}

class Tiger extends AnimalTwo {

	void hunt() {
		System.out.println("Tiger Hunting");
	}
}

public class DowncastingExample {

	public static void main(String[] args) {

		AnimalTwo a = new Tiger();

		Tiger t = (Tiger) a;

		t.eat();
		t.hunt();
	}
}