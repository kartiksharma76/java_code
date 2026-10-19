package oops2026;

class Parent {
    String name = "Parent";

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    static int count = 0;
    final int id;
    String name = "Child";

    Child(int id) {
        super();
        this.id = id;
        count++;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(super.name);
        super.show();
        System.out.println("ID: " + id);
        System.out.println("Objects created: " + count);
    }
}

public class KeywordsDemo {
    public static void main(String[] args) {
        Child c1 = new Child(101);
        Child c2 = new Child(102);

        c1.display();
        c2.display();
    }
}