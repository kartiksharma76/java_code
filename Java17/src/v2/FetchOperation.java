package com.jdbc.operation.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchOperation {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getMysqlConnection();
			// step3. prepare the SQL statement
			String quary = "select * from student";
			// step4. create the JDBC statement using connection
			statement = connection.createStatement();
			// step5. submit the SQL statement using JDBC statement
			resultSet = statement.executeQuery(quary);
			// step6. process the result
			if (resultSet != null) {
				while (resultSet.next()) {
					System.out
							.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
				}
			}
			// step7. close the resources
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeResource(statement, connection, resultSet);
		}
	}
}
