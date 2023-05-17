/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Joy Cruz
 */
public class VistaProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Producto
     */
    public VistaProducto() {
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
        FechaVencimiento = new javax.swing.JFormattedTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GuardarProducto = new javax.swing.JButton();
        ActualizarProducto = new javax.swing.JButton();
        EnmarcarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        ComboCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboMarca = new javax.swing.JComboBox<>();
        ComboDosificacion = new javax.swing.JComboBox<>();
        Categoria = new javax.swing.JButton();
        Presentacion = new javax.swing.JButton();
        Marca = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

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

        FechaVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        FechaVencimiento.setForeground(new java.awt.Color(51, 51, 51));
        try {
            FechaVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar1.png"))); // NOI18N

        GuardarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GuardarProducto.setForeground(new java.awt.Color(0, 102, 255));
        GuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Guardar1.png"))); // NOI18N
        GuardarProducto.setText("Guardar");

        ActualizarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ActualizarProducto.setForeground(new java.awt.Color(0, 102, 255));
        ActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actualizar1.png"))); // NOI18N
        ActualizarProducto.setText("Actualizar");

        EnmarcarProducto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EnmarcarProducto.setForeground(new java.awt.Color(0, 102, 255));
        EnmarcarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Enmarcar1.png"))); // NOI18N
        EnmarcarProducto.setText("Enmarcar");

        TablaProducto.setBackground(new java.awt.Color(255, 255, 255));
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
        jScrollPane2.setViewportView(TablaProducto);

        ComboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        ComboCategoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboCategoria.setForeground(new java.awt.Color(51, 51, 51));
        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homeopáticos", "Gases Medicinales", "Biologicos", "Fitofarmacos", "Suplementos Nutricionales", "Pruebas Diagnósticas Rápidas", "Cuidado de Heridad" }));

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
        ComboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RAMOS", "PASHA S.A" }));

        ComboDosificacion.setBackground(new java.awt.Color(255, 255, 255));
        ComboDosificacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboDosificacion.setForeground(new java.awt.Color(51, 51, 51));
        ComboDosificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabletas", "Cápsulas", "Polvos", "Solución Inyectable", "Oral" }));

        Categoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Categoria.setForeground(new java.awt.Color(0, 102, 255));
        Categoria.setText("Categoría");

        Presentacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Presentacion.setForeground(new java.awt.Color(0, 102, 255));
        Presentacion.setText("Presentación");
        Presentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentacionActionPerformed(evt);
            }
        });

        Marca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Marca.setForeground(new java.awt.Color(0, 102, 255));
        Marca.setText("Marca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(CodProducto)
                                        .addComponent(jLabel2)
                                        .addComponent(NomProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ComboDosificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(CantProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addComponent(FechaVencimiento)
                                        .addComponent(jLabel6)
                                        .addComponent(PrecioProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addComponent(ComboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(ComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ActualizarProducto))
                                .addComponent(EnmarcarProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Presentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Marca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarProducto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ActualizarProducto)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboDosificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Marca)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(EnmarcarProducto)
                        .addGap(30, 30, 30)
                        .addComponent(Categoria)
                        .addGap(26, 26, 26)
                        .addComponent(Presentacion)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PresentacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarProducto;
    private javax.swing.JTextField CantProducto;
    private javax.swing.JButton Categoria;
    private javax.swing.JTextField CodProducto;
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JComboBox<String> ComboDosificacion;
    private javax.swing.JComboBox<String> ComboMarca;
    private javax.swing.JTextArea DescripProducto;
    private javax.swing.JButton EnmarcarProducto;
    private javax.swing.JFormattedTextField FechaVencimiento;
    private javax.swing.JButton GuardarProducto;
    private javax.swing.JButton Marca;
    private javax.swing.JTextField NomProducto;
    private javax.swing.JTextField PrecioProducto;
    private javax.swing.JButton Presentacion;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}