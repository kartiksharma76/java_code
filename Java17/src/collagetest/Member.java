package collagetest;

class Person {
    String name;

    void Show() {
        System.out.println("Hello, my name is " + name);
    }
}
class Child extends Person{
	String collage;
	void Kar() {
		System.out.println("SIRT");
	}
}

public class Member {
    public static void main(String[] args) {
        Child p = new Child();
        p.name = "Kartikey";
        p.collage= "SIRT";
        p.Kar();
        p.Show();
    }
}