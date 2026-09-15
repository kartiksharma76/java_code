package oops;

class Hod {
    void m1() {
        System.out.println("Hod are managed...");
    }
}

class Teacher extends Hod {
    @Override
    void m1() {
        System.out.println("Teacher teaches...");
    }
}

class Student extends Hod {
    @Override
    void m1() {
        System.out.println("Student reads...");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Hod teacher = new Teacher(); 
        Hod student = new Student();

        teacher.m1();  
        student.m1();  
    }
}
