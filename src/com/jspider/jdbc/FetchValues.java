package com.jspider.jdbc;

import java.sql.*;
import java.util.Scanner;

public class FetchValues {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentproject","root","root");
        Statement st = connection.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id :");
        int id1 = sc.nextInt();
        PreparedStatement ps = connection.prepareStatement("select * from student where id = ?");
        ps.setInt(1,id1);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4)+" "+rs.getInt(5));
        }
    }
}
