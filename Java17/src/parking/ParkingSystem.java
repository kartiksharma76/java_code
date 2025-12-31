package com.jdbc.parking;

import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ParkingSystem {
	// Database connection details
	private static final String DB_URL = "jdbc:mysql://localhost:3306/parking_db";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Kartik@2005";

	// Color Codes for Console Output
	private static final String RESET = "\u001B[0m";
	private static final String GREEN = "\u001B[32m";
	private static final String RED = "\u001B[31m";
	private static final String YELLOW = "\u001B[33m";
	private static final String BLUE = "\u001B[34m";
	private static final String PURPLE = "\u001B[35m";
	private static final String CYAN = "\u001B[36m";
	private static final String BOLD = "\u001B[1m";

	// Symbols
	private static final String CHECK = GREEN + "✓" + RESET;
	private static final String CROSS = RED + "✗" + RESET;
	private static final String WARNING = YELLOW + "⚠" + RESET;
	private static final String INFO = BLUE + "ℹ" + RESET;
	private static final String CAR = "🚗";
	private static final String BIKE = "🏍️";
	private static final String EV = "⚡";
	private static final String MONEY = "💰";
	private static final String CLOCK = "🕒";
	private static final String PARKING = "🅿️";
	private static final String USER = "👤";
	private static final String ADMIN = "👑";
	private static final String REPORT = "📊";
	private static final String SETTINGS = "⚙️";

	private static Connection connection = null;
	private static Scanner scanner = new Scanner(System.in);
	private static String currentUser = "";
	private static String currentRole = "";

	public static void main(String[] args) {
		clearScreen();
		printHeader();
		System.out.println(BOLD + BLUE + "\n" + PARKING + "  PARKING MANAGEMENT SYSTEM" + RESET);
		System.out.println("=".repeat(50));

		connectToDatabase();

		if (connection != null) {
			login();
			if (currentUser != null && !currentUser.isEmpty()) {
				showMainMenu();
			}
			closeDatabase();
		}

		System.out.println("\n" + CYAN + "Thank you for using Parking Management System!" + RESET);
		System.out.println("=".repeat(50));
		scanner.close();
	}

	private static void clearScreen() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				System.out.print("\033[H\033[2J");
			System.out.flush();
		} catch (Exception e) {
			// If clearing screen fails, just print some newlines
			System.out.println("\n".repeat(50));
		}
	}

	private static void printHeader() {
		System.out.println(CYAN + "╔══════════════════════════════════════════════════════╗");
		System.out.println("║" + BOLD + "           PARKING MANAGEMENT SYSTEM v2.0          " + RESET + CYAN + "║");
		System.out.println("║" + "       Efficient Vehicle Tracking & Billing System    " + "║");
		System.out.println("╚══════════════════════════════════════════════════════╝" + RESET);
	}

	// Database Connection Methods
	private static void connectToDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("\n" + CHECK + GREEN + " Database connected successfully!" + RESET);
		} catch (Exception e) {
			System.out.println("\n" + CROSS + RED + " Database connection failed: " + e.getMessage() + RESET);
		}
	}

	private static void closeDatabase() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("\n" + CHECK + GREEN + " Database connection closed." + RESET);
			}
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error closing connection: " + e.getMessage() + RESET);
		}
	}

	// Login System
	private static void login() {
		System.out.println("\n" + USER + BOLD + " LOGIN PORTAL" + RESET);
		System.out.println("-".repeat(40));

		int attempts = 3;
		while (attempts > 0) {
			System.out.print("\n" + CYAN + "▶ Username: " + RESET);
			String username = scanner.nextLine();

			System.out.print(CYAN + "▶ Password: " + RESET);
			String password = scanner.nextLine();

			try {
				String query = "SELECT * FROM users WHERE username = ? AND password = ?";
				PreparedStatement pstmt = connection.prepareStatement(query);
				pstmt.setString(1, username);
				pstmt.setString(2, password);

				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					currentUser = username;
					currentRole = rs.getString("role");

					String roleSymbol = currentRole.equals("ADMIN") ? ADMIN : USER;
					System.out.println("\n" + CHECK + GREEN + " Login successful! Welcome " + BOLD + username + RESET
							+ GREEN + " (" + roleSymbol + " " + currentRole + ")" + RESET);
					return;
				} else {
					attempts--;
					System.out.println(CROSS + RED + " Invalid credentials. Attempts left: " + attempts + RESET);
				}
			} catch (SQLException e) {
				System.out.println(CROSS + RED + " Login error: " + e.getMessage() + RESET);
			}
		}

		System.out.println("\n" + CROSS + RED + " Maximum login attempts exceeded. Exiting..." + RESET);
		System.exit(0);
	}

	// Main Menu
	private static void showMainMenu() {
		while (true) {
			clearScreen();
			printHeader();

			// User info header
			String roleBadge = currentRole.equals("ADMIN") ? RED + "[" + ADMIN + " ADMIN]" + RESET
					: BLUE + "[" + USER + " OPERATOR]" + RESET;

			System.out.println("\n" + BOLD + "Logged in as: " + PURPLE + currentUser + RESET + " " + roleBadge);
			System.out.println(YELLOW + "╔══════════════════════════════════════════════════════╗" + RESET);
			System.out.println(YELLOW + "║" + BOLD + "                    MAIN MENU                    " + RESET
					+ YELLOW + "║" + RESET);
			System.out.println(YELLOW + "╚══════════════════════════════════════════════════════╝" + RESET);

			// Common options for all users
			System.out.println("\n" + BOLD + CYAN + "PARKING OPERATIONS:" + RESET);
			System.out.println("  " + CAR + "  1. Vehicle Entry");
			System.out.println("  " + MONEY + "  2. Vehicle Exit & Payment");
			System.out.println("  " + PARKING + "  3. View Parking Zones");
			System.out.println("  " + CLOCK + "  4. View Active Parkings");
			System.out.println("  " + REPORT + "  5. View Parking History");
			System.out.println("  " + BIKE + "  6. Add Sample Data");
			System.out.println("  " + REPORT + "  7. View Reports");

			if (currentRole.equals("ADMIN")) {
				System.out.println("\n" + BOLD + PURPLE + "ADMINISTRATION:" + RESET);
				System.out.println("  " + ADMIN + "  8. User Management");
				System.out.println("  " + SETTINGS + "  9. Zone Management");
				System.out.println("  " + CROSS + "  10. Exit System");
				System.out.print("\n" + GREEN + "▶ Select option (1-10): " + RESET);
			} else {
				System.out.println("\n" + BOLD + PURPLE + "SYSTEM:" + RESET);
				System.out.println("  " + CROSS + "  8. Exit System");
				System.out.print("\n" + GREEN + "▶ Select option (1-8): " + RESET);
			}

			int choice = getIntInput();

			switch (choice) {
			case 1:
				vehicleEntry();
				pause();
				break;
			case 2:
				vehicleExit();
				pause();
				break;
			case 3:
				viewParkingZones();
				pause();
				break;
			case 4:
				viewActiveParkings();
				pause();
				break;
			case 5:
				viewParkingHistory();
				pause();
				break;
			case 6:
				addSampleData();
				pause();
				break;
			case 7:
				viewReports();
				pause();
				break;
			case 8:
				if (currentRole.equals("ADMIN")) {
					manageUsers();
				} else {
					System.out.println("\n" + INFO + BLUE + " Exiting system..." + RESET);
					return;
				}
				break;
			case 9:
				if (currentRole.equals("ADMIN")) {
					manageZones();
				} else {
					System.out.println(CROSS + RED + " Invalid choice!" + RESET);
					pause();
				}
				break;
			case 10:
				if (currentRole.equals("ADMIN")) {
					System.out.println("\n" + INFO + BLUE + " Exiting system..." + RESET);
					return;
				} else {
					System.out.println(CROSS + RED + " Invalid choice!" + RESET);
					pause();
				}
				break;
			default:
				System.out.println(CROSS + RED + " Invalid choice! Please try again." + RESET);
				pause();
			}
		}
	}

	private static void pause() {
		System.out.print("\n" + YELLOW + "Press Enter to continue..." + RESET);
		scanner.nextLine();
	}

	// 1. Vehicle Entry
	private static void vehicleEntry() {
		clearScreen();
		System.out.println(BOLD + "\n" + CAR + " VEHICLE ENTRY PORTAL" + RESET);
		System.out.println(GREEN + "═".repeat(40) + RESET);

		// Show available zones
		viewParkingZones();

		System.out.print("\n" + CYAN + "▶ Vehicle Number (e.g., MH12AB1234): " + RESET);
		String vehicleNumber = scanner.nextLine().toUpperCase();

		System.out.println("\n" + CYAN + "▶ Vehicle Type:" + RESET);
		System.out.println("  1. " + BIKE + " Two Wheeler");
		System.out.println("  2. " + CAR + " Four Wheeler");
		System.out.println("  3. " + EV + " Electric Vehicle");
		System.out.print("  Select (1-3): ");

		int typeChoice = getIntInput();
		String vehicleType = "";
		String vehicleSymbol = "";

		switch (typeChoice) {
		case 1:
			vehicleType = "TWO_WHEELER";
			vehicleSymbol = BIKE;
			break;
		case 2:
			vehicleType = "FOUR_WHEELER";
			vehicleSymbol = CAR;
			break;
		case 3:
			vehicleType = "EV";
			vehicleSymbol = EV;
			break;
		default:
			System.out.println(CROSS + RED + " Invalid choice!" + RESET);
			return;
		}

		System.out.print(CYAN + "▶ Zone Code (e.g., TW-A): " + RESET);
		String zoneCode = scanner.nextLine().toUpperCase();

		try {
			// Check zone availability
			String checkQuery = "SELECT * FROM parking_zones WHERE zone_code = ?";
			PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
			checkStmt.setString(1, zoneCode);
			ResultSet rs = checkStmt.executeQuery();

			if (rs.next()) {
				int zoneId = rs.getInt("zone_id");
				int occupied = rs.getInt("occupied_slots");
				int total = rs.getInt("total_slots");
				String zoneType = rs.getString("zone_type");

				// Check if zone type matches vehicle type
				if (!zoneType.equals(vehicleType)) {
					System.out.println(CROSS + RED + " This zone is for " + zoneType + " only!" + RESET);
					return;
				}

				if (occupied >= total) {
					System.out.println(CROSS + RED + " Zone is full! No available slots." + RESET);
					return;
				}

				// Insert parking record
				String insertQuery = "INSERT INTO parking_records (vehicle_number, vehicle_type, zone_id, entry_time, status) VALUES (?, ?, ?, NOW(), 'ACTIVE')";
				PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
				insertStmt.setString(1, vehicleNumber);
				insertStmt.setString(2, vehicleType);
				insertStmt.setInt(3, zoneId);

				int rows = insertStmt.executeUpdate();
				if (rows > 0) {
					// Update zone occupancy
					String updateQuery = "UPDATE parking_zones SET occupied_slots = occupied_slots + 1 WHERE zone_id = ?";
					PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
					updateStmt.setInt(1, zoneId);
					updateStmt.executeUpdate();

					// Generate ticket
					System.out.println("\n" + CHECK + GREEN + " Vehicle entry recorded successfully!" + RESET);
					System.out.println(
							"\n" + YELLOW + "╔══════════════════════════════════════════════════════╗" + RESET);
					System.out.println(YELLOW + "║" + BOLD + "                  PARKING TICKET                  "
							+ RESET + YELLOW + "║" + RESET);
					System.out.println(YELLOW + "╠══════════════════════════════════════════════════════╣" + RESET);
					System.out.println(
							YELLOW + "║" + RESET + "  " + vehicleSymbol + " Vehicle: " + BOLD + vehicleNumber + RESET);
					System.out.println(YELLOW + "║" + RESET + "  " + PARKING + " Zone: " + BOLD + zoneCode + RESET);
					System.out.println(YELLOW + "║" + RESET + "  " + CLOCK + " Entry: "
							+ new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").format(new Date()));
					System.out.println(YELLOW + "║" + RESET + "  " + INFO + " Status: " + GREEN + "ACTIVE" + RESET);
					System.out.println(YELLOW + "╚══════════════════════════════════════════════════════╝" + RESET);
					System.out.println("\n" + WARNING + YELLOW + " Keep this ticket safe for exit!" + RESET);
				}
			} else {
				System.out.println(CROSS + RED + " Invalid zone code!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	// 2. Vehicle Exit
	private static void vehicleExit() {
		clearScreen();
		System.out.println(BOLD + "\n" + MONEY + " VEHICLE EXIT & PAYMENT" + RESET);
		System.out.println(GREEN + "═".repeat(40) + RESET);

		// Show active parkings
		viewActiveParkings();

		if (!hasActiveParkings()) {
			System.out.println("\n" + INFO + BLUE + " No active parkings found." + RESET);
			return;
		}

		System.out.print("\n" + CYAN + "▶ Record ID for exit: " + RESET);
		int recordId = getIntInput();

		System.out.println("\n" + CYAN + "▶ Payment Method:" + RESET);
		System.out.println("  1. 💵 Cash");
		System.out.println("  2. 💳 Card");
		System.out.println("  3. 📱 UPI");
		System.out.print("  Select (1-3): ");

		int payChoice = getIntInput();
		String paymentMethod = "";
		String paymentSymbol = "";

		switch (payChoice) {
		case 1:
			paymentMethod = "CASH";
			paymentSymbol = "💵";
			break;
		case 2:
			paymentMethod = "CARD";
			paymentSymbol = "💳";
			break;
		case 3:
			paymentMethod = "UPI";
			paymentSymbol = "📱";
			break;
		default:
			System.out.println(CROSS + RED + " Invalid choice!" + RESET);
			return;
		}

		try {
			// Get parking record details
			String selectQuery = "SELECT pr.*, pz.hourly_rate, pz.zone_code, pz.zone_id " + "FROM parking_records pr "
					+ "JOIN parking_zones pz ON pr.zone_id = pz.zone_id "
					+ "WHERE pr.record_id = ? AND pr.status = 'ACTIVE'";

			PreparedStatement selectStmt = connection.prepareStatement(selectQuery);
			selectStmt.setInt(1, recordId);
			ResultSet rs = selectStmt.executeQuery();

			if (rs.next()) {
				String vehicleNumber = rs.getString("vehicle_number");
				String vehicleType = rs.getString("vehicle_type");
				String zoneCode = rs.getString("zone_code");
				int zoneId = rs.getInt("zone_id");
				double hourlyRate = rs.getDouble("hourly_rate");
				Timestamp entryTime = rs.getTimestamp("entry_time");

				String vehicleSymbol = getVehicleSymbol(vehicleType);

				// Calculate duration and amount
				long durationMillis = System.currentTimeMillis() - entryTime.getTime();
				int hours = (int) Math.ceil(durationMillis / (1000.0 * 60 * 60));
				int minutes = (int) ((durationMillis % (1000 * 60 * 60)) / (1000 * 60));

				// First 15 minutes free
				double amount = 0;
				if (minutes > 15) {
					amount = hours * hourlyRate;
				}

				// Update parking record
				String updateQuery = "UPDATE parking_records SET " + "exit_time = NOW(), " + "duration_minutes = ?, "
						+ "total_amount = ?, " + "payment_status = 'PAID', " + "payment_method = ?, "
						+ "status = 'COMPLETED' " + "WHERE record_id = ?";

				PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
				updateStmt.setInt(1, (hours * 60) + minutes);
				updateStmt.setDouble(2, amount);
				updateStmt.setString(3, paymentMethod);
				updateStmt.setInt(4, recordId);

				int rows = updateStmt.executeUpdate();
				if (rows > 0) {
					// Update zone occupancy
					String zoneQuery = "UPDATE parking_zones SET occupied_slots = occupied_slots - 1 WHERE zone_id = ?";
					PreparedStatement zoneStmt = connection.prepareStatement(zoneQuery);
					zoneStmt.setInt(1, zoneId);
					zoneStmt.executeUpdate();

					// Generate bill
					System.out.println("\n" + CHECK + GREEN + " Vehicle exit processed successfully!" + RESET);
					System.out.println(
							"\n" + YELLOW + "╔══════════════════════════════════════════════════════╗" + RESET);
					System.out.println(YELLOW + "║" + BOLD + "                    PARKING BILL                  "
							+ RESET + YELLOW + "║" + RESET);
					System.out.println(YELLOW + "╠══════════════════════════════════════════════════════╣" + RESET);
					System.out.println(
							YELLOW + "║" + RESET + "  " + vehicleSymbol + " Vehicle: " + BOLD + vehicleNumber + RESET);
					System.out.println(YELLOW + "║" + RESET + "  " + PARKING + " Zone: " + BOLD + zoneCode + RESET);
					System.out.println(YELLOW + "║" + RESET + "  " + CLOCK + " Entry: "
							+ new SimpleDateFormat("dd-MMM HH:mm").format(entryTime));
					System.out.println(YELLOW + "║" + RESET + "  " + CLOCK + " Exit:  "
							+ new SimpleDateFormat("dd-MMM HH:mm").format(new Date()));
					System.out.println(
							YELLOW + "║" + RESET + "  " + CLOCK + " Duration: " + hours + "h " + minutes + "m");
					System.out.println(YELLOW + "╠══════════════════════════════════════════════════════╣" + RESET);
					System.out.println(YELLOW + "║" + RESET + "  " + MONEY + " Rate: ₹" + hourlyRate + "/hour");
					System.out.println(
							YELLOW + "║" + RESET + "  " + MONEY + " Amount: " + BOLD + GREEN + "₹" + amount + RESET);
					System.out.println(YELLOW + "║" + RESET + "  " + paymentSymbol + " Payment: " + paymentMethod);
					System.out.println(YELLOW + "╠══════════════════════════════════════════════════════╣" + RESET);
					System.out.println(YELLOW + "║" + GREEN + "      Thank you for visiting! Come again!      " + RESET
							+ YELLOW + "║" + RESET);
					System.out.println(YELLOW + "╚══════════════════════════════════════════════════════╝" + RESET);
				}
			} else {
				System.out.println(CROSS + RED + " Invalid record ID or vehicle already checked out." + RESET);
			}
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	private static String getVehicleSymbol(String vehicleType) {
		switch (vehicleType) {
		case "TWO_WHEELER":
			return BIKE;
		case "FOUR_WHEELER":
			return CAR;
		case "EV":
			return EV;
		default:
			return CAR;
		}
	}

	// 3. View Parking Zones - FIXED VERSION
	private static void viewParkingZones() {
		try {
			String query = "SELECT * FROM parking_zones ORDER BY zone_code";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\n" + BOLD + PARKING + " PARKING ZONES AVAILABILITY" + RESET);
			System.out
					.println(YELLOW + "┌──────┬──────────────────────┬────────────┬────────────┬────────────┐" + RESET);
			System.out.println(YELLOW + "│" + RESET + " Code " + YELLOW + "│" + RESET + " Name               " + YELLOW
					+ "│" + RESET + " Type      " + YELLOW + "│" + RESET + " Available " + YELLOW + "│" + RESET
					+ " Rate/Hour " + YELLOW + "│" + RESET);
			System.out
					.println(YELLOW + "├──────┼──────────────────────┼────────────┼────────────┼────────────┤" + RESET);

			while (rs.next()) {
				int total = rs.getInt("total_slots");
				int occupied = rs.getInt("occupied_slots");
				int available = total - occupied;
				String availableText = available + "/" + total;

				String statusColor = (available == 0) ? RED : (available < 5 ? YELLOW : GREEN);
				String typeSymbol = getVehicleSymbol(rs.getString("zone_type"));

				System.out.printf(
						YELLOW + "│" + RESET + " %-4s " + YELLOW + "│" + RESET + " %-20s " + YELLOW + "│" + RESET
								+ " %s%-9s " + YELLOW + "│" + statusColor + " %-10s " + YELLOW + "│" + RESET + " %-9s "
								+ YELLOW + "│\n" + RESET,
						rs.getString("zone_code"), rs.getString("zone_name"), typeSymbol,
						rs.getString("zone_type").replace("_", " "), availableText, "₹" + rs.getDouble("hourly_rate"));
			}
			System.out
					.println(YELLOW + "└──────┴──────────────────────┴────────────┴────────────┴────────────┘" + RESET);
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	// 4. View Active Parkings
	private static void viewActiveParkings() {
		try {
			String query = "SELECT pr.record_id, pr.vehicle_number, pr.vehicle_type, " + "pz.zone_code, pr.entry_time "
					+ "FROM parking_records pr " + "JOIN parking_zones pz ON pr.zone_id = pz.zone_id "
					+ "WHERE pr.status = 'ACTIVE' " + "ORDER BY pr.entry_time";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\n" + BOLD + CLOCK + " ACTIVE PARKINGS" + RESET);
			System.out.println(YELLOW + "┌──────┬──────────────┬────────────┬────────┬──────────────────┐" + RESET);
			System.out.println(YELLOW + "│" + RESET + " ID   " + YELLOW + "│" + RESET + " Vehicle     " + YELLOW + "│"
					+ RESET + " Type      " + YELLOW + "│" + RESET + " Zone  " + YELLOW + "│" + RESET
					+ " Entry Time       " + YELLOW + "│" + RESET);
			System.out.println(YELLOW + "├──────┼──────────────┼────────────┼────────┼──────────────────┤" + RESET);

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM HH:mm");
			while (rs.next()) {
				String typeSymbol = getVehicleSymbol(rs.getString("vehicle_type"));
				System.out.printf(
						YELLOW + "│" + RESET + " %-4d " + YELLOW + "│" + RESET + " %-12s " + YELLOW + "│" + RESET
								+ " %s%-9s " + YELLOW + "│" + RESET + " %-6s " + YELLOW + "│" + RESET + " %-16s "
								+ YELLOW + "│\n",
						rs.getInt("record_id"), rs.getString("vehicle_number"), typeSymbol,
						rs.getString("vehicle_type").replace("_", " "), rs.getString("zone_code"),
						sdf.format(rs.getTimestamp("entry_time")));
			}
			System.out.println(YELLOW + "└──────┴──────────────┴────────────┴────────┴──────────────────┘" + RESET);
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	private static boolean hasActiveParkings() {
		try {
			String query = "SELECT COUNT(*) as count FROM parking_records WHERE status = 'ACTIVE'";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs.next() && rs.getInt("count") > 0;
		} catch (SQLException e) {
			return false;
		}
	}

	// 5. View Parking History
	private static void viewParkingHistory() {
		try {
			String query = "SELECT pr.vehicle_number, pr.vehicle_type, pz.zone_code, "
					+ "pr.entry_time, pr.exit_time, pr.total_amount, pr.payment_method " + "FROM parking_records pr "
					+ "JOIN parking_zones pz ON pr.zone_id = pz.zone_id " + "WHERE pr.status = 'COMPLETED' "
					+ "ORDER BY pr.exit_time DESC " + "LIMIT 15";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("\n" + BOLD + REPORT + " PARKING HISTORY (Last 15)" + RESET);
			System.out.println(YELLOW
					+ "┌──────────────┬────────────┬────────┬────────────┬────────────┬──────────┬──────────┐" + RESET);
			System.out.println(YELLOW + "│" + RESET + " Vehicle     " + YELLOW + "│" + RESET + " Type      " + YELLOW
					+ "│" + RESET + " Zone  " + YELLOW + "│" + RESET + " Entry     " + YELLOW + "│" + RESET
					+ " Exit      " + YELLOW + "│" + RESET + " Amount  " + YELLOW + "│" + RESET + " Payment " + YELLOW
					+ "│" + RESET);
			System.out.println(YELLOW
					+ "├──────────────┼────────────┼────────┼────────────┼────────────┼──────────┼──────────┤" + RESET);

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM HH:mm");
			double totalRevenue = 0;

			while (rs.next()) {
				double amount = rs.getDouble("total_amount");
				totalRevenue += amount;
				String typeSymbol = getVehicleSymbol(rs.getString("vehicle_type"));

				System.out.printf(
						YELLOW + "│" + RESET + " %-12s " + YELLOW + "│" + RESET + " %s%-9s " + YELLOW + "│" + RESET
								+ " %-6s " + YELLOW + "│" + RESET + " %-10s " + YELLOW + "│" + RESET + " %-10s "
								+ YELLOW + "│" + RESET + " %-8s " + YELLOW + "│" + RESET + " %-7s " + YELLOW + "│\n",
						rs.getString("vehicle_number"), typeSymbol, rs.getString("vehicle_type").replace("_", " "),
						rs.getString("zone_code"), sdf.format(rs.getTimestamp("entry_time")),
						sdf.format(rs.getTimestamp("exit_time")), "₹" + String.format("%.2f", amount),
						rs.getString("payment_method"));
			}
			System.out.println(YELLOW
					+ "└──────────────┴────────────┴────────┴────────────┴────────────┴──────────┴──────────┘" + RESET);
			System.out.println("\n" + MONEY + " Total Revenue from last 15 transactions: " + BOLD + GREEN + "₹"
					+ String.format("%.2f", totalRevenue) + RESET);
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	// 6. Add Sample Data
	private static void addSampleData() {
		clearScreen();
		System.out.println(BOLD + "\n" + SETTINGS + " ADD SAMPLE DATA" + RESET);
		System.out.println(GREEN + "═".repeat(40) + RESET);

		System.out.println("\n" + CYAN + "What would you like to add?" + RESET);
		System.out.println("  1. " + CAR + " Add Sample Vehicles (Entry)");
		System.out.println("  2. " + MONEY + " Add Sample Completed Parkings");
		System.out.println("  3. " + USER + " Add Multiple Users");
		System.out.println("  4. " + CROSS + " Back to Main Menu");
		System.out.print("\n" + GREEN + "▶ Select option (1-4): " + RESET);

		int choice = getIntInput();

		try {
			switch (choice) {
			case 1:
				addSampleVehicles();
				break;
			case 2:
				addSampleCompletedParkings();
				break;
			case 3:
				addMultipleUsers();
				break;
			case 4:
				return;
			default:
				System.out.println(CROSS + RED + " Invalid choice!" + RESET);
			}
		} catch (Exception e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	// Add Sample Vehicles Method
	private static void addSampleVehicles() {
		System.out.print("\n" + CYAN + "▶ How many sample vehicles to add? (1-10): " + RESET);
		int count = getIntInput();

		if (count < 1 || count > 10) {
			System.out.println(CROSS + RED + " Please enter between 1 and 10." + RESET);
			return;
		}

		String[] vehicleNumbers = { "MH12AB1234", "DL8CA5678", "KA01CD9876", "GJ05EF4321", "TN09GH8765", "RJ14IJ2345",
				"MP07KL6543", "UP16MN7890", "WB19OP1234", "HR03QR5678" };
		String[] vehicleTypes = { "TWO_WHEELER", "FOUR_WHEELER", "EV" };

		Random random = new Random();
		int successCount = 0;

		try {
			for (int i = 0; i < count; i++) {
				String vehicleNumber = vehicleNumbers[random.nextInt(vehicleNumbers.length)];
				String vehicleType = vehicleTypes[random.nextInt(vehicleTypes.length)];
				String zoneCode = getRandomZoneForType(vehicleType, random);

				// Check zone availability
				String checkQuery = "SELECT * FROM parking_zones WHERE zone_code = ?";
				PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
				checkStmt.setString(1, zoneCode);
				ResultSet rs = checkStmt.executeQuery();

				if (rs.next()) {
					int zoneId = rs.getInt("zone_id");
					int occupied = rs.getInt("occupied_slots");
					int total = rs.getInt("total_slots");

					if (occupied < total) {
						// Insert parking record
						String insertQuery = "INSERT INTO parking_records (vehicle_number, vehicle_type, zone_id, entry_time, status) VALUES (?, ?, ?, NOW(), 'ACTIVE')";
						PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
						insertStmt.setString(1, vehicleNumber);
						insertStmt.setString(2, vehicleType);
						insertStmt.setInt(3, zoneId);

						int rows = insertStmt.executeUpdate();
						if (rows > 0) {
							// Update zone occupancy
							String updateQuery = "UPDATE parking_zones SET occupied_slots = occupied_slots + 1 WHERE zone_id = ?";
							PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
							updateStmt.setInt(1, zoneId);
							updateStmt.executeUpdate();

							successCount++;
							System.out.println(CHECK + GREEN + " Added: " + getVehicleSymbol(vehicleType) + " "
									+ vehicleNumber + " in " + PARKING + " " + zoneCode + RESET);
						}
					} else {
						System.out.println(WARNING + YELLOW + " Zone " + zoneCode + " is full. Skipping..." + RESET);
					}
				}
			}

			System.out.println(
					"\n" + CHECK + GREEN + " Successfully added " + successCount + " sample vehicles!" + RESET);
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	private static String getRandomZoneForType(String vehicleType, Random random) {
		switch (vehicleType) {
		case "TWO_WHEELER":
			return random.nextBoolean() ? "TW-A" : "TW-B";
		case "FOUR_WHEELER":
			return random.nextBoolean() ? "FW-A" : "FW-B";
		case "EV":
			return "EV-C";
		default:
			return "TW-A";
		}
	}

	// Add Sample Completed Parkings Method
	private static void addSampleCompletedParkings() {
		System.out.print("\n" + CYAN + "▶ How many completed parkings to add? (1-20): " + RESET);
		int count = getIntInput();

		if (count < 1 || count > 20) {
			System.out.println(CROSS + RED + " Please enter between 1 and 20." + RESET);
			return;
		}

		String[] vehicleNumbers = { "MH12XY1234", "DL8CZ5678", "KA01XD9876", "GJ05YF4321", "TN09ZH8765" };
		String[] vehicleTypes = { "TWO_WHEELER", "FOUR_WHEELER", "EV" };
		String[] paymentMethods = { "CASH", "CARD", "UPI" };

		Random random = new Random();
		int successCount = 0;

		try {
			for (int i = 0; i < count; i++) {
				String vehicleNumber = vehicleNumbers[random.nextInt(vehicleNumbers.length)];
				String vehicleType = vehicleTypes[random.nextInt(vehicleTypes.length)];
				String paymentMethod = paymentMethods[random.nextInt(paymentMethods.length)];
				String zoneCode = getRandomZoneForType(vehicleType, random);

				// Get zone details
				String zoneQuery = "SELECT * FROM parking_zones WHERE zone_code = ?";
				PreparedStatement zoneStmt = connection.prepareStatement(zoneQuery);
				zoneStmt.setString(1, zoneCode);
				ResultSet zoneRs = zoneStmt.executeQuery();

				if (zoneRs.next()) {
					int zoneId = zoneRs.getInt("zone_id");
					double hourlyRate = zoneRs.getDouble("hourly_rate");

					// Generate random duration (1 to 8 hours)
					int hours = random.nextInt(8) + 1;
					int minutes = random.nextInt(60);

					// Calculate amount
					double amount = hours * hourlyRate;
					if (minutes <= 15) {
						amount = hours * hourlyRate;
					} else {
						amount = (hours + 1) * hourlyRate;
					}

					// Generate random dates (last 7 days)
					Calendar cal = Calendar.getInstance();
					cal.add(Calendar.DAY_OF_YEAR, -random.nextInt(7));
					cal.add(Calendar.HOUR, -random.nextInt(24));
					Date entryDate = cal.getTime();

					cal.add(Calendar.HOUR, hours);
					cal.add(Calendar.MINUTE, minutes);
					Date exitDate = cal.getTime();

					// Insert completed parking record
					String insertQuery = "INSERT INTO parking_records (vehicle_number, vehicle_type, zone_id, "
							+ "entry_time, exit_time, duration_minutes, total_amount, payment_status, payment_method, status) "
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, 'PAID', ?, 'COMPLETED')";

					PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
					insertStmt.setString(1, vehicleNumber);
					insertStmt.setString(2, vehicleType);
					insertStmt.setInt(3, zoneId);
					insertStmt.setTimestamp(4, new Timestamp(entryDate.getTime()));
					insertStmt.setTimestamp(5, new Timestamp(exitDate.getTime()));
					insertStmt.setInt(6, (hours * 60) + minutes);
					insertStmt.setDouble(7, amount);
					insertStmt.setString(8, paymentMethod);

					int rows = insertStmt.executeUpdate();
					if (rows > 0) {
						successCount++;
						System.out.println(CHECK + GREEN + " Added: " + getVehicleSymbol(vehicleType) + " "
								+ vehicleNumber + " - " + MONEY + " ₹" + amount + RESET);
					}
				}
			}

			System.out.println("\n" + CHECK + GREEN + " Successfully added " + successCount
					+ " completed parking records!" + RESET);
			System.out.println(INFO + BLUE + " Note: These are historical records for testing reports." + RESET);
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	// Add Multiple Users Method
	private static void addMultipleUsers() {
		if (!currentRole.equals("ADMIN")) {
			System.out.println(CROSS + RED + " Only ADMIN can add users!" + RESET);
			return;
		}

		System.out.println("\n" + ADMIN + " ADDING SAMPLE USERS...");

		String[][] users = { { "admin2", "admin456", "ADMIN" }, { "operator3", "op789", "OPERATOR" },
				{ "operator4", "op101", "OPERATOR" }, { "manager", "mgr123", "ADMIN" },
				{ "staff1", "staff123", "OPERATOR" } };

		int successCount = 0;

		try {
			for (String[] user : users) {
				String username = user[0];
				String password = user[1];
				String role = user[2];
				String roleSymbol = role.equals("ADMIN") ? ADMIN : USER;

				// Check if user already exists
				String checkQuery = "SELECT * FROM users WHERE username = ?";
				PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
				checkStmt.setString(1, username);
				ResultSet rs = checkStmt.executeQuery();

				if (!rs.next()) {
					// User doesn't exist, add them
					String insertQuery = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
					PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
					insertStmt.setString(1, username);
					insertStmt.setString(2, password);
					insertStmt.setString(3, role);

					int rows = insertStmt.executeUpdate();
					if (rows > 0) {
						successCount++;
						System.out.println(CHECK + GREEN + " Added user: " + roleSymbol + " " + username + " (" + role
								+ ")" + RESET);
					}
				} else {
					System.out.println(WARNING + YELLOW + " User already exists: " + username + RESET);
				}
			}

			System.out.println("\n" + CHECK + GREEN + " Successfully added " + successCount + " new users!" + RESET);
			System.out.println("\n" + CYAN + "=== AVAILABLE LOGINS ===" + RESET);
			System.out.println("  " + ADMIN + " ADMIN: admin2 / admin456");
			System.out.println("  " + USER + " OPERATORS: operator3 / op789, operator4 / op101");
			System.out.println("  " + ADMIN + " MANAGER: manager / mgr123");
			System.out.println("  " + USER + " STAFF: staff1 / staff123");
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	// 7. View Reports
	private static void viewReports() {
		clearScreen();
		System.out.println(BOLD + "\n" + REPORT + " REPORTS DASHBOARD" + RESET);
		System.out.println(GREEN + "═".repeat(40) + RESET);

		System.out.println("\n" + CYAN + "Select Report Type:" + RESET);
		System.out.println("  1. " + MONEY + " Daily Revenue Report");
		System.out.println("  2. " + CAR + " Vehicle Type Statistics");
		System.out.println("  3. " + PARKING + " Zone Occupancy Report");
		System.out.println("  4. " + CLOCK + " Monthly Summary");
		System.out.print("\n" + GREEN + "▶ Select option (1-4): " + RESET);

		int choice = getIntInput();

		try {
			switch (choice) {
			case 1:
				showDailyRevenue();
				break;
			case 2:
				showVehicleStatistics();
				break;
			case 3:
				showZoneOccupancy();
				break;
			case 4:
				showMonthlySummary();
				break;
			default:
				System.out.println(CROSS + RED + " Invalid choice!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
	}

	private static void showDailyRevenue() throws SQLException {
		String query = "SELECT DATE(exit_time) as date, COUNT(*) as transactions, " + "SUM(total_amount) as revenue "
				+ "FROM parking_records " + "WHERE payment_status = 'PAID' " + "GROUP BY DATE(exit_time) "
				+ "ORDER BY date DESC " + "LIMIT 7";

		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("\n" + BOLD + MONEY + " DAILY REVENUE (Last 7 Days)" + RESET);
		System.out.println(YELLOW + "┌──────────────┬──────────────┬──────────────┐" + RESET);
		System.out.println(YELLOW + "│" + RESET + " Date         " + YELLOW + "│" + RESET + " Transactions " + YELLOW
				+ "│" + RESET + " Revenue     " + YELLOW + "│" + RESET);
		System.out.println(YELLOW + "├──────────────┼──────────────┼──────────────┤" + RESET);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		double totalRev = 0;
		int totalTrans = 0;

		while (rs.next()) {
			int trans = rs.getInt("transactions");
			double rev = rs.getDouble("revenue");

			System.out.printf(
					YELLOW + "│" + RESET + " %-12s " + YELLOW + "│" + RESET + " %-12d " + YELLOW + "│" + RESET
							+ " %-12s " + YELLOW + "│\n",
					sdf.format(rs.getDate("date")), trans, "₹" + String.format("%.2f", rev));

			totalTrans += trans;
			totalRev += rev;
		}
		System.out.println(YELLOW + "├──────────────┼──────────────┼──────────────┤" + RESET);
		System.out.printf(
				YELLOW + "│" + RESET + " %-12s " + YELLOW + "│" + RESET + " %-12d " + YELLOW + "│" + RESET + " %-12s "
						+ YELLOW + "│\n",
				"TOTAL", totalTrans, BOLD + GREEN + "₹" + String.format("%.2f", totalRev) + RESET);
		System.out.println(YELLOW + "└──────────────┴──────────────┴──────────────┘" + RESET);
	}

	// 8. Manage Users (Admin Only) - ENHANCED VERSION
	private static void manageUsers() {
		if (!currentRole.equals("ADMIN")) {
			System.out.println(CROSS + RED + " Access denied! Admin privileges required." + RESET);
			pause();
			return;
		}

		while (true) {
			clearScreen();
			System.out.println(BOLD + "\n" + ADMIN + " USER MANAGEMENT" + RESET);
			System.out.println(GREEN + "═".repeat(40) + RESET);

			System.out.println("\n" + CYAN + "Select Action:" + RESET);
			System.out.println("  1. " + USER + " View All Users");
			System.out.println("  2. " + CHECK + " Add New User");
			System.out.println("  3. " + WARNING + " Update User Password");
			System.out.println("  4. " + CROSS + " Delete User");
			System.out.println("  5. " + CROSS + " Back to Main Menu");
			System.out.print("\n" + GREEN + "▶ Select option (1-5): " + RESET);

			int choice = getIntInput();

			try {
				switch (choice) {
				case 1:
					viewAllUsers();
					pause();
					break;
				case 2:
					addNewUser();
					pause();
					break;
				case 3:
					updateUserPassword();
					pause();
					break;
				case 4:
					deleteUser();
					pause();
					break;
				case 5:
					return;
				default:
					System.out.println(CROSS + RED + " Invalid choice!" + RESET);
					pause();
				}
			} catch (SQLException e) {
				System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
				pause();
			}
		}
	}

	private static void viewAllUsers() throws SQLException {
		String query = "SELECT * FROM users ORDER BY user_id";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("\n" + BOLD + USER + " ALL SYSTEM USERS" + RESET);
		System.out.println(YELLOW + "┌──────┬──────────────────┬────────────┬────────────────────┐" + RESET);
		System.out.println(YELLOW + "│" + RESET + " ID   " + YELLOW + "│" + RESET + " Username        " + YELLOW + "│"
				+ RESET + " Role      " + YELLOW + "│" + RESET + " Status            " + YELLOW + "│" + RESET);
		System.out.println(YELLOW + "├──────┼──────────────────┼────────────┼────────────────────┤" + RESET);

		while (rs.next()) {
			String role = rs.getString("role");
			String roleSymbol = role.equals("ADMIN") ? ADMIN : USER;
			String statusColor = rs.getString("username").equals(currentUser) ? GREEN : CYAN;
			String statusText = rs.getString("username").equals(currentUser) ? "CURRENT USER" : "ACTIVE";

			System.out.printf(
					YELLOW + "│" + RESET + " %-4d " + YELLOW + "│" + RESET + " %-16s " + YELLOW + "│" + RESET
							+ " %s%-9s " + YELLOW + "│" + statusColor + " %-18s " + YELLOW + "│\n",
					rs.getInt("user_id"), rs.getString("username"), roleSymbol, role, statusText + RESET);
		}
		System.out.println(YELLOW + " " + RESET);
	}

	private static void addNewUser() throws SQLException {
		System.out.println("\n" + BOLD + CHECK + " ADD NEW USER" + RESET);
		System.out.println("-".repeat(30));

		System.out.print("\n" + CYAN + "▶ Username: " + RESET);
		String username = scanner.nextLine();

		System.out.print(CYAN + "▶ Password: " + RESET);
		String password = scanner.nextLine();

		System.out.print(CYAN + "▶ Role (ADMIN/OPERATOR): " + RESET);
		String role = scanner.nextLine().toUpperCase();

		if (!role.equals("ADMIN") && !role.equals("OPERATOR")) {
			System.out.println(CROSS + RED + " Invalid role! Use ADMIN or OPERATOR." + RESET);
			return;
		}

		// Check if user already exists
		String checkQuery = "SELECT * FROM users WHERE username = ?";
		PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
		checkStmt.setString(1, username);
		ResultSet rs = checkStmt.executeQuery();

		if (rs.next()) {
			System.out.println(CROSS + RED + " User '" + username + "' already exists!" + RESET);
			return;
		}

		String insertQuery = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
		PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
		insertStmt.setString(1, username);
		insertStmt.setString(2, password);
		insertStmt.setString(3, role);

		int rows = insertStmt.executeUpdate();
		if (rows > 0) {
			String roleSymbol = role.equals("ADMIN") ? ADMIN : USER;
			System.out.println(
					"\n" + CHECK + GREEN + " User " + roleSymbol + " " + username + " added successfully!" + RESET);
			System.out.println(INFO + BLUE + " New user can now login with these credentials." + RESET);
		}
	}

	private static void updateUserPassword() throws SQLException {
		System.out.println("\n" + BOLD + WARNING + " UPDATE USER PASSWORD" + RESET);
		System.out.println("-".repeat(30));

		// Show all users first
		viewAllUsers();

		System.out.print("\n" + CYAN + "▶ Enter username to update: " + RESET);
		String username = scanner.nextLine();

		// Check if user exists
		String checkQuery = "SELECT * FROM users WHERE username = ?";
		PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
		checkStmt.setString(1, username);
		ResultSet rs = checkStmt.executeQuery();

		if (!rs.next()) {
			System.out.println(CROSS + RED + " User '" + username + "' does not exist!" + RESET);
			return;
		}

		// Cannot update current user's password from here
		if (username.equals(currentUser)) {
			System.out
					.println(WARNING + YELLOW + " To change your own password, please logout and login again." + RESET);
			return;
		}

		System.out.print(CYAN + "▶ New password for " + username + ": " + RESET);
		String newPassword = scanner.nextLine();

		System.out.print(CYAN + "▶ Confirm new password: " + RESET);
		String confirmPassword = scanner.nextLine();

		if (!newPassword.equals(confirmPassword)) {
			System.out.println(CROSS + RED + " Passwords do not match!" + RESET);
			return;
		}

		String updateQuery = "UPDATE users SET password = ? WHERE username = ?";
		PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
		updateStmt.setString(1, newPassword);
		updateStmt.setString(2, username);

		int rows = updateStmt.executeUpdate();
		if (rows > 0) {
			System.out.println("\n" + CHECK + GREEN + " Password updated successfully for user: " + username + RESET);
		}
	}

	private static void deleteUser() throws SQLException {
		System.out.println("\n" + BOLD + CROSS + " DELETE USER" + RESET);
		System.out.println("-".repeat(30));

		// Show all users first
		viewAllUsers();

		System.out.print("\n" + CYAN + "▶ Enter username to delete: " + RESET);
		String username = scanner.nextLine();

		// Check if user exists
		String checkQuery = "SELECT * FROM users WHERE username = ?";
		PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
		checkStmt.setString(1, username);
		ResultSet rs = checkStmt.executeQuery();

		if (!rs.next()) {
			System.out.println(CROSS + RED + " User '" + username + "' does not exist!" + RESET);
			return;
		}

		// Cannot delete current user
		if (username.equals(currentUser)) {
			System.out.println(CROSS + RED + " You cannot delete your own account while logged in!" + RESET);
			return;
		}

		// Cannot delete the last admin
		String role = rs.getString("role");
		if (role.equals("ADMIN")) {
			String adminCountQuery = "SELECT COUNT(*) as admin_count FROM users WHERE role = 'ADMIN'";
			Statement adminStmt = connection.createStatement();
			ResultSet adminRs = adminStmt.executeQuery(adminCountQuery);
			adminRs.next();
			int adminCount = adminRs.getInt("admin_count");

			if (adminCount <= 1) {
				System.out.println(CROSS + RED + " Cannot delete the last admin account!" + RESET);
				return;
			}
		}

		System.out.print(YELLOW + "⚠ Are you sure you want to delete user '" + username + "'? (yes/no): " + RESET);
		String confirmation = scanner.nextLine().toLowerCase();

		if (confirmation.equals("yes") || confirmation.equals("y")) {
			String deleteQuery = "DELETE FROM users WHERE username = ?";
			PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery);
			deleteStmt.setString(1, username);

			int rows = deleteStmt.executeUpdate();
			if (rows > 0) {
				System.out.println("\n" + CHECK + GREEN + " User '" + username + "' deleted successfully!" + RESET);
			}
		} else {
			System.out.println(INFO + BLUE + " Deletion cancelled." + RESET);
		}
	}

	// 9. Manage Zones (Admin Only)
	private static void manageZones() {
		if (!currentRole.equals("ADMIN")) {
			System.out.println(CROSS + RED + " Access denied! Admin privileges required." + RESET);
			pause();
			return;
		}

		clearScreen();
		System.out.println(BOLD + "\n" + SETTINGS + " ZONE MANAGEMENT" + RESET);
		System.out.println(GREEN + "═".repeat(40) + RESET);

		System.out.println("\n" + CYAN + "Select Action:" + RESET);
		System.out.println("  1. " + PARKING + " View All Zones");
		System.out.println("  2. " + CHECK + " Add New Zone");
		System.out.println("  3. " + CROSS + " Back to Main Menu");
		System.out.print("\n" + GREEN + "▶ Select option (1-3): " + RESET);

		int choice = getIntInput();

		try {
			switch (choice) {
			case 1:
				viewParkingZones();
				break;
			case 2:
				addNewZone();
				break;
			case 3:
				return;
			default:
				System.out.println(CROSS + RED + " Invalid choice!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(CROSS + RED + " Error: " + e.getMessage() + RESET);
		}
		pause();
	}

	private static void addNewZone() throws SQLException {
		System.out.println("\n" + BOLD + CHECK + " ADD NEW PARKING ZONE" + RESET);
		System.out.println("-".repeat(30));

		System.out.print("\n" + CYAN + "▶ Zone Name: " + RESET);
		String zoneName = scanner.nextLine();

		System.out.print(CYAN + "▶ Zone Code (e.g., TW-C): " + RESET);
		String zoneCode = scanner.nextLine().toUpperCase();

		// Check if zone code already exists
		String checkQuery = "SELECT * FROM parking_zones WHERE zone_code = ?";
		PreparedStatement checkStmt = connection.prepareStatement(checkQuery);
		checkStmt.setString(1, zoneCode);
		ResultSet rs = checkStmt.executeQuery();

		if (rs.next()) {
			System.out.println(CROSS + RED + " Zone code '" + zoneCode + "' already exists!" + RESET);
			return;
		}

		System.out.println("\n" + CYAN + "▶ Zone Type:" + RESET);
		System.out.println("  1. " + BIKE + " Two Wheeler");
		System.out.println("  2. " + CAR + " Four Wheeler");
		System.out.println("  3. " + EV + " Electric Vehicle");
		System.out.print("  Select (1-3): ");

		int typeChoice = getIntInput();
		String zoneType = "";

		switch (typeChoice) {
		case 1:
			zoneType = "TWO_WHEELER";
			break;
		case 2:
			zoneType = "FOUR_WHEELER";
			break;
		case 3:
			zoneType = "EV";
			break;
		default:
			System.out.println(CROSS + RED + " Invalid choice!" + RESET);
			return;
		}

		System.out.print(CYAN + "▶ Total Slots: " + RESET);
		int totalSlots = getIntInput();

		System.out.print(CYAN + "▶ Hourly Rate (₹): " + RESET);
		double hourlyRate = scanner.nextDouble();
		scanner.nextLine(); // Consume newline

		String insertQuery = "INSERT INTO parking_zones (zone_name, zone_code, zone_type, total_slots, hourly_rate) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement insertStmt = connection.prepareStatement(insertQuery);
		insertStmt.setString(1, zoneName);
		insertStmt.setString(2, zoneCode);
		insertStmt.setString(3, zoneType);
		insertStmt.setInt(4, totalSlots);
		insertStmt.setDouble(5, hourlyRate);

		int rows = insertStmt.executeUpdate();
		if (rows > 0) {
			System.out.println(
					"\n" + CHECK + GREEN + " Zone " + PARKING + " " + zoneCode + " added successfully!" + RESET);
			System.out.println(INFO + BLUE + " New zone is now available for parking." + RESET);
		}
	}

	// Additional report methods
	private static void showVehicleStatistics() throws SQLException {
		String query = "SELECT vehicle_type, COUNT(*) as count, " + "SUM(total_amount) as revenue "
				+ "FROM parking_records " + "WHERE payment_status = 'PAID' " + "GROUP BY vehicle_type";

		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("\n" + BOLD + CAR + " VEHICLE TYPE STATISTICS" + RESET);
		System.out.println(YELLOW + "┌──────────────┬──────────┬──────────────┬────────────────┐" + RESET);
		System.out.println(YELLOW + "│" + RESET + " Type        " + YELLOW + "│" + RESET + " Count   " + YELLOW + "│"
				+ RESET + " Revenue     " + YELLOW + "│" + RESET + " Avg/Vehicle   " + YELLOW + "│" + RESET);
		System.out.println(YELLOW + "├──────────────┼──────────┼──────────────┼────────────────┤" + RESET);

		while (rs.next()) {
			int count = rs.getInt("count");
			double revenue = rs.getDouble("revenue");
			double avg = revenue / count;
			String typeSymbol = getVehicleSymbol(rs.getString("vehicle_type"));

			System.out.printf(
					YELLOW + "│" + RESET + " %s%-11s " + YELLOW + "│" + RESET + " %-8d " + YELLOW + "│" + RESET
							+ " %-12s " + YELLOW + "│" + RESET + " %-14s " + YELLOW + "│\n",
					typeSymbol, rs.getString("vehicle_type").replace("_", " "), count,
					"₹" + String.format("%.2f", revenue), "₹" + String.format("%.2f", avg));
		}
		System.out.println(YELLOW + "└──────────────┴──────────┴──────────────┴────────────────┘" + RESET);
	}

	private static void showZoneOccupancy() throws SQLException {
		String query = "SELECT zone_code, zone_type, total_slots, occupied_slots, "
				+ "ROUND((occupied_slots * 100.0 / total_slots), 1) as occupancy " + "FROM parking_zones "
				+ "ORDER BY occupancy DESC";

		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("\n" + BOLD + PARKING + " ZONE OCCUPANCY REPORT" + RESET);
		System.out.println(YELLOW + "┌────────┬──────────────┬──────────────┬──────────────┬────────────┐" + RESET);
		System.out.println(YELLOW + "│" + RESET + " Zone  " + YELLOW + "│" + RESET + " Type        " + YELLOW + "│"
				+ RESET + " Occupied/Total " + YELLOW + "│" + RESET + " Occupancy   " + YELLOW + "│" + RESET
				+ " Status    " + YELLOW + "│" + RESET);
		System.out.println(YELLOW + "├────────┼──────────────┼──────────────┼──────────────┼────────────┤" + RESET);

		while (rs.next()) {
			double occ = rs.getDouble("occupancy");
			String statusColor = occ >= 90 ? RED : (occ >= 70 ? YELLOW : GREEN);
			String status = occ >= 90 ? "FULL 🔴" : (occ >= 70 ? "BUSY 🟡" : "GOOD 🟢");
			String typeSymbol = getVehicleSymbol(rs.getString("zone_type"));

			System.out.printf(
					YELLOW + "│" + RESET + " %-6s " + YELLOW + "│" + RESET + " %s%-11s " + YELLOW + "│" + RESET
							+ " %-14s " + YELLOW + "│" + statusColor + " %-12s " + YELLOW + "│" + statusColor
							+ " %-10s " + YELLOW + "│\n",
					rs.getString("zone_code"), typeSymbol, rs.getString("zone_type").replace("_", " "),
					rs.getInt("occupied_slots") + "/" + rs.getInt("total_slots"), String.format("%.1f%%", occ) + RESET,
					status + RESET);
		}
		System.out.println(YELLOW + " " + RESET);
	}

	private static void showMonthlySummary() throws SQLException {
		String query = "SELECT MONTH(exit_time) as month, COUNT(*) as transactions, "
				+ "SUM(total_amount) as revenue, AVG(total_amount) as avg_amount " + "FROM parking_records "
				+ "WHERE payment_status = 'PAID' " + "GROUP BY MONTH(exit_time) " + "ORDER BY month DESC " + "LIMIT 3";

		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		System.out.println("\n" + BOLD + CLOCK + " MONTHLY SUMMARY (Last 3 Months)" + RESET);
		System.out.println(YELLOW + "┌──────────┬──────────────┬──────────────┬──────────────────┐" + RESET);
		System.out.println(YELLOW + "│" + RESET + " Month    " + YELLOW + "│" + RESET + " Transactions " + YELLOW + "│"
				+ RESET + " Revenue     " + YELLOW + "│" + RESET + " Avg/Transaction " + YELLOW + "│" + RESET);
		System.out.println(YELLOW + "├──────────┼──────────────┼──────────────┼──────────────────┤" + RESET);

		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		while (rs.next()) {
			int month = rs.getInt("month");
			int trans = rs.getInt("transactions");
			double rev = rs.getDouble("revenue");
			double avg = rs.getDouble("avg_amount");

			if (month >= 1 && month <= 12) {
				System.out.printf(
						YELLOW + "│" + RESET + " %-8s " + YELLOW + "│" + RESET + " %-12d " + YELLOW + "│" + RESET
								+ " %-12s " + YELLOW + "│" + RESET + " %-16s " + YELLOW + "│\n",
						monthNames[month - 1].substring(0, 3), trans, "₹" + String.format("%.2f", rev),
						"₹" + String.format("%.2f", avg));
			}
		}
		System.out.println(YELLOW + " " + RESET);
	}

	// Utility Methods
	private static int getIntInput() {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.print(CROSS + RED + " Invalid input! Please enter a number: " + RESET);
			}
		}
	}
}