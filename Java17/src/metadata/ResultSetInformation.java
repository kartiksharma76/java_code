package com.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.operation.v2.JdbcUtil;
/**
 * java.nio.file.Files
getCatalogName
getColumnClassName
getColumnCount
getColumnDisplaySize
getColumnLabel
getColumnName
getColumnType
getColumnTypeName
 */
public class ResultSetInformation {
public static void main(String[] args) throws SQLException {
	Connection connection = JdbcUtil.getMysqlConnection();
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from student");
	ResultSetMetaData metaData = resultSet.getMetaData();
	String catalogName = metaData.getCatalogName(1);
	System.out.println(catalogName);
	System.out.println(metaData.getColumnCount());
	String columnClassName = metaData.getColumnClassName(2);
	System.out.println(columnClassName);
    int columnDisplaySize = metaData.getColumnDisplaySize(3);
    System.out.println(columnDisplaySize);
    String columnLabel = metaData.getColumnLabel(2);
    System.out.println(columnLabel);
    System.out.println(metaData.getColumnName(2));
    
     
	
	
	
}
}
