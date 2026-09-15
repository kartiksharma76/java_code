package com.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.jdbc.operation.v2.JdbcUtil;

public class DataBaseInformation {
	public static void main(String[] args) throws SQLException {
		Connection connection = JdbcUtil.getMysqlConnection();
		DatabaseMetaData metaData = connection.getMetaData();
		System.out.println(metaData.getDriverName());
        System.out.println(metaData.getURL());
        System.out.println(metaData.getUserName());
	}
}
