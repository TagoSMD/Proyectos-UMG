package Finanzas.vista;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Graphics;
import java.awt.Image;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;
import seguridad.vista.MDI_Components;
import Finanzas.datos.Conexion;
import java.io.File;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/*
    @author Diego Vásquez
 */
public class MDIFinanzas extends javax.swing.JFrame {
    private Transaccion_Bancaria FrmTransacion;
    private FrmTipoTransaccion fmTipo;
    private Mantenimiento_Banco formMantenimiento_Banco;//llamado a la ventana Mantenimiento Banco
    private Mantenimiento_TipoPersona formMantenimiento_TipoPersona;//llamado a la ventana Mantenimiento Tipo Persona
    private Mantenimiento_Moneda formMantenimiento_Moneda;//llamado a la ventana Mantenimiento Moneda 
    private FrmCuentaBancaria FrmBancaria;
    private FrmCuentaHabiente FrmHabiente;
    private Mantenimiento_TipoAsiento FrmTipoAsiento;
    GenerarPermisos permisos = new GenerarPermisos();
    MDI_Components mdi_Components = new MDI_Components();

    
    
    public MDIFinanzas() throws UnknownHostException {
        var modulo_nombre = "Finanzas";
        initComponents();
        this.setTitle("Usuario: " + "[" + Login.usuarioFianzas + "]" + " \t" + "IP: [" + mdi_Components.getIp() + "]");
        permisos.getPermisos(modulo_nombre, Login.usuarioFianzas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopFinanzas = new javax.swing.JDesktopPane()
        ;
        JMenuBarFinanzas = new javax.swing.JMenuBar();
        JMenuArchivo = new javax.swing.JMenu();
        JMenuCerrarSesion = new javax.swing.JMenuItem();
        JMenuCatalogos = new javax.swing.JMenu();
        JMenuCatalogoContabilidad = new javax.swing.JMenu();
        JMenuClasificacionCuentas = new javax.swing.JMenuItem();
        JMenuCuentasContables = new javax.swing.JMenuItem();
        JMenuPeriodoFiscal = new javax.swing.JMenuItem();
        JMenuTipoAsientoContable = new javax.swing.JMenuItem();
        JMenuCatalogoBancos = new javax.swing.JMenu();
        JMenuTipoTransaccion = new javax.swing.JMenuItem();
        JMenuCuentaBancaria = new javax.swing.JMenuItem();
        JMenuCuentahabiente = new javax.swing.JMenuItem();
        JMenuBancos = new javax.swing.JMenuItem();
        JMenuDivisas = new javax.swing.JMenuItem();
        JMenuPersonaBancaria = new javax.swing.JMenuItem();
        JMenuProcesos = new javax.swing.JMenu();
        JMenuItemAsientoContable = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMenuInformes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JMenuHerramientas = new javax.swing.JMenu();
        JMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo Finanzas [ip] [user]");
        setResizable(false);

        JDesktopFinanzas.setBackground(new java.awt.Color(70, 95, 50));

        javax.swing.GroupLayout JDesktopFinanzasLayout = new javax.swing.GroupLayout(JDesktopFinanzas);
        JDesktopFinanzas.setLayout(JDesktopFinanzasLayout);
        JDesktopFinanzasLayout.setHorizontalGroup(
            JDesktopFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        JDesktopFinanzasLayout.setVerticalGroup(
            JDesktopFinanzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        JMenuArchivo.setText("Archivo");
        JMenuArchivo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        JMenuCerrarSesion.setText("Cerrar Sesión");
        JMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCerrarSesionActionPerformed(evt);
            }
        });
        JMenuArchivo.add(JMenuCerrarSesion);

        JMenuBarFinanzas.add(JMenuArchivo);

        JMenuCatalogos.setText("Catálogos");
        JMenuCatalogos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        JMenuCatalogoContabilidad.setText("Catálogos Contabilidad");

        JMenuClasificacionCuentas.setText("Mantenimiento de Clasificación de Cuentas");
        JMenuClasificacionCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuClasificacionCuentasActionPerformed(evt);
            }
        });
        JMenuCatalogoContabilidad.add(JMenuClasificacionCuentas);

        JMenuCuentasContables.setText("Mantenimiento de Cuentas Contables");
        JMenuCuentasContables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCuentasContablesActionPerformed(evt);
            }
        });
        JMenuCatalogoContabilidad.add(JMenuCuentasContables);

        JMenuPeriodoFiscal.setText("Mantenimiento de Periodo Fiscal");
        JMenuPeriodoFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuPeriodoFiscalActionPerformed(evt);
            }
        });
        JMenuCatalogoContabilidad.add(JMenuPeriodoFiscal);

        JMenuTipoAsientoContable.setText("Mantenimiento de Tipo de Asiento Contable");
        JMenuTipoAsientoContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuTipoAsientoContableActionPerformed(evt);
            }
        });
        JMenuCatalogoContabilidad.add(JMenuTipoAsientoContable);

        JMenuCatalogos.add(JMenuCatalogoContabilidad);

        JMenuCatalogoBancos.setText("Catálogos Bancos");

        JMenuTipoTransaccion.setText("Mantenimiento de Tipo de Transacción");
        JMenuTipoTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuTipoTransaccionActionPerformed(evt);
            }
        });
        JMenuCatalogoBancos.add(JMenuTipoTransaccion);

        JMenuCuentaBancaria.setText("Mantenimiento de Cuentas Bancarias");
        JMenuCuentaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCuentaBancariaActionPerformed(evt);
            }
        });
        JMenuCatalogoBancos.add(JMenuCuentaBancaria);

        JMenuCuentahabiente.setText("Mantenimiento de Cuentahabientes");
        JMenuCuentahabiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCuentahabienteActionPerformed(evt);
            }
        });
        JMenuCatalogoBancos.add(JMenuCuentahabiente);

        JMenuBancos.setText("Mantenimiento de Bancos");
        JMenuBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuBancosActionPerformed(evt);
            }
        });
        JMenuCatalogoBancos.add(JMenuBancos);

        JMenuDivisas.setText("Mantenimiento de Divisas");
        JMenuDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuDivisasActionPerformed(evt);
            }
        });
        JMenuCatalogoBancos.add(JMenuDivisas);

        JMenuPersonaBancaria.setText("Mantenimiento de Persona Bancaria");
        JMenuPersonaBancaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuPersonaBancariaActionPerformed(evt);
            }
        });
        JMenuCatalogoBancos.add(JMenuPersonaBancaria);

        JMenuCatalogos.add(JMenuCatalogoBancos);

        JMenuBarFinanzas.add(JMenuCatalogos);

        JMenuProcesos.setText("Procesos");
        JMenuProcesos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        JMenuItemAsientoContable.setText("Asiento Contable");
        JMenuItemAsientoContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAsientoContableActionPerformed(evt);
            }
        });
        JMenuProcesos.add(JMenuItemAsientoContable);

        jMenuItem1.setText("Transaccion Bancaria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMenuProcesos.add(jMenuItem1);

        JMenuBarFinanzas.add(JMenuProcesos);

        JMenuInformes.setText("Informes");
        JMenuInformes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem2.setText("Cuenta Bancaria");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMenuInformes.add(jMenuItem2);

        JMenuBarFinanzas.add(JMenuInformes);

        JMenuHerramientas.setText("Herramientas");
        JMenuHerramientas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        JMenuBarFinanzas.add(JMenuHerramientas);

        JMenuAyuda.setText("Ayuda");
        JMenuAyuda.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        JMenuBarFinanzas.add(JMenuAyuda);

        setJMenuBar(JMenuBarFinanzas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopFinanzas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopFinanzas)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void JMenuCuentasContablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCuentasContablesActionPerformed
        FrmMantCuentaContable frmMantCuentaContable = new FrmMantCuentaContable();
        JDesktopFinanzas.add(frmMantCuentaContable);
        frmMantCuentaContable.setVisible(true);

    }//GEN-LAST:event_JMenuCuentasContablesActionPerformed

    private void JMenuClasificacionCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuClasificacionCuentasActionPerformed
        FrmMantClasificacionCuentas frmMantClasificacionCuentas = new FrmMantClasificacionCuentas();
        JDesktopFinanzas.add(frmMantClasificacionCuentas);
        frmMantClasificacionCuentas.setVisible(true);
    }//GEN-LAST:event_JMenuClasificacionCuentasActionPerformed

    private void JMenuTipoTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuTipoTransaccionActionPerformed
        // TODO add your handling code here:
        fmTipo = new FrmTipoTransaccion();
        JDesktopFinanzas.add(fmTipo);
    }//GEN-LAST:event_JMenuTipoTransaccionActionPerformed

    private void JMenuBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuBancosActionPerformed
        //Banco
        formMantenimiento_Banco = new Mantenimiento_Banco();
        JDesktopFinanzas.add(formMantenimiento_Banco);
    }//GEN-LAST:event_JMenuBancosActionPerformed

    private void JMenuDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuDivisasActionPerformed
        // Moneda
        formMantenimiento_Moneda = new Mantenimiento_Moneda();
        JDesktopFinanzas.add(formMantenimiento_Moneda);
    }//GEN-LAST:event_JMenuDivisasActionPerformed

    private void JMenuPersonaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuPersonaBancariaActionPerformed
        //Tipo de persona 
        formMantenimiento_TipoPersona = new Mantenimiento_TipoPersona();
        JDesktopFinanzas.add(formMantenimiento_TipoPersona);
    }//GEN-LAST:event_JMenuPersonaBancariaActionPerformed

    private void JMenuCuentaBancariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCuentaBancariaActionPerformed
        try {
            // TODO add your handling code here:
            FrmBancaria = new FrmCuentaBancaria();
        } catch (SQLException ex) {
            Logger.getLogger(MDIFinanzas.class.getName()).log(Level.SEVERE, null, ex);
        }
        JDesktopFinanzas.add(FrmBancaria);
    }//GEN-LAST:event_JMenuCuentaBancariaActionPerformed

    private void JMenuCuentahabienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCuentahabienteActionPerformed
        try {
            // TODO add your handling code here:
            FrmHabiente = new FrmCuentaHabiente();
        } catch (SQLException ex) {
            Logger.getLogger(MDIFinanzas.class.getName()).log(Level.SEVERE, null, ex);
        }
        JDesktopFinanzas.add(FrmHabiente);
    }//GEN-LAST:event_JMenuCuentahabienteActionPerformed

    private void JMenuTipoAsientoContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuTipoAsientoContableActionPerformed
        Mantenimiento_TipoAsiento FrmTipoAsiento = new Mantenimiento_TipoAsiento();
        FrmTipoAsiento.setVisible(true);
        JDesktopFinanzas.add(FrmTipoAsiento);
    }//GEN-LAST:event_JMenuTipoAsientoContableActionPerformed

    private void JMenuPeriodoFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuPeriodoFiscalActionPerformed
        Mantenimiento_PeriodoFiscal frm_mantPerFis = new Mantenimiento_PeriodoFiscal();
        frm_mantPerFis.setVisible(true);
        JDesktopFinanzas.add(frm_mantPerFis);
    }//GEN-LAST:event_JMenuPeriodoFiscalActionPerformed

    private void JMenuItemAsientoContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAsientoContableActionPerformed
        FrmEncabezadoAsiento frmEncabezadoAsiento = new FrmEncabezadoAsiento();
        frmEncabezadoAsiento.setVisible(true);
    }//GEN-LAST:event_JMenuItemAsientoContableActionPerformed

    private void JMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCerrarSesionActionPerformed
       /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/
       Login frmLogin = new Login();
        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_JMenuCerrarSesionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        try {
            // TODO add your handling code here:
            FrmTransacion = new Transaccion_Bancaria();
        } catch (SQLException ex) {
            Logger.getLogger(MDIFinanzas.class.getName()).log(Level.SEVERE, null, ex);
        }

        JDesktopFinanzas.add(FrmTransacion);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
                Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
                Connection connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Finanzas/reportes/ReporteCuentaBancaria.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Cuenta Bancaria");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {

        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDIFinanzas().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDIFinanzas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopFinanzas;
    private javax.swing.JMenu JMenuArchivo;
    private javax.swing.JMenu JMenuAyuda;
    public static javax.swing.JMenuItem JMenuBancos;
    private javax.swing.JMenuBar JMenuBarFinanzas;
    public static javax.swing.JMenu JMenuCatalogoBancos;
    public static javax.swing.JMenu JMenuCatalogoContabilidad;
    public static javax.swing.JMenu JMenuCatalogos;
    private javax.swing.JMenuItem JMenuCerrarSesion;
    public static javax.swing.JMenuItem JMenuClasificacionCuentas;
    public static javax.swing.JMenuItem JMenuCuentaBancaria;
    public static javax.swing.JMenuItem JMenuCuentahabiente;
    public static javax.swing.JMenuItem JMenuCuentasContables;
    public static javax.swing.JMenuItem JMenuDivisas;
    private javax.swing.JMenu JMenuHerramientas;
    public static javax.swing.JMenu JMenuInformes;
    public static javax.swing.JMenuItem JMenuItemAsientoContable;
    public static javax.swing.JMenuItem JMenuPeriodoFiscal;
    public static javax.swing.JMenuItem JMenuPersonaBancaria;
    public static javax.swing.JMenu JMenuProcesos;
    public static javax.swing.JMenuItem JMenuTipoAsientoContable;
    public static javax.swing.JMenuItem JMenuTipoTransaccion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
