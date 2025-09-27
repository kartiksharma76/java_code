package com.jdbc.nptl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class W11_P3 {
	public static void main(String[] args) {
		try {
			Connection conn = null;
			Statement stmt = null;
			String DB_URL = "jdbc:sqlite:/tempfs/db";
			System.setProperty("org.sqlite.tmpdir", "/tempfs");
			conn = DriverManager.getConnection(DB_URL);
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
