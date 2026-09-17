package Collections;

import java.util.ArrayList;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatoreEx {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Rahul", 80));
        list.add(new Student("Aman", 60));
        list.add(new Student("Kartik", 90));

        list.sort((a, b) -> a.marks - b.marks);

        for (Student s : list) {
            System.out.println(s.name + " " + s.marks);
        }
    }

}
