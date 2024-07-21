package com.jspider.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            //1. Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            ///Driver driver = new Driver();
            // 2. create the connection object, to create a connection provide the URL, username and password.
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dharmvir", "root", "root");
            // Create the Statement object.
            Statement stmt = connection.createStatement();
            // Execute the query
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            connection.close();
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }
}
