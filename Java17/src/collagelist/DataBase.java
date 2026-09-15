package com.jdbc.collagelist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    // 1. Load MySQL driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 2. Establish connection
    public static Connection getMysqlConnection() {
        String url = "jdbc:mysql://localhost:3306/collage";   // FIXED: removed space
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, "root", "Kartik@2005");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    // 3. Close resources (Statement + Connection)
    public static void closeResource(Statement st, Connection con) {
        try {
            if (st != null)
                st.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4. Close resources (Statement + Connection + ResultSet)
    public static void closeResource(Statement st, Connection con, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
            if (st != null)
                st.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
