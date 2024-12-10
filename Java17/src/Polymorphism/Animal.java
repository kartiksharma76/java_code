package Polymorphism;

public class Animal {
	// overriden
	public void eat() {
		System.out.println("meat");
	}

	void speak() {
		System.out.println("bark");
	}

	protected Object getName() {
		return "moti";

	}

	public Integer getAge() {
		return 10;
	}

	public Parent getParent() {
		return null;
	}

	public void sleep(int hour, String place) {
		System.out.println(hour + " " + place);
	}
}
