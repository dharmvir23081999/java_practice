package com.jspider.jdbc;

import java.sql.*;

public class UpdateAndDelete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        //PreparedStatement ps = connection.prepareStatement("update student set name = 'mohan' where id =104");
//        ps.setString(1,"savan");
//        ps.setString(2,"101");
       // ps.execute();
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("update student set name='savan1' where id =104");
        // Execute the query
        ResultSet rs = stmt.executeQuery("select * from student");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        connection.close();
    }
}
