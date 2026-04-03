package oops;

interface Animal2{
	void sound();
}

class Dog2 implements Animal2 {

    public void sound() {
        System.out.println("Dog barks");
    }
}
public class UsingInterface {
	public static void main(String[] args) {
        Animal2 a = new Dog2();
        a.sound();
    }
}
