package javapractice2026;

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    void show1() {
        System.out.println("Child 1");
    }
}

class Child2 extends Parent {
    void show2() {
        System.out.println("Child 2");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.display();
        c2.display();
    }
}
