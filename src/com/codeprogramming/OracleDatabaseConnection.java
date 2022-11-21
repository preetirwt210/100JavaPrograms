package com.codeprogramming;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleDatabaseConnection {
    public static void main(String[] args){
        try {
            Class.forName("Oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","oracle");
            Statement stmt= con.createStatement();
            ResultSet rs= stmt.executeQuery("Select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+ rs.getString(2)+rs.getString(3));
            con.close();
        }
        catch (Exception e){
            System.out.println("Exception is : " + e);
        }
    }
}
