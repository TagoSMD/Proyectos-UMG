package seguridad.vista;

import seguridad.dominio.Usuario;
import seguridad.datos.UsuarioDAO;
import javax.swing.ImageIcon;


import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Diego Vásquez
 */

public class MDI_Sistema extends javax.swing.JFrame {

    private Mantenimiento_Modulos formMantenimiento_Modulo;
    private Mantenimiento_Aplicacion formMantenimiento_Aplicacion;

    /**
     * Creates new form MDI_Seguridad
     *
     * @throws java.net.UnknownHostException
     */
    MDI_Components mdi_components = new MDI_Components();

    public MDI_Sistema() throws UnknownHostException {
        initComponents();
        this.setTitle("Usuario: " + "[" + "]" + " \t" + "IP: [" + mdi_components.getIp() + "]");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPane_Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu_Archivo = new javax.swing.JMenu();
        JMenuItem_CerrarSesion = new javax.swing.JMenuItem();
        JMenu_Hoteleria = new javax.swing.JMenu();
        JMenu_Comercial = new javax.swing.JMenu();
        JMenu_Finanzas = new javax.swing.JMenu();
        JMenu_Seguridad = new javax.swing.JMenu();
        JMenu_Asignaciones = new javax.swing.JMenu();
        JMenuItem_ApU = new javax.swing.JMenuItem();
        JMenuItem_ApP = new javax.swing.JMenuItem();
        JMenuItem_PU = new javax.swing.JMenuItem();
        JMenuItem_ApM = new javax.swing.JMenuItem();
        JMenuItem_Bitacora = new javax.swing.JMenuItem();
        JMenu_Mantenimientos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotelero");
        setResizable(false);

        JDesktopPane_Escritorio.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout JDesktopPane_EscritorioLayout = new javax.swing.GroupLayout(JDesktopPane_Escritorio);
        JDesktopPane_Escritorio.setLayout(JDesktopPane_EscritorioLayout);
        JDesktopPane_EscritorioLayout.setHorizontalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        JDesktopPane_EscritorioLayout.setVerticalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        JMenu_Archivo.setText("Archivo");
        JMenu_Archivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_CerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_CerrarSesion.setText("Cerrar Sesión");
        JMenuItem_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_CerrarSesionActionPerformed(evt);
            }
        });
        JMenu_Archivo.add(JMenuItem_CerrarSesion);

        jMenuBar1.add(JMenu_Archivo);

        JMenu_Hoteleria.setText("Hotelería");
        JMenu_Hoteleria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(JMenu_Hoteleria);

        JMenu_Comercial.setText("Comercial");
        JMenu_Comercial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(JMenu_Comercial);

        JMenu_Finanzas.setText("Finanzas");
        JMenu_Finanzas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(JMenu_Finanzas);

        JMenu_Seguridad.setText("Seguridad");
        JMenu_Seguridad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenu_Asignaciones.setText("Asignaciones");
        JMenu_Asignaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_ApU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_ApU.setText("Aplicaciones - Usuario");
        JMenu_Asignaciones.add(JMenuItem_ApU);

        JMenuItem_ApP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_ApP.setText("Aplicaciones - Perfiles");
        JMenu_Asignaciones.add(JMenuItem_ApP);

        JMenuItem_PU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_PU.setText("Perfiles - Usuarios");
        JMenu_Asignaciones.add(JMenuItem_PU);

        JMenuItem_ApM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_ApM.setText("Aplicaciones - Módulos");
        JMenu_Asignaciones.add(JMenuItem_ApM);

        JMenu_Seguridad.add(JMenu_Asignaciones);

        JMenuItem_Bitacora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Bitacora.setText("Bitácora");
        JMenu_Seguridad.add(JMenuItem_Bitacora);


        /*jMenu8.setText("Mantenimientos");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });*/

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem3.setText("Usuarios");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        //jMenu8.add(jMenuItem3);

        JMenu_Mantenimientos.setText("Mantenimientos");
        JMenu_Mantenimientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem3.setText("Usuarios");
        JMenu_Mantenimientos.add(jMenuItem3);


        jMenuItem8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem8.setText("Aplicaciones");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem9.setText("Perfiles");
        JMenu_Mantenimientos.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem10.setText("Módulos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });

        JMenu_Mantenimientos.add(jMenuItem10);

        JMenu_Seguridad.add(JMenu_Mantenimientos);

        jMenuBar1.add(JMenu_Seguridad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(JDesktopPane_Escritorio)

            .addComponent(JDesktopPane_Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)

        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Mantenimiento_Usuario v = new Mantenimiento_Usuario();
    JDesktopPane_Escritorio.add(v);
    v.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    private void JMenuItem_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_CerrarSesionActionPerformed
        /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_JMenuItem_CerrarSesionActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        formMantenimiento_Modulo = new Mantenimiento_Modulos();
      JDesktopPane_Escritorio.add(formMantenimiento_Modulo);
      

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        formMantenimiento_Aplicacion = new Mantenimiento_Aplicacion();
        JDesktopPane_Escritorio.add(formMantenimiento_Aplicacion);
    }//GEN-LAST:event_jMenuItem8ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDI_Sistema().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDI_Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane_Escritorio;
    private javax.swing.JMenuItem JMenuItem_ApM;
    private javax.swing.JMenuItem JMenuItem_ApP;
    private javax.swing.JMenuItem JMenuItem_ApU;
    private javax.swing.JMenuItem JMenuItem_Bitacora;
    private javax.swing.JMenuItem JMenuItem_CerrarSesion;
    private javax.swing.JMenuItem JMenuItem_PU;
    private javax.swing.JMenu JMenu_Archivo;
    private javax.swing.JMenu JMenu_Asignaciones;
    private javax.swing.JMenu JMenu_Comercial;
    private javax.swing.JMenu JMenu_Finanzas;
    private javax.swing.JMenu JMenu_Hoteleria;
    private javax.swing.JMenu JMenu_Mantenimientos;
    private javax.swing.JMenu JMenu_Seguridad;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
