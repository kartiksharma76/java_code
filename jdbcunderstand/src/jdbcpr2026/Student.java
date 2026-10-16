package jdbcpr2026;

public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private double marks;

    public Student(String name, String email, String course, double marks) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    public Student(int id, String name, String email, String course, double marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {

        return id + " | " + name + " | " + email + " | " + course + " | " + marks;
    }
}
