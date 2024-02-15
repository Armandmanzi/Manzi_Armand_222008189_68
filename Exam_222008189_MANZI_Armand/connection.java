/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_login_registration;
import java.sql.*;

/**
 *
 * @author USER
 */
public class connection {
    static final String DB_URL = "jdbc:mysql://localhost/clients";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connect_db(){
        Connection conn = null ;
        try{
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }
        catch(Exception ex){
            System.out.println("error");
            return null;    
        }
    } 
    
    
}
