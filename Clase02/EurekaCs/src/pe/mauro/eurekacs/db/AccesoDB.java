package pe.mauro.eurekacs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Mauro
 */
public final class AccesoDB {

    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {

        Connection cn = null;

        try {
            // Paso 1: Cargar el driver a memoria 
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            // Paso 2: Obtener el objeto Connection 
            String url = "jdbc:oracle:thin:@localhost:49157:orcl";
            cn = DriverManager.getConnection(url, "eureka", "admin");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());;
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el driver de la base de datos.");
        } catch (Exception e) {
            System.err.println("No se puede establecer conexion con la BD.");
        }
        return cn;
    }
}
