package com.jspider.jdbc;

import javax.management.MBeanAttributeInfo;
import java.sql.*;
import java.util.Scanner;

public class SmallProjectOfJDBC {
    public static void main(String[] args) throws Exception // SQLException, ClassNotFoundException
    {
        System.out.println("1. create table"+"\n"+"2. insert data"+"\n"+"3. update data"+"\n"+"4. fetch data"+"\n"+"5. delete data"+"\n"+"6. fetch all data");
        Scanner sc = new Scanner(System.in);
        System.out.println("input:-");
        int num = sc.nextInt();
        switch (num)
        {
            case 1: createTable();
            break;
            case 2: insertData();
            break;
            case 3: update();
            break;
            case 4: fetchData();
            break;
            case 5: delete();
            break;
            case 6: fatchAllData();
            break;
            default:
                System.out.println("invalid input");
        }
    }

    static void createTable() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","root");
        Statement statement = connection.createStatement();
        statement.execute("create table student(id int primary key, name varchar(20),age int );");
    }
    static void insertData() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
        Statement statement = connection.createStatement();
        statement.execute("insert into student values(101,'savan',10);");
    }
    static void update() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/colla3ge","root","root");
        Statement statement = connection.createStatement();
       PreparedStatement ps = connection.prepareStatement("update student set name='rahul' where id =101");
       ps.execute();
        //statement.execute("update student set name = 'santosh' where id =101");
    }
    static void fatchAllData() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
        }
    }
    static void fetchData() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while (rs.next())
        {
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
        }
    }


    static void delete() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
        Statement statement = connection.createStatement();
        statement.execute("delete from student where id =101");
    }
}
