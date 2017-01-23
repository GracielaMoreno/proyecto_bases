/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carolina
 */
public class ConexionBD {
    static Connection conexion = null;
    static Statement st=null;
    static ResultSet rs=null;

    
     public static Connection conectar( ) {
        try {
            
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            System.out.println("Conectado.");
            String connectionUrl = "jdbc:sqlserver://localhost;database=biblioteca;integratedSecurity=true;";
            conexion = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return conexion;
    } 
    
     
     

}
