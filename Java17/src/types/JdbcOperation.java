package com.jdbc.statement.types;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.jdbc.operation.v2.JdbcUtil;

import comjdbcpractice.Student;

public class JdbcOperation {
	public static void insert(Student stu) {
		// step 1)Load the driver
		String query = "insert into student values (?,?,?)";

		try (Connection connection = JdbcUtil.getMysqlConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
//			ResultSetMetaData metaData = preparedStatement.getMetaData();
//			String columnName = metaData.getColumnName(1);
//			System.out.println(metaData.getColumnName(1)+" " + metaData.getColumnName(2)+" " + metaData.getColumnName(3));
			preparedStatement.setInt(1, stu.getRollnumber());
			preparedStatement.setString(2, stu.getName());
			preparedStatement.setString(3, stu.getCollage());
			int record = preparedStatement.executeUpdate();
//			int record = 0;
			if (record == 1) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
	}

	public static void update(Student stu) {
		// step 1)Load the driver
		String query = "update student set stu_name=?,collage=? where roll_number=?";

		try (Connection connection = JdbcUtil.getMysqlConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			preparedStatement.setString(1, stu.getName());
			preparedStatement.setString(2, stu.getCollage());
			preparedStatement.setInt(3, stu.getRollnumber());
			int record = preparedStatement.executeUpdate();
			if (record == 1) {
				System.out.println("Record updated");
			} else {
				System.out.println("Record not updated");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteByRollNumber(int rollNumber) {
		// step 1)Load the driver
		String query = "delete from student where roll_number=?";

		try (Connection connection = JdbcUtil.getMysqlConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			preparedStatement.setInt(1, rollNumber);
			int record = preparedStatement.executeUpdate();
			if (record >= 1) {
				System.out.println(record + " Record deleted");
			} else {
				System.out.println("Record not deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchAll() {
		// step 1)Load the driver
		String query = "select * from student";

		try (Connection connection = JdbcUtil.getMysqlConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery();) {
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

	public static void fetchByRollNumber(int rollNumber) {
		// step 1)Load the driver
		String query = "select roll_number,stu_name,collage from student where roll_number=?";

		try (Connection connection = JdbcUtil.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query);

		) {
			ps.setInt(1, rollNumber);
			ResultSet resultSet = ps.executeQuery();
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
