/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.formularios;

import Controlador.CRUDCategoria;
import Controlador.CRUDMarca;
import Controlador.CRUDPresentacion;
import Controlador.CRUDProducto;
import Modelo.POJOCategoria;
import Modelo.POJOMarca;
import Modelo.POJOPresentacion;
import Modelo.POJOProducto;
import Vista.Menu.Menu;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joy Cruz
 */
public class Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
         llenarCategoria();
        llenarMarca();
        llenarPresentacion();
        mostrar();
        ActualizarProducto.setVisible(false);
        Cancelar.setVisible(false);
    }

     public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDProducto pro = new CRUDProducto();
            modelo = pro.mostrarDatos();
            VistaProductos.TablaProducto.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void llenarCategoria() {

        CRUDCategoria gr = new CRUDCategoria();
        ArrayList<POJOCategoria> listaCategoria = gr.mostrarDatosCombo();
        ComboCategoria.removeAllItems();
        for (int i = 0; i < listaCategoria.size(); i++) {
            ComboCategoria.addItem(new POJOCategoria(
                    listaCategoria.get(i).getIDCategoria(),
                    listaCategoria.get(i).getNombreCategoria()));
        }
    }

    public void llenarMarca() {

        CRUDMarca gr = new CRUDMarca();
        ArrayList<POJOMarca> listaMarca = gr.mostrarDatosCombo();
        ComboMarca.removeAllItems();
        for (int i = 0; i < listaMarca.size(); i++) {
            ComboMarca.addItem(new POJOMarca(
                    listaMarca.get(i).getIDMarca(),
                    listaMarca.get(i).getNombreMarca()));
        }

    }

    public void llenarPresentacion() {

        CRUDPresentacion gr = new CRUDPresentacion();
        ArrayList<POJOPresentacion> listaPresentacion = gr.mostrarDatosCombo();
        ComboDosificacion.removeAllItems();
        for (int i = 0; i < listaPresentacion.size(); i++) {
            ComboDosificacion.addItem(new POJOPresentacion(
                    listaPresentacion.get(i).getIDPresentacion(),
                    listaPresentacion.get(i).getFormaDosificacion()));
        }

    }
    
     public void limpiar() {
        NomProducto.setText("");
        DescripProducto.setText("");
        CantProducto.setText("");
        PrecioProducto.setText("");
        FechaVencimiento.setText("");
    }

   

    public void guardarProducto() {

        CRUDProducto cc = new CRUDProducto();

        POJOProducto cl = new POJOProducto(0,
                NomProducto.getText(),
                DescripProducto.getText(),
                Integer.parseInt(CantProducto.getText()),
                Double.parseDouble(PrecioProducto.getText()),
                FechaVencimiento.getText(),
                ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).getIDMarca(),
                ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).getIDCategoria(),
                ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).getIDPresentacion());
        cc.Guardar(cl);
    }

    public void editarProducto() {

        CRUDProducto cc = new CRUDProducto();

        POJOProducto cl = new POJOProducto(Integer.parseInt(CodProducto.getText()),
                NomProducto.getText(),
                DescripProducto.getText(),
                Integer.parseInt(CantProducto.getText()),
                Double.parseDouble(PrecioProducto.getText()),
                FechaVencimiento.getText(),
                ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).getIDMarca(),
                ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).getIDCategoria(),
                ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).getIDPresentacion());
        cc.actualizar(cl);

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CodProducto = new javax.swing.JTextField();
        NomProducto = new javax.swing.JTextField();
        PrecioProducto = new javax.swing.JTextField();
        CantProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripProducto = new javax.swing.JTextArea();
        ComboCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboMarca = new javax.swing.JComboBox<>();
        Marca = new javax.swing.JButton();
        Categoria1 = new javax.swing.JButton();
        Presentacion = new javax.swing.JButton();
        GuardarProducto = new javax.swing.JButton();
        ActualizarProducto = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ComboDosificacion = new javax.swing.JComboBox<>();
        FechaVencimiento = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Código de producto");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Nombre de producto");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Descripción de producto");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Fecha de vencimiento");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Cantidad de producto");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Precio de producto");

        CodProducto.setBackground(new java.awt.Color(255, 255, 255));
        CodProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CodProducto.setForeground(new java.awt.Color(51, 51, 51));

        NomProducto.setBackground(new java.awt.Color(255, 255, 255));
        NomProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NomProducto.setForeground(new java.awt.Color(51, 51, 51));
        NomProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomProductoKeyTyped(evt);
            }
        });

        PrecioProducto.setBackground(new java.awt.Color(255, 255, 255));
        PrecioProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PrecioProducto.setForeground(new java.awt.Color(51, 51, 51));

        CantProducto.setBackground(new java.awt.Color(255, 255, 255));
        CantProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CantProducto.setForeground(new java.awt.Color(51, 51, 51));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        DescripProducto.setBackground(new java.awt.Color(255, 255, 255));
        DescripProducto.setColumns(20);
        DescripProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DescripProducto.setForeground(new java.awt.Color(51, 51, 51));
        DescripProducto.setRows(5);
        jScrollPane1.setViewportView(DescripProducto);

        ComboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        ComboCategoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboCategoria.setForeground(new java.awt.Color(51, 51, 51));
        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Categoría");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Marca");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Forma de dosificación");

        ComboMarca.setBackground(new java.awt.Color(255, 255, 255));
        ComboMarca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboMarca.setForeground(new java.awt.Color(51, 51, 51));

        Marca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Marca.setForeground(new java.awt.Color(0, 102, 255));
        Marca.setText("Marca");
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });

        Categoria1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Categoria1.setForeground(new java.awt.Color(0, 102, 255));
        Categoria1.setText("Categoría");
        Categoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Categoria1ActionPerformed(evt);
            }
        });

        Presentacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Presentacion.setForeground(new java.awt.Color(51, 102, 255));
        Presentacion.setText("Presentación");
        Presentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentacionActionPerformed(evt);
            }
        });

        GuardarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GuardarProducto.setForeground(new java.awt.Color(0, 102, 255));
        GuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/disquete.png"))); // NOI18N
        GuardarProducto.setText("Guardar");
        GuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProductoActionPerformed(evt);
            }
        });

        ActualizarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ActualizarProducto.setForeground(new java.awt.Color(0, 102, 255));
        ActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/boton-actualizar.png"))); // NOI18N
        ActualizarProducto.setText("Actualizar");
        ActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarProductoActionPerformed(evt);
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

        FechaVencimiento.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ActualizarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuardarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Categoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(Presentacion)
                                .addGap(38, 38, 38)
                                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(CodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(56, 56, 56)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(CantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel10)
                                                .addComponent(PrecioProducto)
                                                .addComponent(ComboDosificacion, 0, 176, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(FechaVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))))))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(ComboMarca, 0, 186, Short.MAX_VALUE)
                            .addComponent(ComboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboDosificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categoria1)
                    .addComponent(Presentacion)
                    .addComponent(Marca))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ActualizarProducto)
                        .addComponent(GuardarProducto))
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed

    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        VistaMarca marca = new VistaMarca();
        int x = (Menu.desktopPane.getWidth() / 2) - marca.getWidth() / 2;
        int y = (Menu.desktopPane.getHeight() / 2) - marca.getHeight() / 2;
        marca.setLocation(x, y);
        Menu.desktopPane.add(marca);
        marca.toFront();
        marca.setVisible(true);
    }//GEN-LAST:event_MarcaActionPerformed

    private void Categoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Categoria1ActionPerformed
        VistaCategoria cat = new VistaCategoria();
        int x = (Menu.desktopPane.getWidth() / 2) - cat.getWidth() / 2;
        int y = (Menu.desktopPane.getHeight() / 2) - cat.getHeight() / 2;
        cat.setLocation(x, y);
        Menu.desktopPane.add(cat);
        cat.toFront();
        cat.setVisible(true);
    }//GEN-LAST:event_Categoria1ActionPerformed

    private void PresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentacionActionPerformed
        VistaPresentacion pre = new VistaPresentacion();
        int x = (Menu.desktopPane.getWidth() / 2) - pre.getWidth() / 2;
        int y = (Menu.desktopPane.getHeight() / 2) - pre.getHeight() / 2;
        pre.setLocation(x, y);
        Menu.desktopPane.add(pre);
        pre.toFront();
        pre.setVisible(true);
    }//GEN-LAST:event_PresentacionActionPerformed

    private void GuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProductoActionPerformed
        CRUDProducto cl = new CRUDProducto();
        try {
            if ((NomProducto.getText().equals(""))
                || (DescripProducto.getText().equals(""))
                || (CantProducto.getText().equals(""))
                || (PrecioProducto.getText().equals(""))
                || (FechaVencimiento.getText().equals("    /  /  "))
                || (ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).equals(""))
                || (ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).equals(""))
                || (ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                guardarProducto();
                limpiar();
                mostrar();
                ActualizarProducto.setVisible(false);
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                dispose();
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_GuardarProductoActionPerformed

    private void ActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarProductoActionPerformed
        try {
            if ((CodProducto.getText().equals(""))
                || (NomProducto.getText().equals(""))
                || (DescripProducto.getText().equals(""))
                || (CantProducto.getText().equals(""))
                || (PrecioProducto.getText().equals(""))
                || (FechaVencimiento.getText().equals(""))
                || (ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).equals(""))
                || (ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).equals(""))
                || (ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                editarProducto();
                mostrar();
                limpiar();
                GuardarProducto.setVisible(false);
                ActualizarProducto.setVisible(true);
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
                dispose();

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_ActualizarProductoActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiar();
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void NomProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomProductoKeyTyped
         char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'z')
            && car != 'á'
            && car != 'é'
            && car != 'í'
            && car != 'ó'
            && car != 'ú'
            && car != 'Á'
            && car != 'É'
            && car != 'Í'
            && car != 'Ó'
            && car != 'Ú'
            && car != 'Ü'
            && car != 'ü'
            && car != 'Ñ'
            && car != 'ñ'
            && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_NomProductoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ActualizarProducto;
    public static javax.swing.JButton Cancelar;
    public static javax.swing.JTextField CantProducto;
    private javax.swing.JButton Categoria1;
    public static javax.swing.JTextField CodProducto;
    public static javax.swing.JComboBox<POJOCategoria> ComboCategoria;
    public static javax.swing.JComboBox<POJOPresentacion> ComboDosificacion;
    public static javax.swing.JComboBox<POJOMarca> ComboMarca;
    public static javax.swing.JTextArea DescripProducto;
    public static javax.swing.JTextField FechaVencimiento;
    public static javax.swing.JButton GuardarProducto;
    private javax.swing.JButton Marca;
    public static javax.swing.JTextField NomProducto;
    public static javax.swing.JTextField PrecioProducto;
    private javax.swing.JButton Presentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
