
package Finanzas.vista;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Finanzas.dominio.CuentaBancaria;
import Finanzas.datos.CuentaBancariaDAO;
import Finanzas.dominio.Moneda;
import Finanzas.datos.MonedaDAO;
import Finanzas.dominio.CuentaHabiente;
import Finanzas.datos.CuentaHabienteDAO;
import Finanzas.dominio.Banco;
import Finanzas.datos.BancoDAO;
import Finanzas.datos.Conexion;
import com.mysql.cj.Query;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;
/**
 *
 * @author Santiago Martinez Diaz 9959-19-13847
 */
public class FrmCuentaBancaria extends javax.swing.JInternalFrame {
    int codigoAplicacion = 1006;
        //Metodo Llenado de Combos consulta los dominios y datos MonedaDAO y Moneda para obetner el codigo en el combobox
   public void llenadoDeCombos()  {
       MonedaDAO monedaDao = new MonedaDAO();
      List<Moneda> moneda = monedaDao.listar();
      cbox_Moneda.addItem("Seleccione una opción");
      for (int i = 0; i < moneda.size(); i++) {
           cbox_Moneda.addItem(moneda.get(i).getCodigo_Moneda());
         
           
       }
 }

      public void llenadoDeCombos2() {
       CuentaHabienteDAO cuentadao = new CuentaHabienteDAO();
      List<CuentaHabiente> cuenta = cuentadao.listar();
      Cbox_Cuenta.addItem("Seleccione una opción");
      for (int i = 0; i < cuenta.size(); i++) {
           Cbox_Cuenta.addItem(cuenta.get(i).getCodigo_CuentaHabiente());
       }
 }
         public void llenadoDeCombos3()  {
       BancoDAO bancodao = new BancoDAO();
      List<Banco> banco = bancodao.listar();
      Cbox_Banco.addItem("Seleccione una opción");
      for (int i = 0; i < banco.size(); i++) {
        Cbox_Banco.addItem(banco.get(i).getCodigo_Banco());
    
           
           
       }
      
      
 }
         
    // metodo de llenado de tablas automaticamente aparecen los datos guardados en bd y se despliega en automatico ademas crea las tablas en el jtable
 public void llenadoDeTablas() {
    
          DefaultTableModel modelo = new DefaultTableModel();
          modelo.addColumn("Numero");
          modelo.addColumn("Moneda");
          modelo.addColumn("Cuenta Habiente");
          modelo.addColumn("Cuenta Del Banco"); 
          modelo.addColumn("Saldo");
                  
          CuentaBancariaDAO TipoTDAO = new CuentaBancariaDAO();
          List<CuentaBancaria> tipot = TipoTDAO.listar();
          JTableTransaccion.setModel(modelo);
          String[] dato = new String[5];
          for (int i = 0; i < tipot.size(); i++) {
              dato[0] = tipot.get(i).getNumero_CuentaBancaria();
              dato[1] = tipot.get(i).getMoneda_Cuenta();
              dato[2] = tipot.get(i).getCuentaHabiente_Cuenta();
              dato[3] = tipot.get(i).getBanco_Cuenta();
              dato[4] = tipot.get(i).getSaldo();
              modelo.addRow(dato);
          }
      
    }

