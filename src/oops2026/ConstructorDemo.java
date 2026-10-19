package oops2026;

class Employee {
    int id;
    String name;

    Employee() {
        this(0, "Unknown");
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee(Employee other) {
        this(other.id, other.name);
    }

    void display() {
        System.out.println(id + " " + name);
    }

}

public class ConstructorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Kartik");
        Employee e3 = new Employee(e2);

        e1.display();
        e2.display();
        e3.display();
    }
}
