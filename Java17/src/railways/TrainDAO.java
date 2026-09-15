package com.jdbc.railways;

import java.sql.*;
import java.util.Scanner;

public class TrainDAO {

    public static void addTrain(Scanner sc) {
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = DBConnection.getConnection();
            if(con == null) {
                System.out.println("Cannot connect to database!");
                return;
            }
            
            sc.nextLine(); // Clear buffer

            System.out.print("Train Name: ");
            String name = sc.nextLine();

            System.out.print("Source: ");
            String source = sc.nextLine();

            System.out.print("Destination: ");
            String dest = sc.nextLine();

            System.out.print("SL Seats & Fare: ");
            int slSeats = sc.nextInt();
            double slFare = sc.nextDouble();

            System.out.print("3A Seats & Fare: ");
            int a3Seats = sc.nextInt();
            double a3Fare = sc.nextDouble();

            System.out.print("2A Seats & Fare: ");
            int a2Seats = sc.nextInt();
            double a2Fare = sc.nextDouble();

            ps = con.prepareStatement(
                "INSERT INTO trains VALUES(NULL,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, source);
            ps.setString(3, dest);
            ps.setInt(4, slSeats);
            ps.setDouble(5, slFare);
            ps.setInt(6, a3Seats);
            ps.setDouble(7, a3Fare);
            ps.setInt(8, a2Seats);
            ps.setDouble(9, a2Fare);
            
            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Train Added Successfully!");
            } else {
                System.out.println("Failed to add train!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if(ps != null) ps.close();
                if(con != null) con.close();
            } catch(SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    public static void searchTrains(Scanner sc) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = DBConnection.getConnection();
            if(con == null) {
                System.out.println("Cannot connect to database!");
                return;
            }
            
            sc.nextLine(); // Clear buffer

            System.out.print("Source: ");
            String src = sc.nextLine();

            System.out.print("Destination: ");
            String dest = sc.nextLine();

            ps = con.prepareStatement(
                "SELECT * FROM trains WHERE source=? AND destination=?");
            ps.setString(1, src);
            ps.setString(2, dest);

            rs = ps.executeQuery();
            
            System.out.println("\n========== AVAILABLE TRAINS ==========");
            System.out.println("ID | Train Name | Source | Destination | SL Seats | 3A Seats | 2A Seats");
            System.out.println("--------------------------------------------------------------");
            
            boolean found = false;
            while (rs.next()) {
                found = true;
                System.out.println(
                    rs.getInt("train_id") + " | " +
                    rs.getString("train_name") + " | " +
                    rs.getString("source") + " | " +
                    rs.getString("destination") + " | " +
                    rs.getInt("sl_seats") + " | " +
                    rs.getInt("a3_seats") + " | " +
                    rs.getInt("a2_seats")
                );
            }
            
            if(!found) {
                System.out.println("No trains found for the given route!");
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
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