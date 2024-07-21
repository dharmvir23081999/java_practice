package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class LoadAndRegisterDriver {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
        Statement st = connection1.createStatement();
        st.execute("create database university");

        System.out.println("done");
    }
}
