package com.jdbc.railways;

import java.sql.*;

public class DatabaseUtil {

	public static void closeResources(AutoCloseable... resources) {
		for (AutoCloseable resource : resources) {
			if (resource != null) {
				try {
					if (resource instanceof Connection) {
						Connection con = (Connection) resource;
						if (!con.isClosed()) {
							con.setAutoCommit(true); // Reset auto-commit
						}
					}
					resource.close();
				} catch (Exception e) {
					System.err.println("Error closing resource: " + e.getMessage());
				}
			}
		}
	}

	public static boolean tableExists(Connection con, String tableName) throws SQLException {
		DatabaseMetaData meta = con.getMetaData();
		ResultSet rs = meta.getTables(null, null, tableName, new String[] { "TABLE" });
		return rs.next();
	}
}