package jdbcpr2026;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student s) {
        String sql = "INSERT INTO students(name,email,course,marks) " + "VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCourse());
            ps.setDouble(4, s.getMarks());

            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "Student added successfully!" : "Student not added.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayStudents() {
        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("email") + " | " + rs.getString("course") + " | " + rs.getDouble("marks"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchStudent(int id) {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("email") + " | " + rs.getString("course") + " | " + rs.getDouble("marks"));
                } else {
                    System.out.println("Student not found!");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStudent(int id, String name, String email, String course, double marks) {

        String sql = "UPDATE students SET name=?, email=?, " + "course=?, marks=? WHERE id=?";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.setDouble(4, marks);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            System.out.println(rows > 0 ? "Student updated!" : "Student not found!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(int id) {

        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            System.out.println(rows > 0 ? "Student deleted!" : "Student not found!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getString("course"), rs.getDouble("marks")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}