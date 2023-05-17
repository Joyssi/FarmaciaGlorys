/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Controlador;
import Vista.*;
/**
 *
 * @author Joy Cruz
 */
public class MenuVendedor extends javax.swing.JFrame {

    /**
     * Creates new form MenuVendedor
     */
    public MenuVendedor() {
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

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        Productos = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        Clientes = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Farmacia14.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 240, 680);

        jToolBar1.setRollover(true);

        Productos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Productos.setForeground(new java.awt.Color(51, 102, 255));
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/productos.png"))); // NOI18N
        Productos.setText("Registro de productos");
        Productos.setFocusable(false);
        Productos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jToolBar1.add(Productos);

        Ventas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ventas.setForeground(new java.awt.Color(51, 102, 255));
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Ventas.png"))); // NOI18N
        Ventas.setText("Registro de ventas");
        Ventas.setFocusable(false);
        Ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        jToolBar1.add(Ventas);

        Clientes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Clientes.setForeground(new java.awt.Color(51, 102, 255));
        Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clientes.png"))); // NOI18N
        Clientes.setText("Registro de clientes");
        Clientes.setFocusable(false);
        Clientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Clientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Clientes);

        desktopPane.add(jToolBar1);
        jToolBar1.setBounds(240, 0, 870, 130);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        desktopPane.add(jDesktopPane1);
        jDesktopPane1.setBounds(240, 130, 860, 460);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        VistaProducto producto = new VistaProducto();
        jDesktopPane1.add(producto);
        producto.setVisible(true);
    }//GEN-LAST:event_ProductosActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
       VistaVenta venta = new VistaVenta();
       jDesktopPane1.add(venta);
       venta.setVisible(true);
    }//GEN-LAST:event_VentasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Productos;
    private javax.swing.JButton Ventas;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    // End of variables declaration//GEN-END:variables

}