package jdbcpr2026;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainJDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        try (Connection con = DBConnection.getConnection()) {
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            sc.close();
            return;
        }

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks;

                    try {
                        marks = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid marks!");
                        break;
                    }

                    if (name.isBlank() || email.isBlank() || course.isBlank() || !Double.isFinite(marks) || marks < 0 || marks > 100) {
                        System.out.println("Invalid student details!");
                        break;
                    }

                    dao.addStudent(new Student(name, email, course, marks));
                    break;

                case 2:
                    dao.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    try {
                        dao.searchStudent(Integer.parseInt(sc.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID!");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine().trim());

                        System.out.print("New name: ");
                        String newName = sc.nextLine();

                        System.out.print("New email: ");
                        String newEmail = sc.nextLine();

                        System.out.print("New course: ");
                        String newCourse = sc.nextLine();

                        System.out.print("New marks: ");
                        double newMarks = Double.parseDouble(sc.nextLine());

                        if (newName.isBlank() || newEmail.isBlank() || newCourse.isBlank() || !Double.isFinite(newMarks) || newMarks < 0 || newMarks > 100 || !newEmail.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
                            System.out.println("Invalid details!");
                            break;
                        }

                        dao.updateStudent(id, newName, newEmail, newCourse, newMarks);

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    try {
                        dao.deleteStudent(Integer.parseInt(sc.nextLine().trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID!");
                    }
                    break;

                case 0:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
