/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author diogo
 */
public class LigacaoBD {
    protected Connection connection = null;
    protected Statement statement;
    
    public LigacaoBD() throws ClassNotFoundException {
         // load the sqlite-JDBC driver using the current class loader     
        Class.forName("org.sqlite.JDBC");
  
        try {       // create a database connection       
            connection = DriverManager.getConnection("jdbc:sqlite:das1617.db");
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec. 
            ResultSet rs = statement.executeQuery("SELECT count(*) as n FROM table");
            if (rs.getInt("n")==0){
                statement.executeUpdate("drop table if exists users");
            }
            
            statement.executeUpdate("create table users (id integer, name string)");
           // statement.executeUpdate("insert into person values(1, 'leo')");
           // statement.executeUpdate("insert into person values(2, 'yui')");
            
        } catch (SQLException e) {
            // if the error message is "out of memory",        
            // it probably means no database file is found       
            System.err.println(e.getMessage());
        } 
    }
}
