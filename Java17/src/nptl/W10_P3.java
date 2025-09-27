package com.jdbc.nptl;

public class W10_P3 {
	public static void main(String[] args) {
		 String sql = "INSERT INTO students (id, name) VALUES (1, 'Alice');";

		 if (sql.equals("INSERT INTO students (id, name) VALUES (1, 'Alice');")) {
	            System.out.println("insert statement ready");
	        } else {
	            System.out.println("incorrect statement");
	        }
	}
}
