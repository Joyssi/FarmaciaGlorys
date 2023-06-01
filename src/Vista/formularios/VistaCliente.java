/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.formularios;
import java.awt.event.KeyEvent;
import Controlador.CRUDCliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.POJOCliente;
import java.awt.Color;
import java.awt.HeadlessException;

/**
 *
 * @author Joy Cruz
 */
public class VistaCliente extends javax.swing.JInternalFrame {

      int datoSeleccionado = -1;
  
    public VistaCliente() {
        initComponents();
         mostrar();
         Cod.setEnabled(false);
         Cancelar.setVisible(false);
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDCliente cli = new CRUDCliente();
            modelo = cli.mostrarDatos();
            TablaCliente.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void limpiar() {
        Direccion.setText("");
        NombresC.setText("");
        ApellidosC.setText("");
        Cedula.setText("");
        Correo.setText("");
        TelCliente.setText("");
    }
     
      public void guardarCliente() {

        CRUDCliente cc = new CRUDCliente();

        POJOCliente cl = new POJOCliente(0,
                Cedula.getText(),
                NombresC.getText(),
                ApellidosC.getText(),
                Direccion.getText(),
                TelCliente.getText(),
                 Correo.getText());
        cc.Guardar(cl);

    }
      
        public void editarCliente() {

        CRUDCliente cc = new CRUDCliente();

        POJOCliente cl = new POJOCliente (0,
                Cedula.getText(),
                NombresC.getText(),
                ApellidosC.getText(),
                Direccion.getText(),
                TelCliente.getText(),
        Correo.getText());
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

        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ApellidosC = new javax.swing.JTextField();
        NombresC = new javax.swing.JTextField();
        Cedula = new javax.swing.JFormattedTextField();
        TelCliente = new javax.swing.JFormattedTextField();
        Correo = new javax.swing.JTextField();
        GuardarCliente = new javax.swing.JButton();
        AcualizarCliente = new javax.swing.JButton();
        Direccion = new javax.swing.JTextField();
        Cod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BuscarCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        EliminarCliente = new javax.swing.JButton();
        EditarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));

