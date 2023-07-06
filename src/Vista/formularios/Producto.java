/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
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
import Vista.Menu.Main;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joy Cruz
 */
public class Producto extends javax.swing.JPanel {

    /**
     * Creates new form Producto
     */
    public Producto() {
        initComponents();
         llenarCategoria();
        llenarMarca();
        llenarPresentacion();
        mostrar();
        Actualizar.setVisible(false);
        CategoriaDatos.setVisible(false);
        DatosDosificacion.setVisible(false);
    }
    
    public void mostrarCategoria() {
        try {
            DefaultTableModel modelo;
            CRUDCategoria cat = new CRUDCategoria();
            modelo = cat.mostrarDatos();
            ComboCategoria.setModel((ComboBoxModel<POJOCategoria>) modelo);
             
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void mostrarMarca() {
        try {
            DefaultTableModel modelo;
            CRUDMarca marca = new CRUDMarca();
            modelo = marca.mostrarDatos();
            ComboMarca.setModel((ComboBoxModel<POJOMarca>) modelo);
             
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void mostrarPresentacion() {
        try {
            DefaultTableModel modelo;
            CRUDPresentacion pre = new CRUDPresentacion();
            modelo = pre.mostrarDatos();
            ComboDosificacion.setModel((ComboBoxModel<POJOPresentacion>) modelo);
             
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDProducto pro = new CRUDProducto();
            modelo = pro.mostrarDatos();
            GestionProducto.TablaProductos.setModel(modelo);

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
        Nombre.setText("");
        Descripcion.setText("");
        Cantidad.setText("");
        Precio.setText("");
        Vencimiento.setText("");
    }

   

    public void guardarProducto() {

        CRUDProducto cc = new CRUDProducto();

        POJOProducto cl = new POJOProducto(
                Nombre.getText(),
                Descripcion.getText(),
                Integer.parseInt(Cantidad.getText()),
                Double.parseDouble(Precio.getText()),
                Vencimiento.getText(),
                ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).getIDMarca(),
                ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).getIDCategoria(),
                ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).getIDPresentacion());
        cc.Guardar(cl);
    }

    public void editarProducto() {

        CRUDProducto cc = new CRUDProducto();

        POJOProducto cl = new POJOProducto(
                Nombre.getText(),
                Descripcion.getText(),
                Integer.parseInt(Cantidad.getText()),
                Double.parseDouble(Precio.getText()),
                Vencimiento.getText(),
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

        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        Precio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Cantidad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        ComboCategoria = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        ComboDosificacion = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();
        ComboMarca = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        Guardar = new Vista.Menu.BorderPanel();
        jLabel10 = new javax.swing.JLabel();
        Actualizar = new Vista.Menu.BorderPanel();
        jLabel11 = new javax.swing.JLabel();
        Cancelar = new Vista.Menu.BorderPanel();
        jLabel12 = new javax.swing.JLabel();
        Marca = new Vista.Menu.BorderPanel();
        jLabel13 = new javax.swing.JLabel();
        Categoria = new Vista.Menu.BorderPanel();
        jLabel14 = new javax.swing.JLabel();
        Presentacion = new Vista.Menu.BorderPanel();
        jLabel15 = new javax.swing.JLabel();
        CategoriaDatos = new javax.swing.JButton();
        DatosDosificacion = new javax.swing.JButton();
        Vencimiento = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Nombre de Producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Descripción de Producto");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Precio de Producto");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Forma de Dosificación");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Cantidad de Producto");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Fecha de Vencimiento");

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Marca");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("Categoría");

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setBorder(null);
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));

