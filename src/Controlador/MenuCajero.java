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
public class MenuCajero extends javax.swing.JFrame {

    /**
     * Creates new form MenuCajero
     */
    public MenuCajero() {
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
        Compras = new javax.swing.JButton();
        Proveedores = new javax.swing.JButton();
        ListadodeProductos = new javax.swing.JButton();
        InformeVentas = new javax.swing.JButton();
        InformeCompras = new javax.swing.JButton();
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

        Compras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Compras.setForeground(new java.awt.Color(51, 102, 255));
        Compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Compras.png"))); // NOI18N
        Compras.setText("Registro de compras");
        Compras.setFocusable(false);
        Compras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Compras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasActionPerformed(evt);
            }
        });
        jToolBar1.add(Compras);

        Proveedores.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Proveedores.setForeground(new java.awt.Color(51, 102, 255));
        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Proveedores.png"))); // NOI18N
        Proveedores.setText("Registro de proveedores");
        Proveedores.setToolTipText("");
        Proveedores.setFocusable(false);
        Proveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Proveedores);

        ListadodeProductos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ListadodeProductos.setForeground(new java.awt.Color(51, 102, 255));
        ListadodeProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Listado de productos1.png"))); // NOI18N
        ListadodeProductos.setText("Listado de productos");
        ListadodeProductos.setToolTipText("");
        ListadodeProductos.setFocusable(false);
        ListadodeProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ListadodeProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(ListadodeProductos);

        InformeVentas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InformeVentas.setForeground(new java.awt.Color(51, 102, 255));
        InformeVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Informe de compras1.png"))); // NOI18N
        InformeVentas.setText("Informe de ventas");
        InformeVentas.setFocusable(false);
        InformeVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InformeVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(InformeVentas);

        InformeCompras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InformeCompras.setForeground(new java.awt.Color(51, 102, 255));
        InformeCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Informe de ventas1.png"))); // NOI18N
        InformeCompras.setText("Informe de compras");
        InformeCompras.setFocusable(false);
        InformeCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        InformeCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(InformeCompras);

        desktopPane.add(jToolBar1);
        jToolBar1.setBounds(240, 0, 860, 130);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        desktopPane.add(jDesktopPane1);
        jDesktopPane1.setBounds(240, 130, 690, 420);

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
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasActionPerformed
     
    }//GEN-LAST:event_ComprasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compras;
    private javax.swing.JButton InformeCompras;
    private javax.swing.JButton InformeVentas;
    private javax.swing.JButton ListadodeProductos;
    private javax.swing.JButton Proveedores;
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