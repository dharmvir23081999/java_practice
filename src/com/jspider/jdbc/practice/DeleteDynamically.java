package com.jspider.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDynamically {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","root");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id ");
        int id = sc.nextInt();
        PreparedStatement ps = connection.prepareStatement("delete from student where id =?");
        ps.setInt(1,id);
        ps.execute();
        System.out.println("done");
    }
}
