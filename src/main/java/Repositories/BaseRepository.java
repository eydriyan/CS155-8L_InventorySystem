/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public abstract class BaseRepository {
    private final String USERNAME = "sql12593192";
    private final String PASSWORD = "a6Hb4xhCXz";
    private final String LINK = "jdbc:mysql://sql12.freemysqlhosting.net:3306?useTimezone=true&serverTimezone=GMT%2B8";
    private final String CONNECTOR = "com.mysql.cj.jdbc.Driver";
    
    protected Connection createSQLConnection() throws Exception {
        Class.forName(CONNECTOR);
        
        Connection sql_con = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            
        Statement SetDB = sql_con.createStatement();
        SetDB.executeUpdate("USE sql12593192");
            
        return sql_con;
    }
}
