package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataDynamically {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","root");
        Scanner sc = new Scanner(System.in);
        System.out.println("inter id :");
        int id = sc.nextInt();
        System.out.println("enter name: ");
        String name = sc.next();
        System.out.println("enter age: ");
        int age = sc.nextInt();
        PreparedStatement ps = connection.prepareStatement("insert into student(id,name,age) values(?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,age);
        ps.execute();
        System.out.println("data inserted");
    }
}
