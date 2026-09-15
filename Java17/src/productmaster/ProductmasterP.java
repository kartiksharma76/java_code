package com.jdbc.productmaster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductmasterP {
	public static void insert(ProductMaster master) {
		String query = "INSERT INTO ProductMaster  (product_no,    description ,  profit_percent,  unit_measure, qty_on_hand,  reoder_lvl, sell_price, cost_price ) VALUES (?, ?, ?, ?, ?, ?,?,?) ";
		try (Connection connection = JdbcUtilProductMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {
			ps.setString(1, master.getProduct_no());
			ps.setString(2, master.getDescription());
			ps.setInt(3, master.getPercent());
			ps.setString(4, master.getUnit_measure());
			ps.setInt(5, master.getQty_on_hand());
			ps.setInt(6, master.getReoder_lvl());
			ps.setInt(7, master.getSell_price());
			ps.setDouble(8, master.getCost_price());
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

	public static void update(ProductMaster master) {
		String query = "UPDATE ProductMaster SET description=?, profit_percent=?, unit_measure=?, qty_on_hand=?, reoder_lvl=?, sell_price=?, cost_price=? "
				+ "WHERE product_no=?";

		try (Connection connection = JdbcUtilProductMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, master.getDescription());
			ps.setInt(2, master.getPercent());
			ps.setString(3, master.getUnit_measure());
			ps.setInt(4, master.getQty_on_hand());
			ps.setInt(5, master.getReoder_lvl());
			ps.setInt(6, master.getSell_price());
			ps.setDouble(7, master.getCost_price());
			ps.setString(8, master.getProduct_no());

			int record = ps.executeUpdate();
			System.out.println(record == 1 ? "Product updated" : "Product not updated");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteProduct(String productNo) {
		String query = "DELETE FROM ProductMaster WHERE product_no=?";

		try (Connection connection = JdbcUtilProductMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, productNo);
			int record = ps.executeUpdate();
			System.out.println(record >= 1 ? record + " product(s) deleted" : "Product not deleted");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchAllProducts() {
		String query = "SELECT * FROM ProductMaster";

		try (Connection connection = JdbcUtilProductMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				System.out.println(rs.getString("product_no") + " | " + rs.getString("description") + " | "
						+ rs.getInt("profit_percent") + " | " + rs.getString("unit_measure") + " | "
						+ rs.getInt("qty_on_hand") + " | " + rs.getInt("reoder_lvl") + " | " + rs.getInt("sell_price")
						+ " | " + rs.getDouble("cost_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void fetchProductno(String productNo) {
		String query = "SELECT * FROM ProductMaster WHERE product_no=?";

		try (Connection connection = JdbcUtilProductMaster.getMysqlConnection();
				PreparedStatement ps = connection.prepareStatement(query)) {

			ps.setString(1, productNo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("product_no") + " | " + rs.getString("description") + " | "
						+ rs.getInt("profit_percent") + " | " + rs.getString("unit_measure") + " | "
						+ rs.getInt("qty_on_hand") + " | " + rs.getInt("reoder_lvl") + " | " + rs.getInt("sell_price")
						+ " | " + rs.getDouble("cost_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