        jButton3.setText("jButton3");

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(51, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Cédula");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Apellidos");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Nombres");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Teléfono");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Correo");

        ApellidosC.setBackground(new java.awt.Color(255, 255, 255));
        ApellidosC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ApellidosC.setForeground(new java.awt.Color(51, 51, 51));
        ApellidosC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosCKeyTyped(evt);
            }
        });

        NombresC.setBackground(new java.awt.Color(255, 255, 255));
        NombresC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NombresC.setForeground(new java.awt.Color(51, 51, 51));
        NombresC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombresCKeyTyped(evt);
            }
        });

        Cedula.setBackground(new java.awt.Color(255, 255, 255));
        Cedula.setForeground(new java.awt.Color(51, 51, 51));
        try {
            Cedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TelCliente.setBackground(new java.awt.Color(255, 255, 255));
        TelCliente.setForeground(new java.awt.Color(51, 51, 51));
        try {
            TelCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Correo.setBackground(new java.awt.Color(255, 255, 255));
        Correo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Correo.setForeground(new java.awt.Color(51, 51, 51));
        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoKeyTyped(evt);
            }
        });

        GuardarCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GuardarCliente.setForeground(new java.awt.Color(0, 102, 255));
        GuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/disquete.png"))); // NOI18N
        GuardarCliente.setText("Guardar");
        GuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarClienteActionPerformed(evt);
            }
        });

        AcualizarCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AcualizarCliente.setForeground(new java.awt.Color(0, 102, 255));
        AcualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/boton-actualizar.png"))); // NOI18N
        AcualizarCliente.setText("Actualizar");
        AcualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcualizarClienteActionPerformed(evt);
            }
        });

        Direccion.setBackground(new java.awt.Color(255, 255, 255));
        Direccion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Direccion.setForeground(new java.awt.Color(51, 51, 51));

        Cod.setBackground(new java.awt.Color(255, 255, 255));
        Cod.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cod.setForeground(new java.awt.Color(51, 51, 51));
        Cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Código");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(TelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NombresC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ApellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Direccion)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuardarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcualizarCliente))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombresC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AcualizarCliente)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 255))); // NOI18N

        BuscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        BuscarCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BuscarCliente.setForeground(new java.awt.Color(51, 51, 51));
        BuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClienteKeyReleased(evt);
            }
        });

        TablaCliente.setBackground(new java.awt.Color(204, 204, 255));
        TablaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TablaCliente.setForeground(new java.awt.Color(51, 51, 51));
        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código de cliente", "Cedula", "Nombres", "Apellidos", "Dirección", "Teléfono", "Correo"
            }
        ));
        TablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCliente);

        EliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/borrar.png"))); // NOI18N
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });

        EditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClienteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarCliente))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(EditarCliente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombresCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombresCKeyTyped
       char car = evt.getKeyChar();
        if ((car< 'a' || car> 'z')&& (car < 'A' || car> 'z')
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
    }//GEN-LAST:event_NombresCKeyTyped

    private void ApellidosCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosCKeyTyped
        char car = evt.getKeyChar();
        if ((car< 'a' || car> 'z')&& (car < 'A' || car> 'z')
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
    }//GEN-LAST:event_ApellidosCKeyTyped

    private void GuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarClienteActionPerformed
          CRUDCliente cl = new CRUDCliente();
        try {
            if ((Cedula.getText().equals("   -      -     "))
                    || (NombresC.getText().equals(""))
                    || (ApellidosC.getText().equals(""))
                    || (Direccion.getText().equals(""))
                    || (TelCliente.getText().equals("    -    "))
                    || (Correo.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                if (cl.verificarDatos(Cedula.getText())) {
                    JOptionPane.showMessageDialog(null, "Ya existe Cliente con esa Cédula");
                } else {
                    guardarCliente();
                    limpiar();
                    mostrar();
                    AcualizarCliente.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                }

            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_GuardarClienteActionPerformed

    private void CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoKeyTyped

    private void TablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClienteMouseClicked
        datoSeleccionado = TablaCliente.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TablaClienteMouseClicked

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        if (datoSeleccionado >= 0) {
            String Cedula = String.valueOf(TablaCliente.getValueAt(datoSeleccionado, 0));
            CRUDCliente cli = new CRUDCliente();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿Desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                cli.eliminar(Cedula);
                mostrar();
                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }    
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_EliminarClienteActionPerformed

    private void EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClienteActionPerformed
         int fila=this.TablaCliente.getSelectedRow();
       if(fila==-1){
           JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
       }
       else{
           
           try{
               int cod=Integer.parseInt((String)this.TablaCliente.getValueAt(fila, 0).toString());
               String ced=(String)this.TablaCliente.getValueAt(fila, 1);
               String nombres=(String)this.TablaCliente.getValueAt(fila, 2);
               String apellidos=(String)this.TablaCliente.getValueAt(fila, 3);
               String direc=(String)this.TablaCliente.getValueAt(fila, 4);
               String telefono=(String)this.TablaCliente.getValueAt(fila, 5);
               String correo=(String)this.TablaCliente.getValueAt(fila, 6);
               
       Cedula.setEnabled(false);
       Cod.setEnabled(false);
       GuardarCliente.setVisible(false);
       AcualizarCliente.setVisible(true);
       Cancelar.setVisible(true);
  
        Cedula.setText(""+ced);       
        NombresC.setText(nombres);
        ApellidosC.setText(apellidos);
        Direccion.setText(direc);
        TelCliente.setText(telefono);
        Correo.setText(correo);
           }catch(NumberFormatException e){
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditarClienteActionPerformed

    private void AcualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcualizarClienteActionPerformed
        try {
            if ((Cedula.getText().equals("   -      -     "))
                    ||(NombresC.getText().equals(""))
                    || (ApellidosC.getText().equals(""))
                    || (Direccion.getText().equals(""))
                    || (TelCliente.getText().equals("    -    "))
                    || (Correo.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                editarCliente();
                mostrar();
                limpiar();
                AcualizarCliente.setVisible(false);
                GuardarCliente.setVisible(true);
                Cedula.setEnabled(true);
                Cancelar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
                

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_AcualizarClienteActionPerformed

    private void BuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarClienteKeyReleased
        try {

            DefaultTableModel modelo;
            CRUDCliente cli = new CRUDCliente();
            modelo = cli.buscarDatos(BuscarCliente.getText());
            TablaCliente.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarClienteKeyReleased

    private void CodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_CodKeyTyped

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiar();
        
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcualizarCliente;
    private javax.swing.JTextField ApellidosC;
    private javax.swing.JTextField BuscarCliente;
    private javax.swing.JButton Cancelar;
    private javax.swing.JFormattedTextField Cedula;
    private javax.swing.JTextField Cod;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Direccion;
    private javax.swing.JButton EditarCliente;
    private javax.swing.JButton EliminarCliente;
    private javax.swing.JButton GuardarCliente;
    private javax.swing.JTextField NombresC;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JFormattedTextField TelCliente;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
