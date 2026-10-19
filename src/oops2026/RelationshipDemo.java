package oops2026;

import java.util.ArrayList;
import java.util.List;

// 1. Association: Student has a reference to Teacher
class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Students {
    String name;
    Teacher teacher;

    Students(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}

// 2. Aggregation: Department has Employees
// Employees can exist independently of Department.
class Employees {
    String name;

    Employees(String name) {
        this.name = name;
    }
}

class Department {
    List<Employees> employees;

    Department(List<Employees> employees) {
        this.employees = new ArrayList<>(employees);
    }
}

// 3. Composition: Car owns its Engine in this design.
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private final Engine engine = new Engine();

    void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

// Main class
public class RelationshipDemo {
    public static void main(String[] args) {

        // Association
        Teacher teacher = new Teacher("Amit");
        Students student = new Students("Kartik", teacher);

        System.out.println(student.name + " -> " + student.teacher.name);

        // Aggregation
        Employees e1 = new Employees("Rahul");
        Department department = new Department(List.of(e1));

        System.out.println("Department employee: " + department.employees.get(0).name);

        // Composition
        Car car = new Car();
        car.startCar();
    }
}
