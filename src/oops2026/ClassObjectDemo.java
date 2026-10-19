package oops2026;

class Student {
    int id;
    String name;
    double marks;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    void study() {
        System.out.println(name + "is studying Java");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Kartik";
        s1.marks = 85.5;

        s1.display();
        s1.study();
    }
}
