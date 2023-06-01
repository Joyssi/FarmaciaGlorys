/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista.formularios;
import java.awt.event.KeyEvent;
import Controlador.CRUDEmpleado;
import Modelo.POJOEmpleado;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Joy Cruz
 */
public class VistaEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaEmpleado
     */
    
     int datoSeleccionado = -1;
     
    public VistaEmpleado() {
        initComponents();
        mostrar();
        CodigoEmpleado.setEnabled(false);
        Cancelar.setVisible(false);
    }
    
    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDEmpleado emp = new CRUDEmpleado();
            modelo = emp.mostrarDatos();
            TablaEmpleado.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void limpiar(){
        CodigoEmpleado.setText("");
        NombresE.setText("");
        ApellidosE.setText("");
        TelEmpleado.setText("");
        Edad.setText("");
        CorreoE.setText("");
        DirecEmpleado.setText("");
        Cedula.setText("");
    }
    
     public void guardarEmpleado() {

        CRUDEmpleado emp = new CRUDEmpleado();

        POJOEmpleado em = new POJOEmpleado(0,
                Cedula.getText(),
                NombresE.getText(),
                ApellidosE.getText(),
                DirecEmpleado.getText(),
                TelEmpleado.getText(),
                CorreoE.getText(),
                 Integer.parseInt(Edad.getText()));
        emp.Guardar(em);

    }

    public void editarEmpleado() {

        CRUDEmpleado emple = new CRUDEmpleado();

        POJOEmpleado emp = new POJOEmpleado(0,
                Cedula.getText(),
                NombresE.getText(),
                ApellidosE.getText(),
                DirecEmpleado.getText(),
                TelEmpleado.getText(),
                CorreoE.getText(),
                Integer.parseInt(Edad.getText()));
        emple.actualizar(emp);

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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CodigoEmpleado = new javax.swing.JTextField();
        NombresE = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        ApellidosE = new javax.swing.JTextField();
        CorreoE = new javax.swing.JTextField();
        TelEmpleado = new javax.swing.JFormattedTextField();
        DirecEmpleado = new javax.swing.JTextField();
        GuardarEmpleado = new javax.swing.JButton();
        ActualizarEmpleado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Cedula = new javax.swing.JFormattedTextField();
        Cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();
        BuscarEmpleado = new javax.swing.JTextField();
        EliminarEmpleado = new javax.swing.JButton();
        EditarEmpleado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(51, 102, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Código de empleado");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Teléfono");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Dirección");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Edad");

        CodigoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        CodigoEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CodigoEmpleado.setForeground(new java.awt.Color(51, 51, 51));

        NombresE.setBackground(new java.awt.Color(255, 255, 255));
        NombresE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NombresE.setForeground(new java.awt.Color(51, 51, 51));
        NombresE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombresEKeyTyped(evt);
            }
        });

        Edad.setBackground(new java.awt.Color(255, 255, 255));
        Edad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Edad.setForeground(new java.awt.Color(51, 51, 51));

        ApellidosE.setBackground(new java.awt.Color(255, 255, 255));
        ApellidosE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ApellidosE.setForeground(new java.awt.Color(51, 51, 51));
        ApellidosE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosEKeyTyped(evt);
            }
        });

        CorreoE.setBackground(new java.awt.Color(255, 255, 255));
        CorreoE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CorreoE.setForeground(new java.awt.Color(51, 51, 51));

        TelEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        TelEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        try {
            TelEmpleado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        DirecEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        DirecEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DirecEmpleado.setForeground(new java.awt.Color(51, 51, 51));

        GuardarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GuardarEmpleado.setForeground(new java.awt.Color(51, 102, 255));
        GuardarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/disquete.png"))); // NOI18N
        GuardarEmpleado.setText("Guardar");
        GuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEmpleadoActionPerformed(evt);
            }
        });

        ActualizarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ActualizarEmpleado.setForeground(new java.awt.Color(51, 102, 255));
        ActualizarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/boton-actualizar.png"))); // NOI18N
        ActualizarEmpleado.setText("Actualizar");
        ActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarEmpleadoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Cédula");

        Cedula.setBackground(new java.awt.Color(255, 255, 255));
        Cedula.setForeground(new java.awt.Color(51, 51, 51));
        try {
            Cedula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CorreoE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(ApellidosE, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CodigoEmpleado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombresE, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(Cedula, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(TelEmpleado)
                            .addComponent(Edad)))
                    .addComponent(DirecEmpleado))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombresE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(CorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirecEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestión de empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 255))); // NOI18N

        TablaEmpleado.setBackground(new java.awt.Color(204, 204, 255));
        TablaEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TablaEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código de empleado", "Nombres", "Apellidos", "Teléfono", "Edad", "Correo", "Dirección"
            }
        ));
        TablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaEmpleado);

        BuscarEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        BuscarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BuscarEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        BuscarEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarEmpleadoKeyReleased(evt);
            }
        });

        EliminarEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EliminarEmpleado.setForeground(new java.awt.Color(51, 102, 255));
        EliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/borrar.png"))); // NOI18N
        EliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEmpleadoActionPerformed(evt);
            }
        });

        EditarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        EditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEmpleadoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(EditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(BuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EliminarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombresEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombresEKeyTyped
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
    }//GEN-LAST:event_NombresEKeyTyped

    private void ApellidosEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosEKeyTyped
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
    }//GEN-LAST:event_ApellidosEKeyTyped

    private void GuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEmpleadoActionPerformed
           CRUDEmpleado emp = new CRUDEmpleado();
        try {
            if ((Cedula.getText().equals("   -      -     ")
                  || (NombresE.getText().equals(""))
                    || (ApellidosE.getText().equals(""))
                    || (DirecEmpleado.getText().equals(""))
                    || (TelEmpleado.getText().equals("    -    "))
                    || CorreoE.getText().equals(""))
                    ||(Edad.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                guardarEmpleado();
                limpiar();
                mostrar();
                ActualizarEmpleado.setVisible(false);
                Cancelar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }//GEN-LAST:event_GuardarEmpleadoActionPerformed

    private void TablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoMouseClicked
         datoSeleccionado = TablaEmpleado.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TablaEmpleadoMouseClicked

    private void EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEmpleadoActionPerformed
        if (datoSeleccionado >= 0) {
            String Cedula = String.valueOf(TablaEmpleado.getValueAt(datoSeleccionado, 0));
            CRUDEmpleado emp = new CRUDEmpleado();
            if (JOptionPane.showConfirmDialog(rootPane,
                    "Se eliminará el registro, ¿Desea continuar?",
                    "Eliminar Registro",
                    JOptionPane.WARNING_MESSAGE,
                    JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                emp.eliminar(Cedula);
                mostrar();
                JOptionPane.showMessageDialog(null,
                        "Dato eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar un registro de la tabla");
        }
    }//GEN-LAST:event_EliminarEmpleadoActionPerformed

    private void EditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEmpleadoActionPerformed
         int fila = this.TablaEmpleado.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        } else {

            try {
                int cod = Integer.parseInt((String) this.TablaEmpleado.getValueAt(fila, 0).toString());
                String ced = (String) this.TablaEmpleado.getValueAt(fila, 1);
                String nombres = (String) this.TablaEmpleado.getValueAt(fila, 2);
                String apellidos = (String) this.TablaEmpleado.getValueAt(fila, 3);
                String direc = (String) this.TablaEmpleado.getValueAt(fila, 4);
                String telefono = (String) this.TablaEmpleado.getValueAt(fila, 5);
                String correo = (String) this.TablaEmpleado.getValueAt(fila, 6);
                String edad = (String) this.TablaEmpleado.getValueAt(fila, 7);

                CodigoEmpleado.setEnabled(false);
                GuardarEmpleado.setVisible(false);
                ActualizarEmpleado.setVisible(true);
                Cancelar.setVisible(true);

                CodigoEmpleado.setText("" + cod);
                Cedula.setText(ced);
                NombresE.setText(nombres);
                ApellidosE.setText(apellidos);
                DirecEmpleado.setText(direc);
                TelEmpleado.setText(telefono);
                CorreoE.setText(correo);
                Edad.setText(edad);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditarEmpleadoActionPerformed

    private void ActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarEmpleadoActionPerformed
        try {
            if ((Cedula.getText().equals(""))
                    || (NombresE.getText().equals(""))
                    || (ApellidosE.getText().equals(""))
                    || (DirecEmpleado.getText().equals(""))
                    || (TelEmpleado.getText().equals(""))
                    || (CorreoE.getText().equals(""))
                    || (Edad.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                editarEmpleado();
                mostrar();
                limpiar();
                ActualizarEmpleado.setVisible(false);
                GuardarEmpleado.setVisible(true);
                Cancelar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_ActualizarEmpleadoActionPerformed

    private void BuscarEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarEmpleadoKeyReleased
         try {

            DefaultTableModel modelo;
            CRUDEmpleado emp = new CRUDEmpleado();
            modelo = emp.buscarDatos(BuscarEmpleado.getText());
            TablaEmpleado.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarEmpleadoKeyReleased

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        limpiar();
        Cancelar.setVisible(false);
        GuardarEmpleado.setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarEmpleado;
    private javax.swing.JTextField ApellidosE;
    private javax.swing.JTextField BuscarEmpleado;
    private javax.swing.JButton Cancelar;
    private javax.swing.JFormattedTextField Cedula;
    private javax.swing.JTextField CodigoEmpleado;
    private javax.swing.JTextField CorreoE;
    private javax.swing.JTextField DirecEmpleado;
    private javax.swing.JTextField Edad;
    private javax.swing.JButton EditarEmpleado;
    private javax.swing.JButton EliminarEmpleado;
    private javax.swing.JButton GuardarEmpleado;
    private javax.swing.JTextField NombresE;
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JFormattedTextField TelEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    // End of variables declaration//GEN-END:variables
}
