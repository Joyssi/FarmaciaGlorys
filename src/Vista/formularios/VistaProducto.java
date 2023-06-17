/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.formularios;
import Vista.Menu.Menu;
import Controlador.CRUDProducto;
import static Vista.formularios.VistaProveedor.TablaProveedor;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joy Cruz
 */
public class VistaProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Producto
     */
    int datoSeleccionado = -1;

    public VistaProducto() {
        initComponents();
        mostrar();
        BotonMostrar.setVisible(false);
        InsertarProducto.setVisible(false);

    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDProducto produc = new CRUDProducto();
            modelo = produc.mostrarDatos();
            TablaProducto.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        EnmarcarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        BuscarProducto = new javax.swing.JTextField();
        EditarProducto = new javax.swing.JButton();
        EliminarProducto = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        InsertarProducto = new javax.swing.JButton();
        BotonMostrar = new javax.swing.JButton();
        AgregarProducto = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(51, 102, 255))); // NOI18N

        EnmarcarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EnmarcarProducto.setForeground(new java.awt.Color(0, 102, 255));
        EnmarcarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Enmarcar1.png"))); // NOI18N

        TablaProducto.setBackground(new java.awt.Color(204, 204, 255));
        TablaProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TablaProducto.setForeground(new java.awt.Color(51, 51, 51));
        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código de producto", "Nombre de producto", "Descripción del producto", "Marca", "Fecha de vencimiento", "Cantidad de producto", "Precio de producto", "Categoría", "Forma de dosificación", "Tamaño"
            }
        ));
        TablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProducto);

        BuscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        BuscarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BuscarProducto.setForeground(new java.awt.Color(51, 51, 51));
        BuscarProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarProductoFocusLost(evt);
            }
        });
        BuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarProductoMouseClicked(evt);
            }
        });
        BuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarProductoKeyReleased(evt);
            }
        });

        EditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        EditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarProductoActionPerformed(evt);
            }
        });

        EliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/borrar.png"))); // NOI18N
        EliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar1.png"))); // NOI18N

        InsertarProducto.setText("Insertar");
        InsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarProductoActionPerformed(evt);
            }
        });

        BotonMostrar.setText("jButton2");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        AgregarProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarProducto.setText("+");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(AgregarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(EnmarcarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(InsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonMostrar)
                .addGap(197, 197, 197))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(BotonMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(EliminarProducto)
                        .addComponent(EditarProducto)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(AgregarProducto)))
                    .addComponent(EnmarcarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarProductoActionPerformed
          Productos pro = new Productos();
        int x = (Menu.desktopPane.getWidth() / 2) - pro.getWidth() / 2;
        int y = (Menu.desktopPane.getHeight() / 2) - pro.getHeight() / 2;
        pro.setLocation(x, y);
        Menu.desktopPane.add(pro);

        if (datoSeleccionado >= 0) {
            //mandar datos al formulario
            Productos.CodProducto.setText(String.valueOf(TablaProducto.getValueAt(datoSeleccionado, 0)));
            Productos.NomProducto.setText(String.valueOf(TablaProducto.getValueAt(datoSeleccionado, 1)));
            Productos.DescripProducto.setText(String.valueOf(TablaProducto.getValueAt(datoSeleccionado, 2)));
            Productos.CantProducto.setText(String.valueOf(TablaProducto.getValueAt(datoSeleccionado, 3)));
            Productos.PrecioProducto.setText(String.valueOf(TablaProducto.getValueAt(datoSeleccionado, 4)));
            Productos.FechaVencimiento.setText(String.valueOf(TablaProducto.getValueAt(datoSeleccionado, 5)));
            Productos.CodProducto.enable(false);
            //hacer al frente y visible
            pro.toFront();
            Productos.GuardarProducto.setVisible(false);
            Productos.ActualizarProducto.setVisible(true);
            Productos.Cancelar.setVisible(true);
            pro.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro a actualizar");
        }
    }//GEN-LAST:event_EditarProductoActionPerformed

    private void BuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarProductoKeyReleased
        try {

            DefaultTableModel modelo;
            CRUDProducto prod = new CRUDProducto();
            modelo = prod.buscarDatos(BuscarProducto.getText());
            TablaProducto.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarProductoKeyReleased

    private void EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoActionPerformed
        if (datoSeleccionado >= 0) {
            int codigo = Integer.parseInt((String) TablaProducto.getValueAt(datoSeleccionado, 0));
            CRUDProducto pro = new CRUDProducto();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿Desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                pro.eliminar(codigo);
                mostrar();
                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_EliminarProductoActionPerformed

    private void TablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductoMouseClicked
       datoSeleccionado = TablaProducto.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TablaProductoMouseClicked

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed
          Productos pro = new Productos();
        int x = (Menu.desktopPane.getWidth() / 2) - pro.getWidth() / 2;
        int y = (Menu.desktopPane.getHeight() / 2) - pro.getHeight() / 2;
        pro.setLocation(x, y);
        Menu.desktopPane.add(pro);
        pro.toFront();
        pro.setVisible(true);
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void BuscarProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarProductoFocusLost
       BuscarProducto.setText("Buscar por código, nombre");
       BuscarProducto.setForeground(Color.gray);
    }//GEN-LAST:event_BuscarProductoFocusLost

    private void BuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarProductoMouseClicked
         BuscarProducto.setText("");
    }//GEN-LAST:event_BuscarProductoMouseClicked

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void InsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarProductoActionPerformed
         
    }//GEN-LAST:event_InsertarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProducto;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JTextField BuscarProducto;
    public static javax.swing.JButton EditarProducto;
    public static javax.swing.JButton EliminarProducto;
    public static javax.swing.JButton EnmarcarProducto;
    public static javax.swing.JButton InsertarProducto;
    public static javax.swing.JTable TablaProducto;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
