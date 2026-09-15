package com.jdbc.operation.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchOperationV2 {
	public static void main(String[] args) {
		// step3. prepare the SQL statement
		String quary = "select * from student";
		try (Connection connection = JdbcUtil.getMysqlConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(quary)) {

			// step6. process the result
			if (resultSet != null) {
				while (resultSet.next()) {
					System.out
							.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
