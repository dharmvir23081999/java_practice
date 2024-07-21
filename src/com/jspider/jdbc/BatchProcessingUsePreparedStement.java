package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessingUsePreparedStement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
        PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
        Scanner sc = new Scanner(System.in);
       for (int i =0;i<2;i++){
           System.out.println("enter id ");
           int id = sc.nextInt();
           System.out.println("enter name ");
           String name = sc.next();
           System.out.println("inter age ");
           int age = sc.nextInt();
           System.out.println("enter address ");
           String address = sc.next();
           ps.setInt(1,id);
           ps.setString(2,name);
           ps.setInt(3,age);
           ps.setString(4,address);

           ps.addBatch();
       }
       ps.executeBatch();


    }
}
