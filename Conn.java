package Attendance.Management.System;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    Conn(){

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///imit-mca-attendance", "root", "2002");
            s = c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}