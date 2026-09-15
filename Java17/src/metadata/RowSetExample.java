package com.jdbc.metadata;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
	  public static void main(String[] args) throws SQLException {

	        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

	        rowSet.setUrl("jdbc:mysql://localhost:3306/test");
	        rowSet.setUsername("root");
	        rowSet.setPassword("Kartik@2005");

	        // Make result set scrollable and updatable
	           rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);
	          rowSet.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
	   		String query="SELECT roll_number, stu_name, collage FROM student";
	   		rowSet.setCommand(query);
	   		rowSet.execute();
	   		while(rowSet.next()) {
	   			System.out.println(rowSet.getInt("roll_number")+" "+rowSet.getString("stu_name")+
	   					" "+rowSet.getString("collage"));
	   		}
	   		System.out.println("***********");
	   		while(rowSet.next()) {
	   			System.out.println(rowSet.getInt("roll_number")+" "+rowSet.getString("stu_name")+
	   					" "+rowSet.getString("collage"));
	   		}
	   		
	   		rowSet.absolute(3);
	   		System.out.println(rowSet.getInt("roll_number")+" "+rowSet.getString("stu_name")+
	   				" "+rowSet.getString("collage"));
	   		
	   		rowSet.updateString("stu_name","Tulsi");
	   		rowSet.updateString("collage","IIT Patna");
	   		rowSet.updateInt("roll_number",222);
	   		rowSet.updateRow();
	   		rowSet.absolute(3);
	   		System.out.println("***************");
	   		System.out.println(rowSet.getInt("roll_number")+" "+rowSet.getString("stu_name")+
	   				" "+rowSet.getString("collage"));
}
}