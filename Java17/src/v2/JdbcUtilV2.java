package com.jdbc.operation.v2;

import java.util.ResourceBundle;

public class JdbcUtilV2 {
	  public static void main(String[] args) {
	        ResourceBundle rb = ResourceBundle.getBundle("database.property");
	        System.out.println(rb.getString("database.driverclass"));
	    }
}
