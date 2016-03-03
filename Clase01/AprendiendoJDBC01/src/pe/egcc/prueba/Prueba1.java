package pe.egcc.prueba;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Prueba1 {
    public static void main(String[] args) {
         Connection cn = null;

        try {
            // Paso 1: Cargar el driver a memoria 
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            // Paso 2: Obtener el objeto Connection 
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            cn = DriverManager.getConnection(url, "eureka", "admin");
            //Mensaje
            System.out.println("Conexon ok");
            //Cerrar conexion
            cn.close();
            System.out.println("Conexion cerrada.");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());;
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el driver de la base de datos.");
        } catch (Exception e) {
            System.err.println("No se puede...");
        }
    }
}
