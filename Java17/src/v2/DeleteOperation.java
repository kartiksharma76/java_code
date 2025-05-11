package com.jdbc.operation.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
				Connection connection = JdbcUtil.getMysqlConnection();
		// step3. prepare the SQL statement
				String quary = "delete from student where roll_number=10";
		// step4. create the JDBC statement using connection
				Statement statement = connection.createStatement();
		// step5. submit the SQL statement using JDBC statement
				int record = statement.executeUpdate(quary);
		// step6. process the result
				if (record == 1) {
					System.out.println("record deleted");
				} else {
					System.out.println("record not deleted");
				}
		// step7. close the resources
				JdbcUtil.closeResource(statement, connection);
			
}
}
