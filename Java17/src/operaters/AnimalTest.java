package operaters;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		System.out.println("*****************");
		Dog d = new Dog();
		d.eat();
		d.runner();
	}
}
