/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;
import javax.swing.ImageIcon;
/**
 *
 * @author Diego
 */
public class MDI_Sistema extends javax.swing.JFrame {
    

    /**
     * Creates new form MDI_Seguridad
     */
    public MDI_Sistema() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotelero");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem4.setText("Cerrar Sesión");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Hotelería");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Comercial");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Finanzas");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Seguridad");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenu6.setText("Asignaciones");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem1.setText("Aplicaciones - Usuario");
        jMenu6.add(jMenuItem1);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem5.setText("Aplicaciones - Perfiles");
        jMenu6.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem6.setText("Perfiles - Usuarios");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem7.setText("Aplicaciones - Módulos");
        jMenu6.add(jMenuItem7);

        jMenu2.add(jMenu6);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem2.setText("Bitácora");
        jMenu2.add(jMenuItem2);

        jMenu8.setText("Mantenimientos");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem3.setText("Usuarios");
        jMenu8.add(jMenuItem3);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem8.setText("Aplicaciones");
        jMenu8.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem9.setText("Perfiles");
        jMenu8.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem10.setText("Módulos");
        jMenu8.add(jMenuItem10);

        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
                new MDI_Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
