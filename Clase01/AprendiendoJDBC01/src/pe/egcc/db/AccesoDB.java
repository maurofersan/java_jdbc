/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public final class AccesoDB {
    
    private AccesoDB(){
  
    }
    public static Connection getConnection() throws SQLException{
        
    
     Connection cn = null;

        try {
            // Paso 1: Cargar el driver a memoria 
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            // Paso 2: Obtener el objeto Connection 
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            cn = DriverManager.getConnection(url, "eureka", "admin");
           
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());;
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el driver de la base de datos.");
        } catch (Exception e) {
            System.err.println("No se puede...");
        }
        return cn;
    }
}
