package com.jspider.jdbc.practice;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
        Statement st = connection.createStatement();
       // st.execute("create database hospital");
       // st.execute("create table patient(id int,name varchar(20),age int,gender varchar(10),dob date)");
       st.execute("insert into patient values(101,'ramu',20,'male',null)");
        ResultSet rs = st.executeQuery("select * from patient");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+ rs.getInt(3)+"  "+rs.getString(4));
        }
        System.out.println("done");
    }
}
