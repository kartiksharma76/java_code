package com.jdbc.railways;

import java.sql.*;
import java.util.Scanner;

public class BookingDAO {

    public static void bookTicket(int userId, Scanner sc) {
        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement book = null;
        PreparedStatement update = null;
        ResultSet rs = null;
        
        try {
            con = DBConnection.getConnection();
            if(con == null) {
                System.out.println("Cannot connect to database!");
                return;
            }

            System.out.print("Train ID: ");
            int trainId = sc.nextInt();

            System.out.print("Class (SL/3A/2A): ");
            String cls = sc.next();

            System.out.print("Seats: ");
            int seats = sc.nextInt();

            String seatCol="", fareCol="";
            if (cls.equalsIgnoreCase("SL")) {
                seatCol="sl_seats"; fareCol="sl_fare";
            } else if (cls.equalsIgnoreCase("3A")) {
                seatCol="a3_seats"; fareCol="a3_fare";
            } else if (cls.equalsIgnoreCase("2A")) {
                seatCol="a2_seats"; fareCol="a2_fare";
            } else {
                System.out.println("Invalid Class");
                return;
            }

            ps = con.prepareStatement(
                "SELECT "+seatCol+","+fareCol+" FROM trains WHERE train_id=?");
            ps.setInt(1, trainId);
            rs = ps.executeQuery();

            if (!rs.next()) {
                System.out.println("Train not found!");
                return;
            }
            
            int availableSeats = rs.getInt(1);
            if (availableSeats < seats) {
                System.out.println("Not enough seats available! Only " + availableSeats + " seats left.");
                return;
            }

            double farePerSeat = rs.getDouble(2);
            double total = seats * farePerSeat;
            
            System.out.printf("Total Fare: ₹%.2f\n", total);
            System.out.print("Confirm booking? (yes/no): ");
            String confirm = sc.next();
            
            if(!confirm.equalsIgnoreCase("yes")) {
                System.out.println("Booking cancelled!");
                return;
            }

            // Insert booking
            book = con.prepareStatement(
                "INSERT INTO bookings VALUES(NULL,?,?,?,?,CURDATE())");
            book.setInt(1, userId);
            book.setInt(2, trainId);
            book.setInt(3, seats);
            book.setDouble(4, total);
            book.executeUpdate();

            // Update seats
            update = con.prepareStatement(
                "UPDATE trains SET "+seatCol+"="+seatCol+"-? WHERE train_id=?");
            update.setInt(1, seats);
            update.setInt(2, trainId);
            update.executeUpdate();

            System.out.println("Booked Successfully! Total Fare = ₹" + total);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(book != null) book.close();
                if(update != null) update.close();
                if(con != null) con.close();
            } catch(SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}