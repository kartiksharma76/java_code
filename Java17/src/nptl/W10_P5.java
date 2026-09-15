package com.jdbc.nptl;

public class W10_P5 {
	public static void main(String[] args) {
		  String sql = "UPDATE students SET name = 'Bob' WHERE id = 1;";
		if (sql.equals("UPDATE students SET name = 'Bob' WHERE id = 1;")) {
			System.out.println("update statement ready");
		} else {
			System.out.println("incorrect statement");
		}
	}
}
