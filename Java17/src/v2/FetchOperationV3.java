package com.jdbc.operation.v2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchOperationV3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// step 1)Load the driver
		String query = "select * from student";

		try (Connection connection = JdbcUtilV21.getDataBaseConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query);) {
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
