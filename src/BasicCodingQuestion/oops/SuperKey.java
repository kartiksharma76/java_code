package BasicCodingQuestion.oops;

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Parent constructor called");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // Calls parent constructor
        System.out.println("Child constructor called");
    }

    void display() {
        System.out.println(super.name); // Parent variable
        System.out.println(this.name);  // Child variable

        super.eat(); // Parent method
    }
}

public class SuperKey {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.display();
    }
}