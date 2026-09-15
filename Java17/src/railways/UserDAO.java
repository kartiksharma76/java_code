package com.jdbc.railways;

import java.sql.*;
import java.util.Scanner;

public class UserDAO {

    public static void register(Scanner sc) {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = DBConnection.getConnection();
            if(con == null) {
                System.out.println("Cannot connect to database!");
                return;
            }
            
            sc.nextLine(); // Clear buffer
            
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            ps = con.prepareStatement(
                "INSERT INTO users VALUES(NULL,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            
            int rows = ps.executeUpdate();
            
            if(rows > 0) {
                System.out.println("Account Created Successfully!");
            } else {
                System.out.println("Registration failed!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(ps != null) ps.close();
                if(con != null) con.close();
            } catch(SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    public static int login(Scanner sc) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = DBConnection.getConnection();
            if(con == null) {
                System.out.println("Cannot connect to database!");
                return -1;
            }
            
            sc.nextLine(); // Clear buffer

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            ps = con.prepareStatement(
                "SELECT user_id FROM users WHERE email=? AND password=?");
            ps.setString(1, email);
            ps.setString(2, password);

            rs = ps.executeQuery();
            
            if (rs.next()) {
                int userId = rs.getInt(1);
                System.out.println("Login Successful! User ID: " + userId);
                return userId;
            } else {
                System.out.println("Invalid Credentials");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        } finally {
            try {
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            } catch(SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}