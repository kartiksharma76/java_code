package com.jdbc.operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
// step1. load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
// step2. Establish the connection between JDBC program and database
		String url = "jdbc:mysql://localhost:3306/test ";
		Connection connection = DriverManager.getConnection(url, "root", "Kartik@2005");
// step3. prepare the SQL statement
		String quary = "insert into student values(13,'KEERTAN','SIRT')";
// step4. create the JDBC statement using connection
		Statement statement = connection.createStatement();
// step5. submit the SQL statement using JDBC statement
		int record = statement.executeUpdate(quary);
// step6. process the result
		if (record == 1) {
			System.out.println("record inserted");
		} else {
			System.out.println("record inserted");
		}
// step7. close the resources
		connection.close();
		statement.close();
	}
}
