package com.jdbc.myAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1: Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2: Establish the connection
		String url = "jdbc:mysql://localhost:3306/clintMaster"; 
		Connection connection = DriverManager.getConnection(url, "root", "Kartik@2005");

		// Step 3: Prepare the SQL statement
		String query = "INSERT INTO ClintMaster (client_no, name, address1, address2, city, state,pincode,bal_due) "
				+ "VALUES ('1', 'Ivan', 'A-1', 'film city', 'Bombay', 'Maharashtra', 400054, 15000)";

		// Step 4: Create the JDBC statement
		Statement statement = connection.createStatement();

		// Step 5: Submit the SQL statement
		int record = statement.executeUpdate(query);

		// Step 6: Process the result
		if (record == 1) {
			System.out.println("Record inserted successfully");
		} else {
			System.out.println("Failed to insert record");
		}

		// Step 7: Close the resources
		statement.close();
		connection.close();
	}
}
