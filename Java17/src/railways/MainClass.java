package com.jdbc.railways;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userId = -1;

        System.out.println("=== RAILWAY RESERVATION SYSTEM ===");
        
        while (true) {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Add Train (Admin)");
            System.out.println("4. Search Trains");
            System.out.println("5. Book Ticket");
            System.out.println("6. Exit");
            System.out.println("================================");
            
            System.out.print("Enter your choice: ");
            
            if(!sc.hasNextInt()) {
                System.out.println("Please enter a number (1-6)!");
                sc.next();
                continue;
            }
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    UserDAO.register(sc);
                    break;
                case 2:
                    userId = UserDAO.login(sc);
                    break;
                case 3:
                    TrainDAO.addTrain(sc);
                    break;
                case 4:
                    TrainDAO.searchTrains(sc);
                    break;
                case 5:
                    if (userId != -1) {
                        BookingDAO.bookTicket(userId, sc);
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for using Railway Reservation System!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please select 1-6.");
            }
        }
    }
}