        Descripcion.setBackground(new java.awt.Color(255, 255, 255));
        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Descripcion.setForeground(new java.awt.Color(51, 51, 51));
        Descripcion.setRows(5);
        Descripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255))));
        jScrollPane1.setViewportView(Descripcion);

        jSeparator2.setForeground(new java.awt.Color(51, 102, 255));

        Precio.setBackground(new java.awt.Color(255, 255, 255));
        Precio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Precio.setForeground(new java.awt.Color(51, 51, 51));
        Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Precio.setBorder(null);

        jSeparator3.setForeground(new java.awt.Color(51, 102, 255));

        Cantidad.setBackground(new java.awt.Color(255, 255, 255));
        Cantidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(51, 51, 51));
        Cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad.setBorder(null);

        jSeparator5.setForeground(new java.awt.Color(51, 102, 255));

        jSeparator6.setForeground(new java.awt.Color(51, 102, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setForeground(new java.awt.Color(51, 102, 255));

        ComboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        ComboCategoria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ComboCategoria.setForeground(new java.awt.Color(51, 51, 51));
        ComboCategoria.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(51, 102, 255));

        ComboDosificacion.setBackground(new java.awt.Color(255, 255, 255));
        ComboDosificacion.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ComboDosificacion.setForeground(new java.awt.Color(51, 51, 51));
        ComboDosificacion.setBorder(null);

        jSeparator9.setForeground(new java.awt.Color(51, 102, 255));

        ComboMarca.setBackground(new java.awt.Color(255, 255, 255));
        ComboMarca.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ComboMarca.setForeground(new java.awt.Color(51, 51, 51));
        ComboMarca.setBorder(null);

        jSeparator10.setForeground(new java.awt.Color(51, 102, 255));

        Guardar.setBackground(new java.awt.Color(51, 102, 255));
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Guardar");

        javax.swing.GroupLayout GuardarLayout = new javax.swing.GroupLayout(Guardar);
        Guardar.setLayout(GuardarLayout);
        GuardarLayout.setHorizontalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(31, 31, 31))
        );
        GuardarLayout.setVerticalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Actualizar.setBackground(new java.awt.Color(51, 102, 255));
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Actualizar");

        javax.swing.GroupLayout ActualizarLayout = new javax.swing.GroupLayout(Actualizar);
        Actualizar.setLayout(ActualizarLayout);
        ActualizarLayout.setHorizontalGroup(
            ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActualizarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ActualizarLayout.setVerticalGroup(
            ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Cancelar.setBackground(new java.awt.Color(51, 102, 255));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cancelar");

        javax.swing.GroupLayout CancelarLayout = new javax.swing.GroupLayout(Cancelar);
        Cancelar.setLayout(CancelarLayout);
        CancelarLayout.setHorizontalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelarLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(29, 29, 29))
        );
        CancelarLayout.setVerticalGroup(
            CancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        Marca.setBackground(new java.awt.Color(51, 102, 255));
        Marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarcaMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Marca");

        javax.swing.GroupLayout MarcaLayout = new javax.swing.GroupLayout(Marca);
        Marca.setLayout(MarcaLayout);
        MarcaLayout.setHorizontalGroup(
            MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarcaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        MarcaLayout.setVerticalGroup(
            MarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Categoria.setBackground(new java.awt.Color(51, 102, 255));
        Categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriaMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Categoría");

        javax.swing.GroupLayout CategoriaLayout = new javax.swing.GroupLayout(Categoria);
        Categoria.setLayout(CategoriaLayout);
        CategoriaLayout.setHorizontalGroup(
            CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategoriaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        CategoriaLayout.setVerticalGroup(
            CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        Presentacion.setBackground(new java.awt.Color(51, 102, 255));
        Presentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresentacionMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Presentación");

        javax.swing.GroupLayout PresentacionLayout = new javax.swing.GroupLayout(Presentacion);
        Presentacion.setLayout(PresentacionLayout);
        PresentacionLayout.setHorizontalGroup(
            PresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PresentacionLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(14, 14, 14))
        );
        PresentacionLayout.setVerticalGroup(
            PresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CategoriaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaDatosActionPerformed(evt);
            }
        });

        DatosDosificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosDosificacionActionPerformed(evt);
            }
        });

        Vencimiento.setBackground(new java.awt.Color(255, 255, 255));
        Vencimiento.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Vencimiento.setForeground(new java.awt.Color(51, 51, 51));
        Vencimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Vencimiento.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator5)
                        .addComponent(Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Precio, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jSeparator8)
                            .addComponent(ComboCategoria, 0, 330, Short.MAX_VALUE)
                            .addComponent(jSeparator7)
                            .addComponent(jLabel5)
                            .addComponent(ComboDosificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator9)
                            .addComponent(jLabel8)
                            .addComponent(ComboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator10)
                            .addComponent(Vencimiento))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CategoriaDatos)
                                    .addComponent(DatosDosificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CategoriaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ComboDosificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DatosDosificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Presentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
        try {
            if ((Nombre.getText().equals(""))
                || (Descripcion.getText().equals(""))
                || (Cantidad.getText().equals(""))
                || (Precio.getText().equals(""))
                || (Vencimiento.getText().equals("    /  /  "))
                || (ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).equals(""))
                || (ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).equals(""))
                || (ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                guardarProducto();
                limpiar();
                mostrar();
                Actualizar.setVisible(false);
                GestionProducto pro = new GestionProducto();
        Main.mainForm.removeAll();
        Main.mainForm.add(pro, BorderLayout.CENTER);
        Main.mainForm.revalidate();
        Main.mainForm.repaint();
                JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
                
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseClicked
         try {
            if ((Nombre.getText().equals(""))
                || (Descripcion.getText().equals(""))
                || (Cantidad.getText().equals(""))
                || (Precio.getText().equals(""))
                || (Vencimiento.getText().equals(""))
                || (ComboMarca.getItemAt(ComboMarca.getSelectedIndex()).equals(""))
                || (ComboCategoria.getItemAt(ComboCategoria.getSelectedIndex()).equals(""))
                || (ComboDosificacion.getItemAt(ComboDosificacion.getSelectedIndex()).equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                editarProducto();
                mostrar();
                limpiar();
                Guardar.setVisible(false);
                Actualizar.setVisible(true);
                GestionProducto pro = new GestionProducto();
        Main.mainForm.removeAll();
        Main.mainForm.add(pro, BorderLayout.CENTER);
        Main.mainForm.revalidate();
        Main.mainForm.repaint();
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
               

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_ActualizarMouseClicked

    private void MarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcaMouseClicked
        Marca marca = new Marca();
        Main.mainForm.removeAll();
        Main.mainForm.add(marca, BorderLayout.CENTER);
        Main.mainForm.revalidate();
        Main.mainForm.repaint();
    }//GEN-LAST:event_MarcaMouseClicked

    private void CategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriaMouseClicked
        Categoria cate = new Categoria();
        Main.mainForm.removeAll();
        Main.mainForm.add(cate, BorderLayout.CENTER);
        Main.mainForm.revalidate();
        Main.mainForm.repaint();
    }//GEN-LAST:event_CategoriaMouseClicked

    private void PresentacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresentacionMouseClicked
        Presentacion pre = new Presentacion();
        Main.mainForm.removeAll();
        Main.mainForm.add(pre, BorderLayout.CENTER);
        Main.mainForm.revalidate();
        Main.mainForm.repaint();
    }//GEN-LAST:event_PresentacionMouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        GestionProducto pro = new GestionProducto();
        Main.mainForm.removeAll();
        Main.mainForm.add(pro, BorderLayout.CENTER);
        Main.mainForm.revalidate();
        Main.mainForm.repaint();
    }//GEN-LAST:event_CancelarMouseClicked

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
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
    }//GEN-LAST:event_NombreKeyTyped

    private void CategoriaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaDatosActionPerformed
        mostrarCategoria();
    }//GEN-LAST:event_CategoriaDatosActionPerformed

    private void DatosDosificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosDosificacionActionPerformed
       mostrarPresentacion();
    }//GEN-LAST:event_DatosDosificacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static Vista.Menu.BorderPanel Actualizar;
    public static Vista.Menu.BorderPanel Cancelar;
    public static javax.swing.JTextField Cantidad;
    private Vista.Menu.BorderPanel Categoria;
    private javax.swing.JButton CategoriaDatos;
    public static javax.swing.JComboBox<POJOCategoria> ComboCategoria;
    public static javax.swing.JComboBox<POJOPresentacion> ComboDosificacion;
    public static javax.swing.JComboBox<POJOMarca> ComboMarca;
    private javax.swing.JButton DatosDosificacion;
    public static javax.swing.JTextArea Descripcion;
    public static Vista.Menu.BorderPanel Guardar;
    private Vista.Menu.BorderPanel Marca;
    public static javax.swing.JTextField Nombre;
    public static javax.swing.JTextField Precio;
    private Vista.Menu.BorderPanel Presentacion;
    public static javax.swing.JTextField Vencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
