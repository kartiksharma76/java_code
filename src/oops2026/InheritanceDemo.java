package oops2026;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Single inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy is playing");
    }
}

// Hierarchical inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
