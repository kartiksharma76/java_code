package com.jdbc.myprojectpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookService {
	public static void insert(MyBook book) {
		String query = "INSERT INTO mybook (book_id, book_name, author, publicatin, cost, edition) VALUES (?, ?, ?, ?, ?, ?)";
		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, book.getBookId());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPublicatin());
			ps.setInt(5, book.getCost());
			ps.setInt(6, book.getEdition());
			int record = ps.executeUpdate();
			if (record == 1) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update(MyBook book) {
		String query = "UPDATE mybook SET book_name=?, author=?, publicatin=?, cost=?, edition=? WHERE book_id=?";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, book.getBookName());
			preparedStatement.setString(2, book.getAuthor());
			preparedStatement.setString(3, book.getPublicatin());
			preparedStatement.setInt(4, book.getCost());
			preparedStatement.setInt(5, book.getEdition());
			preparedStatement.setString(6, book.getBookId());

			int record = preparedStatement.executeUpdate();
			System.out.println(record == 1 ? "Book updated" : "Book not updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteBook(String bookId) {
		String query = "DELETE FROM mybook WHERE book_id=?";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, bookId);
			int record = preparedStatement.executeUpdate();
			System.out.println(record >= 1 ? record + " book deleted" : "Book not deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchAllBook() {
		String query = "SELECT * FROM mybook";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {
				System.out.println(resultSet.getString("book_id") + " | " + resultSet.getString("book_name") + " | "
						+ resultSet.getString("author") + " | " + resultSet.getString("publicatin") + " | "
						+ resultSet.getInt("cost") + " | " + resultSet.getInt("edition"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchBookByBookId(String bookId) {
		String query = "SELECT * FROM mybook WHERE book_id=?";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, bookId);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getString("book_id") + " | " + resultSet.getString("book_name") + " | "
						+ resultSet.getString("author") + " | " + resultSet.getString("publicatin") + " | "
						+ resultSet.getInt("cost") + " | " + resultSet.getInt("edition"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchBookByAuthor(String author) {
		String query = "SELECT * FROM mybook WHERE author=?";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, author);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getString("book_id") + " | " + resultSet.getString("book_name") + " | "
						+ resultSet.getString("author") + " | " + resultSet.getString("publicatin") + " | "
						+ resultSet.getInt("cost") + " | " + resultSet.getInt("edition"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean verifyUser(String username, String password) {
		String query = "SELECT * FROM user WHERE user_name=? AND password=?";

		try (Connection connection = JdbcUtilMyBook.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			return rs.next(); // returns true if a matching user is found
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
