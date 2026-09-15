package oops;

class Employee1{

    void work() {
        System.out.println("Employee Working");
    }
}

class Developer extends Employee1 {

    void code() {
        System.out.println("Developer Coding");
    }
}

class Tester extends Employee1 {

    void test() {
        System.out.println("Tester Testing");
    }
}

public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Developer d = new Developer();
        Tester t = new Tester();

        d.work();
        d.code();

        t.work();
        t.test();
    }
}