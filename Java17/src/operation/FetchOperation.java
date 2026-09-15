package com.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step1. load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step2. Establish the connection between JDBC program and database
		String url = "jdbc:mysql://localhost:3306/test ";
		Connection connection = DriverManager.getConnection(url, "root", "Kartik@2005");
		// step3. prepare the SQL statement
		String quary = "select * from student";
		// step4. create the JDBC statement using connection
		Statement statement = connection.createStatement();
		// step5. submit the SQL statement using JDBC statement
		ResultSet resultSet = statement.executeQuery(quary);
		// step6. process the result
		if (resultSet != null) {
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
			}
		}
//		System.out.println("**********");
//		if (resultSet != null) {
//			while (resultSet.next()) {
//				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
//			}
//		}
//		resultSet.next();
		// step7. close the resources
		connection.close();
		statement.close();
		resultSet.close();
	}
}
