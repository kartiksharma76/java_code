package oops;

// Base Class
class Parent {
    String name = "Parent Class";

    void property() {
        System.out.println("This is Parent Property");
    }

    void show() {
        System.out.println("Parent show() method");
    }
}

// Child Class 1
class Child1 extends Parent {

    String name = "Child1 Class";

    @Override
    void property() {
        System.out.println("Child1 overrides Parent property");
    }

    @Override
    void show() {
        super.show(); // calling parent method
        System.out.println("Child1 show() method");
    }
}

// Child Class 2
class Child2 extends Parent {

    @Override
    void property() {
        System.out.println("Child2 overrides Parent property differently");
    }

    void extraMethod() {
        System.out.println("Extra method in Child2");
    }
}

// Main Class
public class MethodOverridingHard {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Parent obj;

        obj = new Parent();
        obj.property();
        obj.show();

        System.out.println("-------------");

        obj = new Child1(); // Parent reference, Child1 object
        obj.property();     // Calls Child1 version
        obj.show();

        System.out.println("-------------");

        obj = new Child2(); // Parent reference, Child2 object
        obj.property();     // Calls Child2 version
        obj.show();         // Calls Parent show()

        // Downcasting example
        Child2 c2 = (Child2) obj;
        c2.extraMethod();
    }
}