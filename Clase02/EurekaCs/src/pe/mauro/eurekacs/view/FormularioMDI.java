/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.eurekacs.view;

import javax.swing.JInternalFrame;
import pe.mauro.eurekacs.domain.Empleado;
import pe.mauro.eurekacs.util.Memoria;

/**
 *
 * @author MF
 */
public class FormularioMDI extends javax.swing.JFrame {

    /**
     * Creates new form FormularioMDI
     */
    public FormularioMDI() {
        initComponents();
        establecerTitulo();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private void establecerTitulo(){
        String titulo = "EUREKA APP";
        Empleado emp = (Empleado) Memoria.get("usuario");
        titulo += "[Usuario : " + emp.getUsuario()+ "]";
        titulo += "[Esquema : aaaa ]";
        this.setTitle(titulo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        menuTabla = new javax.swing.JMenu();
        menuTablaClientes = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuReporte = new javax.swing.JMenu();
        menuUtil = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        menuBar.add(menuArchivo);

        menuProceso.setText("Proceso");
        menuBar.add(menuProceso);

        menuTabla.setText("Tabla");

        menuTablaClientes.setText("Clientes");
        menuTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTablaClientesActionPerformed(evt);
            }
        });
        menuTabla.add(menuTablaClientes);

        menuBar.add(menuTabla);

        menuConsulta.setText("Consulta");
        menuBar.add(menuConsulta);

        menuReporte.setText("Reporte");
        menuBar.add(menuReporte);

        menuUtil.setText("Util");
        menuBar.add(menuUtil);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTablaClientesActionPerformed
        cargarFormulario(MantClientesView.class);
    }//GEN-LAST:event_menuTablaClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenu menuReporte;
    private javax.swing.JMenu menuTabla;
    private javax.swing.JMenuItem menuTablaClientes;
    private javax.swing.JMenu menuUtil;
    // End of variables declaration//GEN-END:variables

    private void cargarFormulario(Class<?> aClass) {
        try {
      // Variable
      JInternalFrame view;
      // Buscar instancia
      view = buscarInstancia(aClass);
      // Crear instancia
      if (view == null) {
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
      }
      // Mostrar formulario
      view.setVisible(true);
      view.setSelected(true);
    } catch (Exception e) {
    }
        
    }

    private JInternalFrame buscarInstancia(Class<?> aClass) {
        JInternalFrame view = null;
        for (JInternalFrame form : desktopPane.getAllFrames()) {
            if (aClass.isInstance(form)) {
                view = form;
                break;
            }
        }
        return view;
    }

}
