package com.jdbc.operation.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JdbcUtilV21 {
	private static final String DRIVER_CLASS;
	private static final String URL;
	private static final String USER;
	private static final String PASSWORD;

	static {
		ResourceBundle rb = ResourceBundle.getBundle("database");// to access from file database.properties
		DRIVER_CLASS = rb.getString("database.driverclass");
		URL = rb.getString("database.url");
		USER = rb.getString("database.user");
		PASSWORD = rb.getString("database.password");

		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private JdbcUtilV21() {
		throw new IllegalArgumentException();
	}

	public static Connection getDataBaseConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	// 3)Close the resources
	public static void closeResource(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void closeResource(Statement st, Connection con, ResultSet rs) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
