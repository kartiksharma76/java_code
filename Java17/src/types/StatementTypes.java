package com.jdbc.statement.types;

import comjdbcpractice.Student;

public class StatementTypes {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setRollnumber(111);
		stu.setName("Kaushal");
		stu.setCollage("IIT BHU");
//	JdbcOperation.insert(stu);
//	JdbcOperation.update(stu);
//	JdbcOperation.deleteByRollNumber(14);
//JdbcOperation.fetchAll();
		JdbcOperation.fetchByRollNumber(111);  
	}
}
