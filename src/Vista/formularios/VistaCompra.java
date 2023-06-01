/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.formularios;
import javax.swing.JOptionPane;
import Controlador.CRUDCompra;
import Controlador.CRUDProveedor;
import Modelo.POJOCompra;
import Modelo.POJOProveedor;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;


import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class VistaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaCompra
     */
    int datoSeleccionado = -1;
    
    public VistaCompra() {
        initComponents();
        mostrar();
        llenarProveedor();
        CodigoCompra.setEnabled(false);
        ActualizarCompra.setVisible(false);
        Cancelar.setVisible(false);
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDCompra cli = new CRUDCompra();
            modelo = cli.mostrarDatos();
            TablaCompra.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      public void limpiar() {
        CodigoCompra.setText("");
        FechaCompra.setText("");
    }

       public void guardarCompra() {

        CRUDCompra cc = new CRUDCompra();

        POJOCompra cl = new POJOCompra(0,
                FechaCompra.getText(),
                ComboProveedor.getItemAt(ComboProveedor.getSelectedIndex()).getIDProveedor());
        cc.Guardar(cl);

    }
      
        public void editarCompra() {

        CRUDCompra cc = new CRUDCompra();

        POJOCompra cl = new POJOCompra (0,
                FechaCompra.getText(),
                ComboProveedor.getItemAt(ComboProveedor.getSelectedIndex()).getIDProveedor());
        cc.actualizar(cl);

    }
        
         public void llenarProveedor() {

        CRUDProveedor gr = new CRUDProveedor();
        ArrayList<POJOProveedor> listaProveedor =  gr.mostrarDatosCombo();
        ComboProveedor.removeAllItems();
        for (int i = 0; i < listaProveedor.size(); i++) {
            ComboProveedor.addItem(new POJOProveedor(
                    listaProveedor.get(i).getIDProveedor(),
                    listaProveedor.get(i).getNombres()));
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CodigoCompra = new javax.swing.JTextField();
        FechaCompra = new javax.swing.JFormattedTextField();
        GuardarCompra = new javax.swing.JButton();
        ActualizarCompra = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ComboProveedor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCompra = new javax.swing.JTable();
        BuscarCompra = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        EditarCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Código de proveedor");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Código de compra");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Fecha de compra");

        CodigoCompra.setBackground(new java.awt.Color(255, 255, 255));
        CodigoCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CodigoCompra.setForeground(new java.awt.Color(51, 51, 51));

        FechaCompra.setBackground(new java.awt.Color(255, 255, 255));
        FechaCompra.setForeground(new java.awt.Color(51, 51, 51));
        try {
            FechaCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        GuardarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GuardarCompra.setForeground(new java.awt.Color(0, 102, 255));
        GuardarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/disquete.png"))); // NOI18N
        GuardarCompra.setText("Guardar");
        GuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCompraActionPerformed(evt);
            }
        });

        ActualizarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ActualizarCompra.setForeground(new java.awt.Color(0, 102, 255));
        ActualizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/boton-actualizar.png"))); // NOI18N
        ActualizarCompra.setText("Actualizar");
        ActualizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarCompraActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(51, 102, 255));
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ActualizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(CodigoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(FechaCompra)
                    .addComponent(ComboProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActualizarCompra)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarCompra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 255))); // NOI18N

        TablaCompra.setBackground(new java.awt.Color(204, 204, 255));
        TablaCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TablaCompra.setForeground(new java.awt.Color(51, 51, 51));
        TablaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código de compra", "Código de proveedor", "Fecha de compra"
            }
        ));
        jScrollPane1.setViewportView(TablaCompra);

        BuscarCompra.setBackground(new java.awt.Color(255, 255, 255));
        BuscarCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BuscarCompra.setForeground(new java.awt.Color(51, 51, 51));
        BuscarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarCompraKeyReleased(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 102, 255));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/borrar.png"))); // NOI18N
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        EditarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        EditarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCompraActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarCompra)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditarCompra)
                            .addComponent(Eliminar))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCompraActionPerformed
        try {
            if((FechaCompra.getText().equals(""))
                || (ComboProveedor.getItemAt(ComboProveedor.getSelectedIndex()).equals(""))){
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            }else{
            guardarCompra();
            limpiar();
            mostrar();
            ActualizarCompra.setVisible(false);
                JOptionPane.showMessageDialog(null, "Datos agregados correctamente");
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }//GEN-LAST:event_GuardarCompraActionPerformed

    private void ActualizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarCompraActionPerformed
        try {
            if ((CodigoCompra.getText().equals(""))
                    ||(FechaCompra.getText().equals(""))
                    ||(ComboProveedor.getItemAt(ComboProveedor.getSelectedIndex()).equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                editarCompra();
                mostrar();
                limpiar();
                ActualizarCompra.setVisible(false);
                GuardarCompra.setVisible(true);
                Cancelar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
                

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_ActualizarCompraActionPerformed

    private void BuscarCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarCompraKeyReleased
         try {

            DefaultTableModel modelo;
            CRUDCompra cli = new CRUDCompra();
            modelo = cli.buscarDatos(BuscarCompra.getText());
            TablaCompra.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarCompraKeyReleased

    private void EditarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCompraActionPerformed
         int fila=this.TablaCompra.getSelectedRow();
       if(fila==-1){
           JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
       }
       else{
           
           try{
               int cod=Integer.parseInt((String)this.TablaCompra.getValueAt(fila, 0).toString());
               String fecha=(String)this.TablaCompra.getValueAt(fila, 1);
               String codp=(String)this.TablaCompra.getValueAt(fila, 2);

       GuardarCompra.setVisible(false);
       ActualizarCompra.setVisible(true);
       Cancelar.setVisible(true);
  
        ComboProveedor.setToolTipText(""+codp);       
        FechaCompra.setText(fecha);
        CodigoCompra.setText(String.valueOf(cod));
           }catch(NumberFormatException e){
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditarCompraActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiar();
        ActualizarCompra.setVisible(false);
        GuardarCompra.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarCompra;
    private javax.swing.JTextField BuscarCompra;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField CodigoCompra;
    private javax.swing.JComboBox<POJOProveedor> ComboProveedor;
    private javax.swing.JButton EditarCompra;
    private javax.swing.JButton Eliminar;
    private javax.swing.JFormattedTextField FechaCompra;
    private javax.swing.JButton GuardarCompra;
    private javax.swing.JTable TablaCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
