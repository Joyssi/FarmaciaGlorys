/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.formularios;

import Controlador.CRUDVenta;
import Controlador.Conexion;
import Vista.Menu.Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Joy Cruz
 */
public class GestiónVenta extends javax.swing.JPanel {

    /**
     * Creates new form GestiónVenta
     */
     int datoSeleccionado = -1;
    
    public GestiónVenta() {
        initComponents();
        mostrar();
        
        TablaVenta.getTableHeader().setFont(new Font("Seoge UI Emoji", Font.PLAIN, 14));
        TablaVenta.getTableHeader().setOpaque(false);
        TablaVenta.getTableHeader().setBackground(new Color(51,102,255));
        TablaVenta.getTableHeader().setForeground(new Color(255,255,255));
        TablaVenta.setRowHeight(25);
    }
    
     public void mostrar() {
        try {
            DefaultTableModel modelo;
            CRUDVenta venta = new CRUDVenta();
            modelo = venta.mostrarDatos();
            TablaVenta.setModel(modelo);
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVenta = new javax.swing.JTable();
        Nuevo = new Vista.Menu.BorderPanel();
        jLabel5 = new javax.swing.JLabel();
        Reporte = new Vista.Menu.BorderPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Gestión de Ventas");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/busqueda.png"))); // NOI18N

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Buscar.setBorder(null);
        Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarFocusLost(evt);
            }
        });
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));

        TablaVenta.setBackground(new java.awt.Color(255, 255, 255));
        TablaVenta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        TablaVenta.setForeground(new java.awt.Color(51, 51, 51));
        TablaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaVenta.setGridColor(new java.awt.Color(255, 255, 255));
        TablaVenta.setRowHeight(25);
        TablaVenta.setSelectionBackground(new java.awt.Color(102, 153, 255));
        TablaVenta.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaVenta.getTableHeader().setReorderingAllowed(false);
        TablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaVenta);

        Nuevo.setBackground(new java.awt.Color(51, 102, 255));
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nuevo");

        javax.swing.GroupLayout NuevoLayout = new javax.swing.GroupLayout(Nuevo);
        Nuevo.setLayout(NuevoLayout);
        NuevoLayout.setHorizontalGroup(
            NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(31, 31, 31))
        );
        NuevoLayout.setVerticalGroup(
            NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        Reporte.setBackground(new java.awt.Color(51, 102, 255));
        Reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reporte");

        javax.swing.GroupLayout ReporteLayout = new javax.swing.GroupLayout(Reporte);
        Reporte.setLayout(ReporteLayout);
        ReporteLayout.setHorizontalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReporteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        ReporteLayout.setVerticalGroup(
            ReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseClicked
     Venta venta = new Venta();
     venta.setSize(560, 970);
     venta.setLocation(0,0);
     
     Main.mainForm.removeAll();
     Main.mainForm.add(venta, BorderLayout.CENTER);
     Main.mainForm.revalidate();
     Main.mainForm.repaint();
     
    }//GEN-LAST:event_NuevoMouseClicked

    private void TablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaVentaMouseClicked
        datoSeleccionado = TablaVenta.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_TablaVentaMouseClicked

    private void BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarFocusLost
       Buscar.setText("Buscar por Cédula de Empleado o Cliente");
        Buscar.setForeground(Color.gray);
    }//GEN-LAST:event_BuscarFocusLost

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
         Buscar.setText("");
    }//GEN-LAST:event_BuscarMouseClicked

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
        try {

            DefaultTableModel modelo;
            CRUDVenta prod = new CRUDVenta();
            modelo = prod.buscarDatos(Buscar.getText());
            TablaVenta.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BuscarKeyReleased

    private void ReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteMouseClicked
           Conexion con = new Conexion();
        java.sql.Connection cn = (java.sql.Connection) con.conectar();
 
        String path = "C:\\Users\\Joy Cruz\\Downloads\\FarmaciaGlorys\\src\\Vista.Reportes\\ReporteVenta.jrxml";
        JasperReport jr;
        try {
            jr = JasperCompileManager.compileReport(path);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(jr, null, cn);
            JasperViewer.viewReport(mostrarReporte, false);

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ReporteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private Vista.Menu.BorderPanel Nuevo;
    private Vista.Menu.BorderPanel Reporte;
    public static javax.swing.JTable TablaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
