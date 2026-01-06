package Library;

//LibraryManagementSystem.java
import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class LibraryManagementSystem {
	// ANSI Color Codes
	private static final String RESET = "\u001B[0m";
	private static final String RED = "\u001B[31m";
	private static final String GREEN = "\u001B[32m";
	private static final String YELLOW = "\u001B[33m";
	private static final String BLUE = "\u001B[34m";
	private static final String PURPLE = "\u001B[35m";
	private static final String CYAN = "\u001B[36m";
	private static final String WHITE = "\u001B[37m";

	// Background Colors
	private static final String BG_BLACK = "\u001B[40m";
	private static final String BG_RED = "\u001B[41m";
	private static final String BG_GREEN = "\u001B[42m";
	private static final String BG_YELLOW = "\u001B[43m";
	private static final String BG_BLUE = "\u001B[44m";
	private static final String BG_PURPLE = "\u001B[45m";
	private static final String BG_CYAN = "\u001B[46m";

	// Styles
	private static final String BOLD = "\u001B[1m";
	private static final String UNDERLINE = "\u001B[4m";

	private static Connection connection;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		initializeDatabase();
		showMainMenu();
	}

	private static void initializeDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db", "root", "Kartik@2005" // Change
																														// to
																														// your
																														// password
			);
			System.out.println(GREEN + BG_BLACK + " Database connected successfully!" + RESET);
		} catch (Exception e) {
			System.out.println(RED + BG_BLACK + " Database connection failed: " + e.getMessage() + RESET);
		}
	}

	private static void showMainMenu() {
		while (true) {
			clearScreen();
			System.out.println(CYAN + BG_BLACK + "╔════════════════════════════════════════╗" + RESET);
			System.out.println(CYAN + BG_BLACK + "║           " + BOLD + "MAIN MENU" + RESET + CYAN + BG_BLACK
					+ "                  ║" + RESET);
			System.out.println(CYAN + BG_BLACK + "╠════════════════════════════════════════╣" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 1. " + GREEN + " Book Management" + RESET + PURPLE + BG_BLACK
					+ "            ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 2. " + BLUE + " Member Management" + RESET + PURPLE + BG_BLACK
					+ "          ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 3. " + YELLOW + " Borrow & Return" + RESET + PURPLE + BG_BLACK
					+ "            ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 4. " + CYAN + " Reports & Analytics" + RESET + PURPLE + BG_BLACK
					+ "        ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 5. " + GREEN + " Book Reservations" + RESET + PURPLE + BG_BLACK
					+ "          ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 6. " + RED + " Fine Management" + RESET + PURPLE + BG_BLACK
					+ "            ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 7. " + WHITE + " Search & Filter" + RESET + PURPLE + BG_BLACK
					+ "            ║" + RESET);
			System.out.println(PURPLE + BG_BLACK + "║ 0. " + RED + " Exit" + RESET + PURPLE + BG_BLACK
					+ "                       ║" + RESET);
			System.out.println(CYAN + BG_BLACK + "╚════════════════════════════════════════╝" + RESET);

			System.out.print(YELLOW + "\nEnter your choice (0-7): " + RESET);
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1 -> showBookMenu();
			case 2 -> showMemberMenu();
			case 3 -> showBorrowMenu();
			case 4 -> showReportsMenu();
			case 5 -> showReservationMenu();
			case 6 -> showFineMenu();
			case 7 -> showSearchMenu();
			case 0 -> {
				System.out.println(GREEN + "Thank you for using Library Management System! " + RESET);
				System.exit(0);
			}
			default -> System.out.println(RED + "Invalid choice! Please try again." + RESET);
			}

			System.out.print("\nPress Enter to continue...");
			scanner.nextLine();
		}
	}

	private static void showBookMenu() {
		while (true) {
			clearScreen();
			System.out.println(BLUE + "╔════════════════════════════════════════╗" + RESET);
			System.out.println(
					BLUE + "║         " + BOLD + "BOOK OPERATIONS" + RESET + BLUE + "               ║" + RESET);
			System.out.println(BLUE + "╠════════════════════════════════════════╣" + RESET);
			System.out.println(GREEN + "║ 1. Add New Book" + RESET + BLUE + "                     ║" + RESET);
			System.out.println(GREEN + "║ 2. View All Books" + RESET + BLUE + "                   ║" + RESET);
			System.out.println(GREEN + "║ 3. Search Book" + RESET + BLUE + "                      ║" + RESET);
			System.out.println(GREEN + "║ 4. Update Book Details" + RESET + BLUE + "              ║" + RESET);
			System.out.println(GREEN + "║ 5. Delete Book" + RESET + BLUE + "                      ║" + RESET);
			System.out.println(GREEN + "║ 6. View Popular Books" + RESET + BLUE + "               ║" + RESET);
			System.out.println(GREEN + "║ 7. View Low Stock Books" + RESET + BLUE + "             ║" + RESET);
			System.out.println(RED + "║ 0. Back to Main Menu" + RESET + BLUE + "                ║" + RESET);
			System.out.println(BLUE + "╚════════════════════════════════════════╝" + RESET);

			System.out.print(YELLOW + "\nEnter your choice: " + RESET);
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> addBook();
			case 2 -> viewAllBooks();
			case 3 -> searchBook();
			case 4 -> updateBook();
			case 5 -> deleteBook();
			case 6 -> viewPopularBooks();
			case 7 -> viewLowStockBooks();
			case 0 -> {
				return;
			}
			default -> System.out.println(RED + "Invalid choice!" + RESET);
			}
			pause();
		}
	}

	private static void addBook() {
		try {
			System.out.println(CYAN + "\n➕ ADD NEW BOOK" + RESET);
			System.out.println("════════════════");

			System.out.print("Title: ");
			String title = scanner.nextLine();

			System.out.print("Author: ");
			String author = scanner.nextLine();

			System.out.print("ISBN: ");
			String isbn = scanner.nextLine();

			System.out.print("Genre: ");
			String genre = scanner.nextLine();

			System.out.print("Publication Year: ");
			int year = scanner.nextInt();

			System.out.print("Total Copies: ");
			int copies = scanner.nextInt();

			String sql = "INSERT INTO books (title, author, isbn, genre, publication_year, total_copies, available_copies) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, author);
			pstmt.setString(3, isbn);
			pstmt.setString(4, genre);
			pstmt.setInt(5, year);
			pstmt.setInt(6, copies);
			pstmt.setInt(7, copies);

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println(GREEN + " Book added successfully!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewAllBooks() {
		try {
			String sql = "SELECT * FROM books ORDER BY title";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(CYAN + "\n ALL BOOKS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title", "Author",
					"Genre", "Year", "Available", "Total");
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			while (rs.next()) {
				String availableColor = rs.getInt("available_copies") > 0 ? GREEN : RED;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + availableColor + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void searchBook() {
		try {
			System.out.print("Enter book title to search: ");
			String title = scanner.nextLine();

			String sql = "SELECT * FROM books WHERE title LIKE ? ORDER BY title";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "%" + title + "%");

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n SEARCH RESULTS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title", "Author",
					"Genre", "Year", "Available", "Total");
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				String availableColor = rs.getInt("available_copies") > 0 ? GREEN : RED;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + availableColor + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(RED + "No books found!" + RESET);
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void updateBook() {
		try {
			System.out.print("Enter Book ID to update: ");
			int bookId = scanner.nextInt();
			scanner.nextLine();

			String checkSql = "SELECT * FROM books WHERE book_id = ?";
			PreparedStatement checkStmt = connection.prepareStatement(checkSql);
			checkStmt.setInt(1, bookId);
			ResultSet rs = checkStmt.executeQuery();

			if (!rs.next()) {
				System.out.println(RED + "Book not found!" + RESET);
				return;
			}

			System.out.println(CYAN + "\n UPDATE BOOK DETAILS (Leave empty to keep current value)" + RESET);
			System.out.println("════════════════════════════════════════════════════");

			System.out.print("Title [" + rs.getString("title") + "]: ");
			String title = scanner.nextLine();
			if (title.isEmpty())
				title = rs.getString("title");

			System.out.print("Author [" + rs.getString("author") + "]: ");
			String author = scanner.nextLine();
			if (author.isEmpty())
				author = rs.getString("author");

			System.out.print("ISBN [" + rs.getString("isbn") + "]: ");
			String isbn = scanner.nextLine();
			if (isbn.isEmpty())
				isbn = rs.getString("isbn");

			System.out.print("Genre [" + rs.getString("genre") + "]: ");
			String genre = scanner.nextLine();
			if (genre.isEmpty())
				genre = rs.getString("genre");

			System.out.print("Publication Year [" + rs.getInt("publication_year") + "]: ");
			String yearStr = scanner.nextLine();
			int year = yearStr.isEmpty() ? rs.getInt("publication_year") : Integer.parseInt(yearStr);

			System.out.print("Total Copies [" + rs.getInt("total_copies") + "]: ");
			String copiesStr = scanner.nextLine();
			int copies = copiesStr.isEmpty() ? rs.getInt("total_copies") : Integer.parseInt(copiesStr);

			int available = copies - (rs.getInt("total_copies") - rs.getInt("available_copies"));
			if (available < 0)
				available = 0;

			String updateSql = "UPDATE books SET title = ?, author = ?, isbn = ?, genre = ?, "
					+ "publication_year = ?, total_copies = ?, available_copies = ? WHERE book_id = ?";
			PreparedStatement pstmt = connection.prepareStatement(updateSql);
			pstmt.setString(1, title);
			pstmt.setString(2, author);
			pstmt.setString(3, isbn);
			pstmt.setString(4, genre);
			pstmt.setInt(5, year);
			pstmt.setInt(6, copies);
			pstmt.setInt(7, available);
			pstmt.setInt(8, bookId);

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println(GREEN + " Book updated successfully!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void deleteBook() {
		try {
			System.out.print("Enter Book ID to delete: ");
			int bookId = scanner.nextInt();
			scanner.nextLine();

			System.out.print(RED + "Are you sure you want to delete this book? (y/n): " + RESET);
			String confirm = scanner.nextLine();

			if (confirm.equalsIgnoreCase("y")) {
				String sql = "DELETE FROM books WHERE book_id = ?";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.setInt(1, bookId);

				int rows = pstmt.executeUpdate();
				if (rows > 0) {
					System.out.println(GREEN + " Book deleted successfully!" + RESET);
				} else {
					System.out.println(RED + "Book not found!" + RESET);
				}
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewPopularBooks() {
		try {
			String sql = "SELECT b.*, COUNT(br.book_id) as borrow_count "
					+ "FROM books b LEFT JOIN borrowings br ON b.book_id = br.book_id "
					+ "GROUP BY b.book_id ORDER BY borrow_count DESC LIMIT 10";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(CYAN + "\n POPULAR BOOKS (Top 10)" + RESET);
			System.out.println("════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s\n" + RESET, "ID", "Title", "Author",
					"Borrow Count", "Available");
			System.out.println("════════════════════════════════════════════════════════════════════════");

			while (rs.next()) {
				System.out.printf("%-5d %-30s %-20s %-15d %-10d\n", rs.getInt("book_id"),
						truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						rs.getInt("borrow_count"), rs.getInt("available_copies"));
			}
			System.out.println("════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewLowStockBooks() {
		try {
			String sql = "SELECT * FROM books WHERE available_copies <= 2 ORDER BY available_copies";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(RED + "\n LOW STOCK BOOKS" + RESET);
			System.out.println("══════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-30s %-20s %-10s %-10s\n" + RESET, "ID", "Title", "Author", "Available",
					"Total");
			System.out.println("══════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				String stockColor = rs.getInt("available_copies") == 0 ? RED : YELLOW;
				System.out.printf("%-5d %-30s %-20s " + stockColor + "%-10d" + RESET + " %-10d\n", rs.getInt("book_id"),
						truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(GREEN + "No low stock books!" + RESET);
			}
			System.out.println("══════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showMemberMenu() {
		while (true) {
			clearScreen();
			System.out.println(PURPLE + "╔════════════════════════════════════════╗" + RESET);
			System.out.println(
					PURPLE + "║       " + BOLD + "MEMBER OPERATIONS" + RESET + PURPLE + "               ║" + RESET);
			System.out.println(PURPLE + "╠════════════════════════════════════════╣" + RESET);
			System.out.println(GREEN + "║ 1. Add New Member" + RESET + PURPLE + "                   ║" + RESET);
			System.out.println(GREEN + "║ 2. View All Members" + RESET + PURPLE + "                 ║" + RESET);
			System.out.println(GREEN + "║ 3. Search Member" + RESET + PURPLE + "                    ║" + RESET);
			System.out.println(GREEN + "║ 4. Update Member Details" + RESET + PURPLE + "            ║" + RESET);
			System.out.println(GREEN + "║ 5. Deactivate/Reactivate Member" + RESET + PURPLE + "     ║" + RESET);
			System.out.println(GREEN + "║ 6. View Member Borrowing History" + RESET + PURPLE + "    ║" + RESET);
			System.out.println(RED + "║ 0. Back to Main Menu" + RESET + PURPLE + "                ║" + RESET);
			System.out.println(PURPLE + "╚════════════════════════════════════════╝" + RESET);

			System.out.print(YELLOW + "\nEnter your choice: " + RESET);
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> addMember();
			case 2 -> viewAllMembers();
			case 3 -> searchMember();
			case 4 -> updateMember();
			case 5 -> toggleMemberStatus();
			case 6 -> viewMemberBorrowingHistory();
			case 0 -> {
				return;
			}
			default -> System.out.println(RED + "Invalid choice!" + RESET);
			}
			pause();
		}
	}

	private static void addMember() {
		try {
			System.out.println(CYAN + "\n➕ ADD NEW MEMBER" + RESET);
			System.out.println("═══════════════════");

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Email: ");
			String email = scanner.nextLine();

			System.out.print("Phone: ");
			String phone = scanner.nextLine();

			String sql = "INSERT INTO members (name, email, phone, membership_date) VALUES (?, ?, ?, CURDATE())";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println(GREEN + " Member added successfully!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewAllMembers() {
		try {
			String sql = "SELECT * FROM members ORDER BY name";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(CYAN + "\n ALL MEMBERS" + RESET);
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-25s %-25s %-15s %-12s %-10s %-8s\n" + RESET, "ID", "Name", "Email",
					"Phone", "Join Date", "Fine Due", "Status");
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");

			while (rs.next()) {
				String statusColor = rs.getBoolean("active_status") ? GREEN : RED;
				String statusText = rs.getBoolean("active_status") ? "Active" : "Inactive";
				String fineColor = rs.getDouble("fine_amount") > 0 ? RED : GREEN;

				System.out.printf(
						"%-5d %-25s %-25s %-15s %-12s " + fineColor + "₹%-11.2f" + RESET + " " + statusColor + "%-8s"
								+ RESET + "\n",
						rs.getInt("member_id"), truncate(rs.getString("name"), 23), truncate(rs.getString("email"), 23),
						rs.getString("phone"), rs.getDate("membership_date"), rs.getDouble("fine_amount"), statusText);
			}
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void searchMember() {
		try {
			System.out.print("Enter member name to search: ");
			String name = scanner.nextLine();

			String sql = "SELECT * FROM members WHERE name LIKE ? ORDER BY name";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n SEARCH RESULTS" + RESET);
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-25s %-25s %-15s %-12s %-10s %-8s\n" + RESET, "ID", "Name", "Email",
					"Phone", "Join Date", "Fine Due", "Status");
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				String statusColor = rs.getBoolean("active_status") ? GREEN : RED;
				String statusText = rs.getBoolean("active_status") ? "Active" : "Inactive";
				String fineColor = rs.getDouble("fine_amount") > 0 ? RED : GREEN;

				System.out.printf(
						"%-5d %-25s %-25s %-15s %-12s " + fineColor + "₹%-11.2f" + RESET + " " + statusColor + "%-8s"
								+ RESET + "\n",
						rs.getInt("member_id"), truncate(rs.getString("name"), 23), truncate(rs.getString("email"), 23),
						rs.getString("phone"), rs.getDate("membership_date"), rs.getDouble("fine_amount"), statusText);
			}

			if (!found) {
				System.out.println(RED + "No members found!" + RESET);
			}
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void updateMember() {
		try {
			System.out.print("Enter Member ID to update: ");
			int memberId = scanner.nextInt();
			scanner.nextLine();

			String checkSql = "SELECT * FROM members WHERE member_id = ?";
			PreparedStatement checkStmt = connection.prepareStatement(checkSql);
			checkStmt.setInt(1, memberId);
			ResultSet rs = checkStmt.executeQuery();

			if (!rs.next()) {
				System.out.println(RED + "Member not found!" + RESET);
				return;
			}

			System.out.println(CYAN + "\n UPDATE MEMBER DETAILS (Leave empty to keep current value)" + RESET);
			System.out.println("════════════════════════════════════════════════════");

			System.out.print("Name [" + rs.getString("name") + "]: ");
			String name = scanner.nextLine();
			if (name.isEmpty())
				name = rs.getString("name");

			System.out.print("Email [" + rs.getString("email") + "]: ");
			String email = scanner.nextLine();
			if (email.isEmpty())
				email = rs.getString("email");

			System.out.print("Phone [" + rs.getString("phone") + "]: ");
			String phone = scanner.nextLine();
			if (phone.isEmpty())
				phone = rs.getString("phone");

			String updateSql = "UPDATE members SET name = ?, email = ?, phone = ? WHERE member_id = ?";
			PreparedStatement pstmt = connection.prepareStatement(updateSql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			pstmt.setInt(4, memberId);

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println(GREEN + " Member updated successfully!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void toggleMemberStatus() {
		try {
			System.out.print("Enter Member ID: ");
			int memberId = scanner.nextInt();
			scanner.nextLine();

			String checkSql = "SELECT * FROM members WHERE member_id = ?";
			PreparedStatement checkStmt = connection.prepareStatement(checkSql);
			checkStmt.setInt(1, memberId);
			ResultSet rs = checkStmt.executeQuery();

			if (!rs.next()) {
				System.out.println(RED + "Member not found!" + RESET);
				return;
			}

			boolean currentStatus = rs.getBoolean("active_status");
			boolean newStatus = !currentStatus; // Change to boolean type

			String updateSql = "UPDATE members SET active_status = ? WHERE member_id = ?";
			PreparedStatement pstmt = connection.prepareStatement(updateSql);
			pstmt.setBoolean(1, newStatus);
			pstmt.setInt(2, memberId);

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				String action = newStatus ? "activated" : "deactivated"; // Now this works
				System.out.println(GREEN + " Member " + action + " successfully!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewMemberBorrowingHistory() {
		try {
			System.out.print("Enter Member ID: ");
			int memberId = scanner.nextInt();
			scanner.nextLine();

			String sql = "SELECT b.title, br.borrow_date, br.due_date, br.return_date, br.fine_amount, br.status "
					+ "FROM borrowings br JOIN books b ON br.book_id = b.book_id "
					+ "WHERE br.member_id = ? ORDER BY br.borrow_date DESC";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, memberId);

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n BORROWING HISTORY" + RESET);
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-30s %-12s %-12s %-12s %-10s %-10s\n" + RESET, "Title", "Borrow Date",
					"Due Date", "Return Date", "Fine", "Status");
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				String statusColor = rs.getString("status").equals("OVERDUE") ? RED
						: rs.getString("status").equals("BORROWED") ? YELLOW : GREEN;

				System.out.printf("%-30s %-12s %-12s %-12s ₹%-9.2f " + statusColor + "%-10s" + RESET + "\n",
						truncate(rs.getString("title"), 28), rs.getDate("borrow_date"), rs.getDate("due_date"),
						rs.getDate("return_date"), rs.getDouble("fine_amount"), rs.getString("status"));
			}

			if (!found) {
				System.out.println(GREEN + "No borrowing history found!" + RESET);
			}
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showBorrowMenu() {
		while (true) {
			clearScreen();
			System.out.println(YELLOW + "╔════════════════════════════════════════╗" + RESET);
			System.out.println(
					YELLOW + "║        " + BOLD + "BORROWING OPERATIONS" + RESET + YELLOW + "             ║" + RESET);
			System.out.println(YELLOW + "╠════════════════════════════════════════╣" + RESET);
			System.out.println(GREEN + "║ 1. Borrow a Book" + RESET + YELLOW + "                     ║" + RESET);
			System.out.println(GREEN + "║ 2. Return a Book" + RESET + YELLOW + "                     ║" + RESET);
			System.out.println(GREEN + "║ 3. View Current Borrowings" + RESET + YELLOW + "           ║" + RESET);
			System.out.println(GREEN + "║ 4. View Overdue Books" + RESET + YELLOW + "                ║" + RESET);
			System.out.println(GREEN + "║ 5. Renew Borrowing" + RESET + YELLOW + "                   ║" + RESET);
			System.out.println(RED + "║ 0. Back to Main Menu" + RESET + YELLOW + "                ║" + RESET);
			System.out.println(YELLOW + "╚════════════════════════════════════════╝" + RESET);

			System.out.print(YELLOW + "\nEnter your choice: " + RESET);
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> borrowBook();
			case 2 -> returnBook();
			case 3 -> viewCurrentBorrowings();
			case 4 -> viewOverdueBooks();
			case 5 -> renewBorrowing();
			case 0 -> {
				return;
			}
			default -> System.out.println(RED + "Invalid choice!" + RESET);
			}
			pause();
		}
	}

	private static void borrowBook() {
		try {
			System.out.println(CYAN + "\n BORROW A BOOK" + RESET);
			System.out.println("══════════════════");

			// Check member
			System.out.print("Enter Member ID: ");
			int memberId = scanner.nextInt();

			String checkMember = "SELECT active_status, fine_amount FROM members WHERE member_id = ?";
			PreparedStatement checkStmt = connection.prepareStatement(checkMember);
			checkStmt.setInt(1, memberId);
			ResultSet memberRs = checkStmt.executeQuery();

			if (!memberRs.next()) {
				System.out.println(RED + " Member not found!" + RESET);
				return;
			}

			if (!memberRs.getBoolean("active_status")) {
				System.out.println(RED + " Member is inactive!" + RESET);
				return;
			}

			if (memberRs.getDouble("fine_amount") > 0) {
				System.out.println(RED + " Member has pending fines!" + RESET);
				return;
			}

			// Check book
			System.out.print("Enter Book ID: ");
			int bookId = scanner.nextInt();

			String checkBook = "SELECT available_copies, title FROM books WHERE book_id = ?";
			PreparedStatement bookStmt = connection.prepareStatement(checkBook);
			bookStmt.setInt(1, bookId);
			ResultSet bookRs = bookStmt.executeQuery();

			if (!bookRs.next()) {
				System.out.println(RED + " Book not found!" + RESET);
				return;
			}

			if (bookRs.getInt("available_copies") <= 0) {
				System.out.println(RED + " Book is not available!" + RESET);
				return;
			}

			// Create borrowing
			String borrowSql = "INSERT INTO borrowings (book_id, member_id, borrow_date, due_date, status) "
					+ "VALUES (?, ?, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 14 DAY), 'BORROWED')";
			PreparedStatement borrowStmt = connection.prepareStatement(borrowSql);
			borrowStmt.setInt(1, bookId);
			borrowStmt.setInt(2, memberId);

			// Update available copies
			String updateSql = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = ?";
			PreparedStatement updateStmt = connection.prepareStatement(updateSql);
			updateStmt.setInt(1, bookId);

			connection.setAutoCommit(false);
			borrowStmt.executeUpdate();
			updateStmt.executeUpdate();
			connection.commit();
			connection.setAutoCommit(true);

			System.out
					.println(GREEN + " Book borrowed successfully! Due date: " + LocalDate.now().plusDays(14) + RESET);

		} catch (SQLException e) {
			try {
				connection.rollback();
				connection.setAutoCommit(true);
			} catch (SQLException ex) {
				System.out.println(RED + "Rollback error: " + ex.getMessage() + RESET);
			}
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void returnBook() {
		try {
			System.out.println(CYAN + "\n RETURN A BOOK" + RESET);
			System.out.println("══════════════════");

			System.out.print("Enter Borrowing ID: ");
			int borrowingId = scanner.nextInt();

			String checkSql = "SELECT b.book_id, br.due_date, DATEDIFF(CURDATE(), br.due_date) as days_late "
					+ "FROM borrowings br JOIN books b ON br.book_id = b.book_id "
					+ "WHERE br.borrowing_id = ? AND br.status = 'BORROWED'";
			PreparedStatement checkStmt = connection.prepareStatement(checkSql);
			checkStmt.setInt(1, borrowingId);
			ResultSet rs = checkStmt.executeQuery();

			if (!rs.next()) {
				System.out.println(RED + " No active borrowing found!" + RESET);
				return;
			}

			int bookId = rs.getInt("book_id");
			int daysLate = rs.getInt("days_late");
			double fine = 0;

			if (daysLate > 0) {
				fine = daysLate * 5.0; // ₹5 per day late
				System.out.println(YELLOW + " Book is " + daysLate + " days late. Fine: ₹" + fine + RESET);
			}

			// Update borrowing
			String returnSql = "UPDATE borrowings SET return_date = CURDATE(), fine_amount = ?, "
					+ "status = CASE WHEN ? > 0 THEN 'OVERDUE' ELSE 'RETURNED' END " + "WHERE borrowing_id = ?";
			PreparedStatement returnStmt = connection.prepareStatement(returnSql);
			returnStmt.setDouble(1, fine);
			returnStmt.setDouble(2, fine);
			returnStmt.setInt(3, borrowingId);

			// Update book copies
			String updateSql = "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = ?";
			PreparedStatement updateStmt = connection.prepareStatement(updateSql);
			updateStmt.setInt(1, bookId);

			// Update member fine if any
			if (fine > 0) {
				String fineSql = "UPDATE members m JOIN borrowings br ON m.member_id = br.member_id "
						+ "SET m.fine_amount = m.fine_amount + ? " + "WHERE br.borrowing_id = ?";
				PreparedStatement fineStmt = connection.prepareStatement(fineSql);
				fineStmt.setDouble(1, fine);
				fineStmt.setInt(2, borrowingId);
				fineStmt.executeUpdate();
			}

			connection.setAutoCommit(false);
			returnStmt.executeUpdate();
			updateStmt.executeUpdate();
			connection.commit();
			connection.setAutoCommit(true);

			if (fine > 0) {
				System.out.println(YELLOW + " Book returned with fine of ₹" + fine + RESET);
			} else {
				System.out.println(GREEN + " Book returned successfully!" + RESET);
			}

		} catch (SQLException e) {
			try {
				connection.rollback();
				connection.setAutoCommit(true);
			} catch (SQLException ex) {
				System.out.println(RED + "Rollback error: " + ex.getMessage() + RESET);
			}
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewCurrentBorrowings() {
		try {
			String sql = "SELECT br.borrowing_id, b.title, m.name, br.borrow_date, br.due_date, "
					+ "DATEDIFF(br.due_date, CURDATE()) as days_remaining " + "FROM borrowings br "
					+ "JOIN books b ON br.book_id = b.book_id " + "JOIN members m ON br.member_id = m.member_id "
					+ "WHERE br.status = 'BORROWED' ORDER BY br.due_date";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(CYAN + "\n CURRENT BORROWINGS" + RESET);
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-12s %-25s %-20s %-12s %-12s %-15s\n" + RESET, "Borrow ID", "Book Title",
					"Member", "Borrow Date", "Due Date", "Days Remaining");
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				int daysRemaining = rs.getInt("days_remaining");
				String daysColor = daysRemaining < 3 ? RED : daysRemaining < 7 ? YELLOW : GREEN;

				System.out.printf("%-12d %-25s %-20s %-12s %-12s " + daysColor + "%-15d" + RESET + "\n",
						rs.getInt("borrowing_id"), truncate(rs.getString("title"), 23),
						truncate(rs.getString("name"), 18), rs.getDate("borrow_date"), rs.getDate("due_date"),
						daysRemaining);
			}

			if (!found) {
				System.out.println(GREEN + "No current borrowings!" + RESET);
			}
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void viewOverdueBooks() {
		try {
			String sql = "SELECT br.borrowing_id, b.title, m.name, br.borrow_date, br.due_date, "
					+ "DATEDIFF(CURDATE(), br.due_date) as days_overdue " + "FROM borrowings br "
					+ "JOIN books b ON br.book_id = b.book_id " + "JOIN members m ON br.member_id = m.member_id "
					+ "WHERE br.status = 'BORROWED' AND br.due_date < CURDATE() " + "ORDER BY br.due_date";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(RED + "\n OVERDUE BOOKS" + RESET);
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-12s %-25s %-20s %-12s %-12s %-15s\n" + RESET, "Borrow ID", "Book Title",
					"Member", "Borrow Date", "Due Date", "Days Overdue");
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				int daysOverdue = rs.getInt("days_overdue");

				System.out.printf("%-12d %-25s %-20s %-12s %-12s " + RED + "%-15d" + RESET + "\n",
						rs.getInt("borrowing_id"), truncate(rs.getString("title"), 23),
						truncate(rs.getString("name"), 18), rs.getDate("borrow_date"), rs.getDate("due_date"),
						daysOverdue);
			}

			if (!found) {
				System.out.println(GREEN + "No overdue books!" + RESET);
			}
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void renewBorrowing() {
		try {
			System.out.print("Enter Borrowing ID to renew: ");
			int borrowingId = scanner.nextInt();

			String checkSql = "SELECT due_date, DATEDIFF(due_date, CURDATE()) as days_left "
					+ "FROM borrowings WHERE borrowing_id = ? AND status = 'BORROWED'";
			PreparedStatement checkStmt = connection.prepareStatement(checkSql);
			checkStmt.setInt(1, borrowingId);
			ResultSet rs = checkStmt.executeQuery();

			if (!rs.next()) {
				System.out.println(RED + "No active borrowing found!" + RESET);
				return;
			}

			int daysLeft = rs.getInt("days_left");
			if (daysLeft > 7) {
				System.out
						.println(RED + "Cannot renew yet. You can only renew when due date is within 7 days." + RESET);
				return;
			}

			String renewSql = "UPDATE borrowings SET due_date = DATE_ADD(due_date, INTERVAL 14 DAY) "
					+ "WHERE borrowing_id = ?";
			PreparedStatement renewStmt = connection.prepareStatement(renewSql);
			renewStmt.setInt(1, borrowingId);

			int rows = renewStmt.executeUpdate();
			if (rows > 0) {
				System.out.println(GREEN + " Borrowing renewed successfully! Extended by 14 days." + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showReportsMenu() {
		while (true) {
			clearScreen();
			System.out.println(CYAN + "╔════════════════════════════════════════╗" + RESET);
			System.out.println(
					CYAN + "║          " + BOLD + "REPORTS" + RESET + CYAN + "                      ║" + RESET);
			System.out.println(CYAN + "╠════════════════════════════════════════╣" + RESET);
			System.out.println(GREEN + "║ 1. Library Statistics" + RESET + CYAN + "                ║" + RESET);
			System.out.println(GREEN + "║ 2. Monthly Borrowing Report" + RESET + CYAN + "          ║" + RESET);
			System.out.println(GREEN + "║ 3. Genre-wise Analysis" + RESET + CYAN + "               ║" + RESET);
			System.out.println(GREEN + "║ 4. Top Borrowers" + RESET + CYAN + "                     ║" + RESET);
			System.out.println(GREEN + "║ 5. Book Utilization Report" + RESET + CYAN + "           ║" + RESET);
			System.out.println(GREEN + "║ 6. Revenue Report (Fines)" + RESET + CYAN + "            ║" + RESET);
			System.out.println(RED + "║ 0. Back to Main Menu" + RESET + CYAN + "                ║" + RESET);
			System.out.println(CYAN + "╚════════════════════════════════════════╝" + RESET);

			System.out.print(YELLOW + "\nEnter your choice: " + RESET);
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> showLibraryStatistics();
			case 2 -> showMonthlyReport();
			case 3 -> showGenreAnalysis();
			case 4 -> showTopBorrowers();
			case 5 -> showBookUtilization();
			case 6 -> showRevenueReport();
			case 0 -> {
				return;
			}
			default -> System.out.println(RED + "Invalid choice!" + RESET);
			}
			pause();
		}
	}

	private static void showLibraryStatistics() {
		try {
			System.out.println(CYAN + "\n LIBRARY STATISTICS" + RESET);
			System.out.println("══════════════════════════");

			Statement stmt = connection.createStatement();

			// Total books
			String booksSql = "SELECT COUNT(*) as total, SUM(total_copies) as copies FROM books";
			ResultSet rs = stmt.executeQuery(booksSql);
			rs.next();
			System.out.println(YELLOW + "Books:" + RESET);
			System.out.println("  Total Titles: " + GREEN + rs.getInt("total") + RESET);
			System.out.println("  Total Copies: " + GREEN + rs.getInt("copies") + RESET);

			// Available books
			String availSql = "SELECT SUM(available_copies) as available FROM books";
			ResultSet availRs = stmt.executeQuery(availSql);
			availRs.next();
			System.out.println("  Available: " + GREEN + availRs.getInt("available") + RESET);

			// Members
			String memSql = "SELECT COUNT(*) as total, SUM(CASE WHEN active_status THEN 1 ELSE 0 END) as active FROM members";
			ResultSet memRs = stmt.executeQuery(memSql);
			memRs.next();
			System.out.println(YELLOW + "\nMembers:" + RESET);
			System.out.println("  Total: " + GREEN + memRs.getInt("total") + RESET);
			System.out.println("  Active: " + GREEN + memRs.getInt("active") + RESET);

			// Borrowings
			String borrowSql = "SELECT COUNT(*) as total, "
					+ "SUM(CASE WHEN status = 'BORROWED' THEN 1 ELSE 0 END) as active, "
					+ "SUM(CASE WHEN status = 'OVERDUE' THEN 1 ELSE 0 END) as overdue " + "FROM borrowings";
			ResultSet borrowRs = stmt.executeQuery(borrowSql);
			borrowRs.next();
			System.out.println(YELLOW + "\nBorrowings:" + RESET);
			System.out.println("  Total: " + GREEN + borrowRs.getInt("total") + RESET);
			System.out.println("  Active: " + GREEN + borrowRs.getInt("active") + RESET);
			System.out.println("  Overdue: " + RED + borrowRs.getInt("overdue") + RESET);

			// Fines
			String fineSql = "SELECT SUM(fine_amount) as total_fine FROM members";
			ResultSet fineRs = stmt.executeQuery(fineSql);
			fineRs.next();
			System.out.println(YELLOW + "\nFines:" + RESET);
			System.out.println("  Total Due: " + RED + "₹" + fineRs.getDouble("total_fine") + RESET);

		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showMonthlyReport() {
		try {
			System.out.println(CYAN + "\n MONTHLY BORROWING REPORT" + RESET);
			System.out.println("══════════════════════════════════════");

			String sql = "SELECT MONTH(borrow_date) as month, COUNT(*) as borrow_count "
					+ "FROM borrowings WHERE YEAR(borrow_date) = YEAR(CURDATE()) "
					+ "GROUP BY MONTH(borrow_date) ORDER BY month";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.printf(YELLOW + "%-10s %-15s\n" + RESET, "Month", "Borrowings");
			System.out.println("══════════════════════════");

			String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

			boolean found = false;
			while (rs.next()) {
				found = true;
				int month = rs.getInt("month");
				int count = rs.getInt("borrow_count");
				String color = count > 50 ? GREEN : count > 20 ? YELLOW : BLUE;

				System.out.printf("%-10s " + color + "%-15d" + RESET + "\n", months[month - 1], count);
			}

			if (!found) {
				System.out.println(GREEN + "No borrowings this year!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showGenreAnalysis() {
		try {
			System.out.println(CYAN + "\n GENRE-WISE ANALYSIS" + RESET);
			System.out.println("══════════════════════════════════════════════════");

			String sql = "SELECT genre, COUNT(*) as book_count, SUM(total_copies) as total_copies, "
					+ "SUM(available_copies) as available_copies, "
					+ "ROUND(AVG(total_copies - available_copies), 1) as avg_borrowed "
					+ "FROM books GROUP BY genre ORDER BY book_count DESC";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.printf(YELLOW + "%-15s %-10s %-12s %-12s %-12s\n" + RESET, "Genre", "Books", "Total",
					"Available", "Avg Borrowed");
			System.out.println("════════════════════════════════════════════════════════════════════");

			while (rs.next()) {
				System.out.printf("%-15s %-10d %-12d %-12d %-12.1f\n", truncate(rs.getString("genre"), 13),
						rs.getInt("book_count"), rs.getInt("total_copies"), rs.getInt("available_copies"),
						rs.getDouble("avg_borrowed"));
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showTopBorrowers() {
		try {
			System.out.println(CYAN + "\n TOP BORROWERS" + RESET);
			System.out.println("══════════════════════════════════════════════");

			String sql = "SELECT m.name, COUNT(br.borrowing_id) as borrow_count, "
					+ "MAX(br.borrow_date) as last_borrowed "
					+ "FROM members m JOIN borrowings br ON m.member_id = br.member_id "
					+ "GROUP BY m.member_id, m.name ORDER BY borrow_count DESC LIMIT 10";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.printf(YELLOW + "%-25s %-15s %-15s\n" + RESET, "Name", "Borrow Count", "Last Borrowed");
			System.out.println("══════════════════════════════════════════════════════════════════");

			int rank = 1;
			while (rs.next()) {
				String rankColor = rank == 1 ? YELLOW : rank <= 3 ? GREEN : BLUE;
				System.out.printf(rankColor + "%-25s %-15d %-15s" + RESET + "\n", truncate(rs.getString("name"), 23),
						rs.getInt("borrow_count"), rs.getDate("last_borrowed"));
				rank++;
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showBookUtilization() {
		try {
			System.out.println(CYAN + "\n BOOK UTILIZATION REPORT" + RESET);
			System.out.println("════════════════════════════════════════════════════════════════════");

			String sql = "SELECT title, total_copies, available_copies, "
					+ "(total_copies - available_copies) as borrowed_copies, "
					+ "ROUND((total_copies - available_copies) * 100.0 / total_copies, 1) as utilization_rate "
					+ "FROM books ORDER BY utilization_rate DESC LIMIT 15";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.printf(YELLOW + "%-30s %-8s %-10s %-10s %-12s\n" + RESET, "Title", "Total", "Available",
					"Borrowed", "Utilization %");
			System.out.println(
					"══════════════════════════════════════════════════════════════════════════════════════════");

			while (rs.next()) {
				double utilization = rs.getDouble("utilization_rate");
				String utilColor = utilization > 80 ? GREEN : utilization > 50 ? YELLOW : BLUE;

				System.out.printf("%-30s %-8d %-10d %-10d " + utilColor + "%-12.1f%%" + RESET + "\n",
						truncate(rs.getString("title"), 28), rs.getInt("total_copies"), rs.getInt("available_copies"),
						rs.getInt("borrowed_copies"), utilization);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showRevenueReport() {
		try {
			System.out.println(CYAN + "\n REVENUE REPORT (FINES)" + RESET);
			System.out.println("════════════════════════════════════════════");

			String sql = "SELECT SUM(fine_amount) as total_fines, "
					+ "SUM(CASE WHEN fine_amount > 0 THEN 1 ELSE 0 END) as members_with_fines, "
					+ "COUNT(*) as total_members " + "FROM members";

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();

			System.out.println(YELLOW + "Fines Summary:" + RESET);
			System.out.println("  Total Fines Due: " + RED + "₹" + rs.getDouble("total_fines") + RESET);
			System.out.println("  Members with Fines: " + RED + rs.getInt("members_with_fines") + "/"
					+ rs.getInt("total_members") + RESET);

			// Monthly fines
			System.out.println(YELLOW + "\nMonthly Fines Collection:" + RESET);
			String monthlySql = "SELECT MONTH(return_date) as month, SUM(fine_amount) as monthly_fines "
					+ "FROM borrowings WHERE fine_amount > 0 AND YEAR(return_date) = YEAR(CURDATE()) "
					+ "GROUP BY MONTH(return_date) ORDER BY month";

			ResultSet monthlyRs = stmt.executeQuery(monthlySql);

			String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

			boolean found = false;
			while (monthlyRs.next()) {
				found = true;
				int month = monthlyRs.getInt("month");
				double fines = monthlyRs.getDouble("monthly_fines");

				System.out.printf("  %s: " + RED + "₹%.2f" + RESET + "\n", months[month - 1], fines);
			}

			if (!found) {
				System.out.println(GREEN + "  No fines collected this year!" + RESET);
			}
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void showReservationMenu() {
		System.out.println(CYAN + "\n BOOK RESERVATIONS" + RESET);
		System.out.println("════════════════════════");
		System.out.println("This feature is under development!");
	}

	private static void showFineMenu() {
		System.out.println(CYAN + "\n FINE MANAGEMENT" + RESET);
		System.out.println("══════════════════════");
		System.out.println("This feature is under development!");
	}

	private static void showSearchMenu() {
		while (true) {
			clearScreen();
			System.out.println(BLUE + "╔════════════════════════════════════════╗" + RESET);
			System.out.println(
					BLUE + "║         " + BOLD + "SEARCH OPTIONS" + RESET + BLUE + "                 ║" + RESET);
			System.out.println(BLUE + "╠════════════════════════════════════════╣" + RESET);
			System.out.println(GREEN + "║ 1. Search Books by Title" + RESET + BLUE + "              ║" + RESET);
			System.out.println(GREEN + "║ 2. Search Books by Author" + RESET + BLUE + "             ║" + RESET);
			System.out.println(GREEN + "║ 3. Search Books by Genre" + RESET + BLUE + "              ║" + RESET);
			System.out.println(GREEN + "║ 4. Search Members by Name" + RESET + BLUE + "             ║" + RESET);
			System.out.println(GREEN + "║ 5. Advanced Book Search" + RESET + BLUE + "               ║" + RESET);
			System.out.println(GREEN + "║ 6. Filter Available Books" + RESET + BLUE + "             ║" + RESET);
			System.out.println(RED + "║ 0. Back to Main Menu" + RESET + BLUE + "                ║" + RESET);
			System.out.println(BLUE + "╚════════════════════════════════════════╝" + RESET);

			System.out.print(YELLOW + "\nEnter your choice: " + RESET);
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> searchBooksByTitle();
			case 2 -> searchBooksByAuthor();
			case 3 -> searchBooksByGenre();
			case 4 -> searchMembersByName();
			case 5 -> advancedBookSearch();
			case 6 -> filterAvailableBooks();
			case 0 -> {
				return;
			}
			default -> System.out.println(RED + "Invalid choice!" + RESET);
			}
			pause();
		}
	}

	private static void searchBooksByTitle() {
		try {
			System.out.print("Enter book title (or part of it): ");
			String title = scanner.nextLine();

			String sql = "SELECT * FROM books WHERE title LIKE ? ORDER BY title";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "%" + title + "%");

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n🔍 SEARCH RESULTS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				if (!found) {
					System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title",
							"Author", "Genre", "Year", "Available", "Total");
					found = true;
				}

				String availableColor = rs.getInt("available_copies") > 0 ? GREEN : RED;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + availableColor + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(RED + "No books found!" + RESET);
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void searchBooksByAuthor() {
		try {
			System.out.print("Enter author name (or part of it): ");
			String author = scanner.nextLine();

			String sql = "SELECT * FROM books WHERE author LIKE ? ORDER BY title";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "%" + author + "%");

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n SEARCH RESULTS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				if (!found) {
					System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title",
							"Author", "Genre", "Year", "Available", "Total");
					found = true;
				}

				String availableColor = rs.getInt("available_copies") > 0 ? GREEN : RED;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + availableColor + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(RED + "No books found!" + RESET);
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void searchBooksByGenre() {
		try {
			System.out.print("Enter genre: ");
			String genre = scanner.nextLine();

			String sql = "SELECT * FROM books WHERE genre LIKE ? ORDER BY title";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "%" + genre + "%");

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n SEARCH RESULTS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				if (!found) {
					System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title",
							"Author", "Genre", "Year", "Available", "Total");
					found = true;
				}

				String availableColor = rs.getInt("available_copies") > 0 ? GREEN : RED;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + availableColor + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(RED + "No books found!" + RESET);
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void searchMembersByName() {
		try {
			System.out.print("Enter member name to search: ");
			String name = scanner.nextLine();

			String sql = "SELECT * FROM members WHERE name LIKE ? ORDER BY name";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");

			ResultSet rs = pstmt.executeQuery();

			System.out.println(CYAN + "\n SEARCH RESULTS" + RESET);
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-25s %-25s %-15s %-12s %-10s %-8s\n" + RESET, "ID", "Name", "Email",
					"Phone", "Join Date", "Fine Due", "Status");
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				String statusColor = rs.getBoolean("active_status") ? GREEN : RED;
				String statusText = rs.getBoolean("active_status") ? "Active" : "Inactive";
				String fineColor = rs.getDouble("fine_amount") > 0 ? RED : GREEN;

				System.out.printf(
						"%-5d %-25s %-25s %-15s %-12s " + fineColor + "₹%-11.2f" + RESET + " " + statusColor + "%-8s"
								+ RESET + "\n",
						rs.getInt("member_id"), truncate(rs.getString("name"), 23), truncate(rs.getString("email"), 23),
						rs.getString("phone"), rs.getDate("membership_date"), rs.getDouble("fine_amount"), statusText);
			}

			if (!found) {
				System.out.println(RED + "No members found!" + RESET);
			}
			System.out.println("══════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void advancedBookSearch() {
		try {
			System.out.println(CYAN + "\n ADVANCED BOOK SEARCH" + RESET);
			System.out.println("═══════════════════════════");

			System.out.print("Title (leave empty to skip): ");
			String title = scanner.nextLine();

			System.out.print("Author (leave empty to skip): ");
			String author = scanner.nextLine();

			System.out.print("Genre (leave empty to skip): ");
			String genre = scanner.nextLine();

			System.out.print("Min Publication Year (0 to skip): ");
			int minYear = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Availability (1=Available, 0=Any): ");
			int availableOnly = scanner.nextInt();
			scanner.nextLine();

			StringBuilder sql = new StringBuilder("SELECT * FROM books WHERE 1=1");
			if (!title.isEmpty())
				sql.append(" AND title LIKE ?");
			if (!author.isEmpty())
				sql.append(" AND author LIKE ?");
			if (!genre.isEmpty())
				sql.append(" AND genre LIKE ?");
			if (minYear > 0)
				sql.append(" AND publication_year >= ?");
			if (availableOnly == 1)
				sql.append(" AND available_copies > 0");
			sql.append(" ORDER BY title");

			PreparedStatement pstmt = connection.prepareStatement(sql.toString());
			int paramIndex = 1;
			if (!title.isEmpty())
				pstmt.setString(paramIndex++, "%" + title + "%");
			if (!author.isEmpty())
				pstmt.setString(paramIndex++, "%" + author + "%");
			if (!genre.isEmpty())
				pstmt.setString(paramIndex++, "%" + genre + "%");
			if (minYear > 0)
				pstmt.setInt(paramIndex++, minYear);

			ResultSet rs = pstmt.executeQuery();

			System.out.println("\n" + CYAN + " SEARCH RESULTS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				if (!found) {
					System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title",
							"Author", "Genre", "Year", "Available", "Total");
					found = true;
				}

				String availableColor = rs.getInt("available_copies") > 0 ? GREEN : RED;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + availableColor + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(RED + "No books found matching your criteria!" + RESET);
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	private static void filterAvailableBooks() {
		try {
			String sql = "SELECT * FROM books WHERE available_copies > 0 ORDER BY title";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(CYAN + "\n AVAILABLE BOOKS" + RESET);
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
			System.out.printf(YELLOW + "%-5s %-30s %-20s %-15s %-10s %-10s %-10s\n" + RESET, "ID", "Title", "Author",
					"Genre", "Year", "Available", "Total");
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");

			boolean found = false;
			while (rs.next()) {
				found = true;
				System.out.printf("%-5d %-30s %-20s %-15s %-10d " + GREEN + "%-10d" + RESET + " %-10d\n",
						rs.getInt("book_id"), truncate(rs.getString("title"), 28), truncate(rs.getString("author"), 18),
						truncate(rs.getString("genre"), 13), rs.getInt("publication_year"),
						rs.getInt("available_copies"), rs.getInt("total_copies"));
			}

			if (!found) {
				System.out.println(RED + "No books available!" + RESET);
			}
			System.out.println(
					"════════════════════════════════════════════════════════════════════════════════════════");
		} catch (SQLException e) {
			System.out.println(RED + "Error: " + e.getMessage() + RESET);
		}
	}

	// Additional helper methods
	private static String truncate(String str, int length) {
		return str.length() > length ? str.substring(0, length - 3) + "..." : str;
	}

	private static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	private static void pause() {
		System.out.print(YELLOW + "\nPress Enter to continue..." + RESET);
		scanner.nextLine();
	}
}