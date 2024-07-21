package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        PreparedStatement ps = con.prepareStatement("insert into game values(?,?,?,?,?,?);");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id: ");
        int id = sc.nextInt();
        System.out.println("enter username: ");
        String username = sc.next();
        int chance =3;
        String userno = "";
        int score=0;
        String sys_gen="";
        int max=9;
        int min =0;
        LocalDateTime time = LocalDateTime.now();

       while (chance!=0)
        {
            System.out.println("enter user num: ");
            int num1 = sc.nextInt();
            double num2= (int)(Math.random()*(max-min+1)+min);
            System.out.println(num2);
            if (num1==num2)
            {
                score+=10;
            }
            else
            {
                chance--;
            }
            userno= userno+num1+" ";
            sys_gen= sys_gen+(int)num2+" ";
        }

       String time1 = time+"";
        ps.setInt(1,id);
        ps.setString(2,username);
        ps.setString(3,sys_gen);
        ps.setString(4,userno);
        ps.setInt(5,score);
        ps.setString(6,time1);
        ps.execute();
    }
}
