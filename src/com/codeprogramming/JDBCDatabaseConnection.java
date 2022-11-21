package com.codeprogramming;

import java.sql.*;

public class JDBCDatabaseConnection {
    public static void main(String[] args){
        try {
            Class.forName("Oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","oracle");
            PreparedStatement stmt= con.prepareStatement("Insert into Emp values(?,?");
            stmt.setInt(1,101);
            stmt.setString(2,"Preeti");
            int i=stmt.executeUpdate();
                System.out.println(i+ " records inserted");
            con.close();
        }
        catch (Exception e){
            System.out.println("Exception is : " + e);
        }
    }
}
