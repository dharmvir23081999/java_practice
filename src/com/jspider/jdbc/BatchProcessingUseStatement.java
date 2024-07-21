package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingUseStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
        Statement st = con.createStatement();
        st.addBatch("insert into employee values(101,'ram',12,'delhi');");
        st.addBatch("insert into employee values(102,'ram',12,'delhi');");
        st.addBatch("insert into employee values(103,'ram',12,'delhi');");
        st.addBatch("insert into employee values(104,'ram',12,'delhi');");
        st.addBatch("insert into employee values(105,'ram',12,'delhi');");
        //st.execute("insert into employee values(101,'ram',10,'patna');");
        st.executeBatch();
    }
}
