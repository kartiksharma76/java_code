package com.jdbc.atm;

import java.sql.*;
import java.util.Scanner;

public class ATMJdbc {

    static final String URL = "jdbc:mysql://localhost:3306/atm_db";
    static final String USER = "root";
    static final String PASS = "Kartik@2005";

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);

            int choice;
            do {
                System.out.println("\n=== ATM SYSTEM ===");
                System.out.println("1. Create New Account");
                System.out.println("2. Exit");
                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        int accNo = createAccount();
                        if (accNo != -1) {
                            atmMenu(accNo);
                        }
                    }
                    case 2 -> System.out.println("System Closed.");
                    default -> System.out.println("Invalid choice.");
                }
            } while (choice != 2);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ================= CREATE ACCOUNT =================
    static int createAccount() throws SQLException {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Set 4-digit PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (balance < 0) {
            System.out.println("Invalid balance.");
            return -1;
        }

        String sql = "INSERT INTO account VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, accNo);
        ps.setString(2, name);
        ps.setInt(3, pin);
        ps.setDouble(4, balance);

        try {
            ps.executeUpdate();
            System.out.println("Account created successfully.");
            return accNo;
        } catch (SQLException e) {
            System.out.println("Account already exists.");
            return -1;
        }
    }

    // ================= ATM MENU =================
    static void atmMenu(int accNo) throws SQLException {
        System.out.print("Enter PIN to login: ");
        int pin = sc.nextInt();

        if (!login(accNo, pin)) {
            System.out.println("Wrong PIN.");
            return;
        }

        int choice;
        do {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Show My Account Details");
            System.out.println("7. Show All Accounts (Database)");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> checkBalance(accNo);
                case 2 -> deposit(accNo);
                case 3 -> withdraw(accNo);
                case 4 -> changePin(accNo);
                case 5 -> calculateInterest(accNo);
                case 6 -> showMyAccount(accNo);
                case 7 -> showAllAccounts();
                case 8 -> System.out.println("Logged out.");
                default -> System.out.println("Invalid option.");
            }

        } while (choice != 8);
    }

    // ================= LOGIN =================
    static boolean login(int accNo, int pin) throws SQLException {
        String sql = "SELECT * FROM account WHERE account_no=? AND pin=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ps.setInt(2, pin);
        ResultSet rs = ps.executeQuery();
        boolean status = rs.next();
        rs.close();
        ps.close();
        return status;
    }

    // ================= BALANCE =================
    static void checkBalance(int accNo) throws SQLException {
        String sql = "SELECT balance FROM account WHERE account_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("Balance: ₹" + rs.getDouble("balance"));
        }
        rs.close();
        ps.close();
    }

    // ================= DEPOSIT =================
    static void deposit(int accNo) throws SQLException {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        if (amt <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        String sql = "UPDATE account SET balance = balance + ? WHERE account_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, amt);
        ps.setInt(2, accNo);
        ps.executeUpdate();
        System.out.println("Deposit successful.");
        ps.close();
    }

    // ================= WITHDRAW =================
    static void withdraw(int accNo) throws SQLException {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        String sql = "SELECT balance FROM account WHERE account_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();

        if (rs.next() && rs.getDouble("balance") >= amt) {
            String upd = "UPDATE account SET balance = balance - ? WHERE account_no=?";
            PreparedStatement ups = con.prepareStatement(upd);
            ups.setDouble(1, amt);
            ups.setInt(2, accNo);
            ups.executeUpdate();
            System.out.println("Cash withdrawn.");
            ups.close();
        } else {
            System.out.println("Insufficient balance.");
        }

        rs.close();
        ps.close();
    }

    // ================= CHANGE PIN =================
    static void changePin(int accNo) throws SQLException {
        System.out.print("Enter new PIN: ");
        int newPin = sc.nextInt();

        String sql = "UPDATE account SET pin=? WHERE account_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, newPin);
        ps.setInt(2, accNo);
        ps.executeUpdate();
        System.out.println("PIN changed successfully.");
        ps.close();
    }

    // ================= INTEREST =================
    static void calculateInterest(int accNo) throws SQLException {
        String sql = "SELECT balance FROM account WHERE account_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            double balance = rs.getDouble("balance");
            double interest = balance * 0.04; // 4% yearly
            System.out.println("Yearly Interest @4%: ₹" + interest);
        }

        rs.close();
        ps.close();
    }

    // ================= SHOW LOGGED-IN ACCOUNT =================
    static void showMyAccount(int accNo) throws SQLException {
        String sql = "SELECT account_no, name, balance FROM account WHERE account_no=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, accNo);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("\n--- ACCOUNT DETAILS ---");
            System.out.println("Account No : " + rs.getInt("account_no"));
            System.out.println("Name       : " + rs.getString("name"));
            System.out.println("Balance    : ₹" + rs.getDouble("balance"));
        }

        rs.close();
        ps.close();
    }

    // ================= SHOW ALL ACCOUNTS =================
    static void showAllAccounts() throws SQLException {
        String sql = "SELECT account_no, name, balance FROM account";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.out.println("\n--- ALL ACCOUNTS ---");
        System.out.println("Acc No\tName\t\tBalance");
        System.out.println("----------------------------------");

        while (rs.next()) {
            System.out.println(
                rs.getInt("account_no") + "\t" +
                rs.getString("name") + "\t\t₹" +
                rs.getDouble("balance")
            );
        }

        rs.close();
        ps.close();
    }
}
