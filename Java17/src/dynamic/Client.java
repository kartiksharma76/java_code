package com.jdbc.operation.dynamic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import comjdbcpractice.Student;

public class Client {
public static void main(String[] args) throws SQLException {
	JdbcOperation jdbcOperation=new JdbcOperation();
	List<Student>list = jdbcOperation.fetchAll();
	list.forEach(s->{
		System.out.println(s.getRollnumber()+" "+s.getName()+" "+s.getCollage());
	});
	
	
}
}
