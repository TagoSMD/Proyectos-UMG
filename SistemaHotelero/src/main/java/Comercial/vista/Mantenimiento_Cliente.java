/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.vista;

import Comercial.datos.DeudoresDAO;
import Comercial.datos.ClienteDao;
import Comercial.dominio.Deudores;
import Comercial.dominio.Cliente;
import java.io.File;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;
import seguridad.vista.Aplicacion_Perfil;

/**
 *
 * @author PERSONAL
 */
public class Mantenimiento_Cliente extends javax.swing.JInternalFrame {
public void llenadoDeTablas() {
        /**
 *
 * creaccion de la tabla de de titulos  
 */
        DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("ID Acreedores");
        modelo.addColumn("Cliente");
        modelo.addColumn("Monto");
          modelo.addColumn("Estatus Cliente");
          modelo.addColumn("Nit");
          modelo.addColumn("Telefono");
           modelo.addColumn("Producto");
  
     ClienteDao  ventasDAO = new  ClienteDao();
  


       List<Cliente> ventas = ventasDAO.select();
        JtProductos1.setModel(modelo);
        String[] dato = new String[7];
    for (int i = 0; i < ventas.size(); i++) {
            dato[0] = (ventas.get(i).getId_cliente());
            dato[1] = ventas.get(i).getCliente();
              dato[2] = ventas.get(i).getNit();
            dato[3] = (ventas.get(i).getEstatus_Cliente());
          dato[4] = (ventas.get(i).getMonto());
            dato[5] = (ventas.get(i).getTelefono());
            dato[6] = ventas.get(i).getProducto();
          
          
            System.out.println("vendedor:" + ventas);
            modelo.addRow(dato);
        }
     }
 public void buscarVendedor() {
     
   
     ClienteDao Clientes= new ClienteDao ();
            
        Cliente Buscar = new Cliente();

Buscar.setId_cliente(ID.getText());
Buscar=Clientes.query(Buscar);         
cliente.setText(Buscar.getCliente());

nit.setText(Buscar.getNit());
monto.setText(Buscar.getMonto());
estatus.setText(Buscar.getEstatus_Cliente());
telefono.setText(Buscar.getTelefono());
producto.setText(Buscar.getProducto());
  
    }
    public void limpiar() {
        ID.setText("");
        cliente.setText("");
        nit.setText("");
        monto.setText("");
        estatus.setText("");
        telefono.setText("");
           producto.setText("");
    }
    /**
     * Creates new form Mantenimiento_Cliente
     */
    public Mantenimiento_Cliente() {
        initComponents();
         llenadoDeTablas() ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        producto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtProductos1 = new javax.swing.JTable();
        estatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        monto = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimieto Cliente\n");

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mantenimiento Cliente");

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Cliente");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Cliente");

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nit");

        jLabel5.setText("Telefono");

        jLabel6.setText(" Producto");

        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });

        jLabel7.setText("Estatus de Cliente");

        jLabel8.setText("Capital");

        JtProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtProductos1);

        jButton1.setText("Ayuda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cliente)
                                    .addComponent(ID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(producto)
                                            .addComponent(telefono)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 344, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(40, 40, 40)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(326, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         ClienteDao dao = new    ClienteDao  ();

         Cliente modi = new    Cliente ();
        modi.setId_cliente (ID.getText());
        modi.setCliente(cliente.getText());
        modi.setNit(nit.getText());
        modi.setMonto(monto.getText());
        modi.setEstatus_Cliente(estatus.getText());
        modi.setTelefono(telefono.getText());
        modi.setProducto(producto.getText());

        dao.update(modi);
        llenadoDeTablas();
         limpiar();
             BitacoraDao BitacoraDAO = new BitacoraDao();
            
        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario("Usuario");
        Insertar.setAccion("Modificar");
        Insertar.setCodigoAplicacion("03");
            try {
                BitacoraDAO.insert(Insertar);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ClienteDao acreedor = new ClienteDao ();

        Cliente vendedorAEliminar = new Cliente();
        vendedorAEliminar.setId_cliente(ID.getText());
        vendedorAEliminar.setCliente(cliente.getText());
        vendedorAEliminar.setNit(nit.getText());
        vendedorAEliminar.setMonto(monto.getText());
        vendedorAEliminar.setEstatus_Cliente(estatus.getText());
        vendedorAEliminar.setTelefono(telefono.getText());
        vendedorAEliminar.setProducto(producto.getText());
        acreedor.delete(vendedorAEliminar);
        llenadoDeTablas();
 limpiar();
        JOptionPane.showMessageDialog(null, "Cliente Eliminado.");
            BitacoraDao BitacoraDAO = new BitacoraDao();
            
        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario("Usuario");
        Insertar.setAccion("Eliminar");
        Insertar.setCodigoAplicacion("03");
            try {
                BitacoraDAO.insert(Insertar);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    BitacoraDao BitacoraDAO = new BitacoraDao();
            
        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario("Buscar");
        Insertar.setAccion("Buscar");
        Insertar.setCodigoAplicacion("03");
            try {
                BitacoraDAO.insert(Insertar);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        buscarVendedor();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String id="0";
        ClienteDao ClienteDAO = new ClienteDao ();

        Cliente AInsertar = new Cliente();
        AInsertar.setId_cliente(ID.getText());
        AInsertar.setCliente(cliente.getText());
        AInsertar.setNit(nit.getText());
        AInsertar.setMonto(monto.getText());
        AInsertar.setEstatus_Cliente(estatus.getText());
        AInsertar.setTelefono(telefono.getText());
        AInsertar.setProducto(producto.getText());
        ClienteDAO.insert(AInsertar);
        
        llenadoDeTablas();
         limpiar();
             BitacoraDao BitacoraDAO = new BitacoraDao();
            
        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario("Usuario");
        Insertar.setAccion("Insertar");
        Insertar.setCodigoAplicacion("03");
            try {
                BitacoraDAO.insert(Insertar);
            } catch (UnknownHostException ex) {
                Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\Clientes.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\Clientes.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTable JtProductos1;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField estatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField producto;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