    /**
     * Creates new form FrmCuentaBancaria
     */
    public FrmCuentaBancaria() throws SQLException {
        initComponents();
        llenadoDeCombos();
        llenadoDeCombos2();
        llenadoDeCombos3();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        cbox_Moneda = new javax.swing.JComboBox<>();
        Cbox_Cuenta = new javax.swing.JComboBox<>();
        Cbox_Banco = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TxtMoneda = new javax.swing.JTextField();
        TxtCuenta = new javax.swing.JTextField();
        TxtBanco = new javax.swing.JTextField();
        BtnElim = new javax.swing.JButton();
        BtnIng = new javax.swing.JButton();
        btnLimpiar3 = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        TxtSaldo = new javax.swing.JTextField();
        BtnElim1 = new javax.swing.JButton();
        label11 = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableTransaccion = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento Cuenta Bancaria");
        setToolTipText("");
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setText("Numero De cuenta:");

        label9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label9.setText("Tipo De Moneda:");

        label8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label8.setText("Cuenta de CuentaHabiente:");

        label10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label10.setText("Cuenta  Del Banco;");

        Cbox_Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbox_CuentaActionPerformed(evt);
            }
        });

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TxtMoneda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMonedaActionPerformed(evt);
            }
        });

        TxtCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TxtBanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnElim.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnElim.setText("Imprimir:");
        BtnElim.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnIng.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnIng.setText("Registrar");
        BtnIng.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        btnLimpiar3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpiar3.setText("Ayuda:");
        btnLimpiar3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar3ActionPerformed(evt);
            }
        });

        TxtBuscar.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        BtnElim1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnElim1.setText("Eliminar");
        BtnElim1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnElim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElim1ActionPerformed(evt);
            }
        });

        label11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label11.setText("Saldo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BtnElim1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label7)
                            .addComponent(label9)
                            .addComponent(label8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label11)
                                .addComponent(label10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cbox_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbox_Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_Moneda, 0, 255, Short.MAX_VALUE)
                            .addComponent(TxtSaldo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(TxtBanco)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 15, Short.MAX_VALUE))
                                    .addComponent(TxtMoneda))))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(TxtNumero)
                    .addGap(181, 181, 181)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_Moneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cbox_Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbox_Banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(TxtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtBanco))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnElim1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(292, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        JTableTransaccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JTableTransaccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Moneda", "Cuentahabiente", "Banco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableTransaccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed
        CuentaBancariaDAO cuentadao = new CuentaBancariaDAO();
        CuentaBancaria insertarcuenta = new CuentaBancaria();
        //METODO INSERTAR
        insertarcuenta.setNumero_CuentaBancaria(TxtNumero.getText());
        insertarcuenta.setMoneda_Cuenta(cbox_Moneda.getSelectedItem().toString());
         insertarcuenta.setCuentaHabiente_Cuenta(Cbox_Cuenta.getSelectedItem().toString());
        insertarcuenta.setBanco_Cuenta(Cbox_Banco.getSelectedItem().toString());
        insertarcuenta.setSaldo(TxtSaldo.getText());

          cuentadao.insert(insertarcuenta);
           
          //LLena La jtable con los datos ya ingresados en db
           llenadoDeTablas();
           
            BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();
        AInsertar.setId_Usuario("FrmCuentaBancaria");
        AInsertar.setAccion("Registrar");
        AInsertar.setCodigoAplicacion("1006");
        AInsertar.setModulo("Finanzas");
        
        try{
            BitacoraDAO.insert(AInsertar);
            
        } catch (UnknownHostException ex) {
              Logger.getLogger(FrmCuentaBancaria.class.getName()).log(Level.SEVERE, null, ex);
          }
           
    }//GEN-LAST:event_BtnIngActionPerformed
 
    
     private Connection connection = null;
     
     
    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/main/java/Finanzas/reportes/reporteCuentaBancaria.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Cuenta Bancaria");
            view.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
         BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();
        AInsertar.setId_Usuario("FrmCuentaBancaria");
        AInsertar.setAccion("Imprimir");
        AInsertar.setCodigoAplicacion("1006");
        AInsertar.setModulo("Finanzas");
        try{
            BitacoraDAO.insert(AInsertar);
            
        } catch (UnknownHostException ex) {
              Logger.getLogger(FrmCuentaHabiente.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_BtnElimActionPerformed

    private void Cbox_CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbox_CuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cbox_CuentaActionPerformed

    private void btnLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar3ActionPerformed

        // TODO add your handling code here:
                      try {
            if ((new File("src\\main\\java\\Finanzas\\ayudas\\AyudaMantenimientoCuentaBancaria.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Finanzas\\ayudas\\AyudaMantenimientoCuentaBancaria.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
    }//GEN-LAST:event_btnLimpiar3ActionPerformed

    private void TxtMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMonedaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     String val =cbox_Moneda.getSelectedItem().toString();
        MonedaDAO perfilDAO = new MonedaDAO();
        Moneda consultar = new Moneda();
        consultar.setCodigo_Moneda(val);
        consultar=perfilDAO.query(consultar);
             
        TxtMoneda.setText(consultar.getNombre_Moneda());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           String val =Cbox_Cuenta.getSelectedItem().toString();
        CuentaHabienteDAO perfilDAO = new CuentaHabienteDAO();
        CuentaHabiente consultar = new CuentaHabiente();
        consultar.setCodigo_CuentaHabiente(val);
        consultar=perfilDAO.query(consultar);
             
        TxtCuenta.setText(consultar.getNombre_CuentaHabiente());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String val =Cbox_Banco.getSelectedItem().toString();
        BancoDAO perfilDAO = new BancoDAO();
        Banco consultar = new Banco();
        consultar.setCodigo_Banco(val);
        consultar=perfilDAO.query(consultar);
             
        TxtBanco.setText(consultar.getNombre_Banco());

    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnElim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElim1ActionPerformed
        // TODO add your handling code here:
          CuentaBancariaDAO cuentadao = new CuentaBancariaDAO();
        CuentaBancaria cuentaeliminar = new CuentaBancaria();
        cuentaeliminar.setNumero_CuentaBancaria((TxtBuscar.getText()));
        cuentadao.delete(cuentaeliminar);

        llenadoDeTablas();
    
        BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();
        AInsertar.setId_Usuario("FrmCuentaBancaria");
        AInsertar.setAccion("Eliminar");
        AInsertar.setCodigoAplicacion("1006");
        AInsertar.setModulo("Finanzas");
        try{
            BitacoraDAO.insert(AInsertar);
            
        } catch (UnknownHostException ex) {
              Logger.getLogger(FrmCuentaHabiente.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_BtnElim1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnElim;
    private javax.swing.JButton BtnElim1;
    private javax.swing.JButton BtnIng;
    private javax.swing.JComboBox<String> Cbox_Banco;
    private javax.swing.JComboBox<String> Cbox_Cuenta;
    private javax.swing.JTable JTableTransaccion;
    private javax.swing.JTextField TxtBanco;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCuenta;
    private javax.swing.JTextField TxtMoneda;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtSaldo;
    private javax.swing.JButton btnLimpiar3;
    private javax.swing.JComboBox<String> cbox_Moneda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    // End of variables declaration//GEN-END:variables
}
