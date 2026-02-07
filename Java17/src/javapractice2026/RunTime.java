package javapractice2026;
class Animal2 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class RunTime {
public static void main(String[] args) {
	Animal2 a = new Dog2();
	a.sound();
}
}
