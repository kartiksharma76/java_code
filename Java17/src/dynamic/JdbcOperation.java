package com.jdbc.operation.dynamic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.operation.v2.JdbcUtil;

import comjdbcpractice.Student;

public class JdbcOperation {
//1.insert return type int
//	public int Insert() {
//		String query = "insert into student values(15,'Ishita','SIRT')";
//		int inserted = 0;
//		try (Connection connection = JdbcUtil.getMysqlConnection();
//				Statement statement = connection.createStatement()) {
//			inserted = statement.executeUpdate(query);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return inserted;
//	}

//2.fetch all
	public <T> T fetchAll() {
		String quary = "select * from student";
		List<Student> list = new ArrayList<>();
		try (Connection connection = JdbcUtil.getMysqlConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(quary)) {

			// step6. process the result
			if (resultSet != null) {
				while (resultSet.next()) {
					Student student = new Student();
					student.setRollnumber(resultSet.getInt(1));
					student.setName(resultSet.getString(2));
					student.setCollage(resultSet.getString(3));
					list.add(student);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return (T) list;
	}
//3.fetch by id
//4.delete record using id
//5.update record

}
