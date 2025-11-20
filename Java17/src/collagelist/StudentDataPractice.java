package com.jdbc.collagelist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDataPractice {

    // -------------------- INSERT --------------------
    public static void insert(StudentData data) {
        String query = "INSERT INTO student_data (gmail, total, name) VALUES (?, ?, ?)";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, data.getGmail());
            ps.setInt(2, data.getTotal());
            ps.setString(3, data.getName());

            int record = ps.executeUpdate();
            System.out.println(record == 1 ? "Record inserted" : "Record not inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------- UPDATE --------------------
    public static void update(StudentData data) {
        String query = "UPDATE student_data SET total=?, name=? WHERE gmail=?";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, data.getTotal());
            ps.setString(2, data.getName());
            ps.setString(3, data.getGmail());

            int record = ps.executeUpdate();
            System.out.println(record == 1 ? "Record updated" : "Record not updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------- DELETE --------------------
    public static void deleteStudent(String gmail) {
        String query = "DELETE FROM student_data WHERE gmail=?";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, gmail);

            int record = ps.executeUpdate();
            System.out.println(record >= 1 ? record + " record deleted" : "Record not deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------- FETCH ALL --------------------
    public static void fetchAllStudents() {
        String query = "SELECT * FROM student_data";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("gmail") + " | " +
                        rs.getInt("total") + " | " +
                        rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------- FETCH BY GMAIL --------------------
    public static void fetchByGmail(String gmail) {
        String query = "SELECT * FROM student_data WHERE gmail=?";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, gmail);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString("gmail") + " | " +
                        rs.getInt("total") + " | " +
                        rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------- FETCH BY NAME --------------------
    public static void fetchByName(String name) {
        String query = "SELECT * FROM student_data WHERE name=?";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString("gmail") + " | " +
                        rs.getInt("total") + " | " +
                        rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------------- VERIFY USER (OPTIONAL) --------------------
    public static boolean verifyUser(String username, String password) {
        String query = "SELECT * FROM user WHERE user_name=? AND password=?";

        try (Connection connection = DataBase.getMysqlConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            return rs.next();  // user exists

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
