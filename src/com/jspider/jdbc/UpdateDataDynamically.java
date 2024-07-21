package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage", "root", "root");
        Scanner sc = new Scanner(System.in);
        System.out.println("inter name :");
        String name = sc.nextLine();
        System.out.println("enter id : ");
        int id  = sc.nextInt();
        PreparedStatement ps = connection.prepareStatement("update student set name=? where id =?");
        ps.setString(1,name);
        ps.setInt(2,id);
        ps.execute();
        System.out.println("data updated");
    }
}
