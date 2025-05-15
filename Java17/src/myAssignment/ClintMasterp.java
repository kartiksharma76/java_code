package com.jdbc.myAssignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClintMasterp {
	public static void insert(ClintMaster master) {
		String query = "INSERT INTO ClintMaster (client_no, name, address1, address2, city, state,pincode,bal_due) VALUES (?, ?, ?, ?, ?, ?,?,?) ";
		try (Connection connection = JdbcUtilClintMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, master.getClint_no());
			ps.setString(2, master.getName());
			ps.setString(3, master.getAddress1());
			ps.setString(4, master.getAddress2());
			ps.setString(5, master.getCity());
			ps.setString(6, master.getState());
			ps.setInt(7, master.getPincode());
			ps.setDouble(8, master.getBal_due());
			int record = ps.executeUpdate();
			if (record == 1) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update(ClintMaster master) {
		String query = "UPDATE ClintMaster SET name=?, address1=?, address2=?, city=?, state=?, pincode=?, bal_due=? WHERE client_no=?";

		try (Connection connection = JdbcUtilClintMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, master.getName());
			ps.setString(2, master.getAddress1());
			ps.setString(3, master.getAddress2());
			ps.setString(4, master.getCity());
			ps.setString(5, master.getState());
			ps.setInt(6, master.getPincode());
			ps.setDouble(7, master.getBal_due());
			ps.setString(8, master.getClint_no());

			int record = ps.executeUpdate();
			System.out.println(record == 1 ? "Client updated" : "Client not updated");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteClintMaster(String clientNo) {
		String query = "DELETE FROM ClintMaster WHERE client_no=?";

		try (Connection connection = JdbcUtilClintMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, clientNo);
			int record = ps.executeUpdate();
			System.out.println(record >= 1 ? record + " client(s) deleted" : "Client not deleted");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchAllClients() {
		String query = "SELECT * FROM ClintMaster";

		try (Connection connection = JdbcUtilClintMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				System.out.println(rs.getString("client_no") + " | " + rs.getString("name") + " | "
						+ rs.getString("address1") + " | " + rs.getString("address2") + " | " + rs.getString("city")
						+ " | " + rs.getString("state") + " | " + rs.getInt("pincode") + " | "
						+ rs.getDouble("bal_due"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchClientById(String clientNo) {
		String query = "SELECT * FROM ClintMaster WHERE client_no=?";

		try (Connection connection = JdbcUtilClintMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, clientNo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("client_no") + " | " + rs.getString("name") + " | "
						+ rs.getString("address1") + " | " + rs.getString("address2") + " | " + rs.getString("city")
						+ " | " + rs.getString("state") + " | " + rs.getInt("pincode") + " | "
						+ rs.getDouble("bal_due"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
