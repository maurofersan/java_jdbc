/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.egcc.db.AccesoDB;

public class Prueba3 {

    public static void main(String[] args) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select  CHR_CLIECODIGO,"
                    + "VCH_CLIEPATERNO, VCH_CLIEMATERNO,"
                    + "VCH_CLIENOMBRE, CHR_CLIEDNI "
                    + "from cliente "
                    + "where vch_cliepaterno like ? "
                    + "and vch_cliematerno like ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, "A%");
            pstm.setString(2, "%");
            ResultSet rs = pstm.executeQuery();
            System.out.println("LISTA DE CLIENTES");
            while (rs.next()) {
                String codigo = rs.getString("CHR_CLIECODIGO");
                String paterno = rs.getString("VCH_CLIEPATERNO");
                String materno = rs.getString("VCH_CLIEMATERNO");
                String nombre = rs.getString("VCH_CLIENOMBRE");
                String dni = rs.getString("CHR_CLIEDNI");
                System.out.println(codigo + "|" + paterno + "|" + materno +
                        "|" + nombre + "|" + dni);
            }
            rs.close();
            pstm.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}