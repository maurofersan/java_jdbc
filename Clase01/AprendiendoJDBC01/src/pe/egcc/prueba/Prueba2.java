package pe.egcc.prueba;



import java.sql.Connection;
import java.sql.Statement;
import pe.egcc.db.AccesoDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumno
 */
public class Prueba2 {

    public static void main(String[] args) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            System.out.println("Conexion ok");

            String sql = "insert into parametro(CHR_PARACODIGO,"
                    + "VCH_PARADESCRIPCION,VCH_PARAVALOR,"
                    + "VCH_PARAESTADO) values('777', 'PROFESOR', 'GUSTAVO CORONEL',"
                    + "ACTIVO)";

            Statement stm = cn.createStatement();
            stm.executeUpdate(sql);
            System.out.println("Parameto registrado.");

            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }finally{
            try{
            cn.close();
            System.out.println("Conexion cerrada");
            }catch (Exception e){
                    
            }
        }
    }
}
