/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.teamswt301.dirverdatabasedata.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conn=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MyWardrobe;encrypt=true;trustServerCertificate=true;","sa","12345");
        return conn;
    }
}
