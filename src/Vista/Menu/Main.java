/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Menu;


import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author Joy Cruz
 */
public class Main extends javax.swing.JFrame implements Runnable{
String hora, minutos, segundos;
Thread hilo;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(Main.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Inventario Farmacia Glorys");
        this.setLayout(null);
        
        Fecha.setText(fechaActual());
        
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        Panel.setBounds(0, 0, ancho, (alto));
    }
    
    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    
    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
         calendario.setTime(horaactual);
         hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
         minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
         segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public void run() {
        Thread current = Thread.currentThread();
        
        while(current==hilo) {
            hora();
            Hora.setText(hora+":"+minutos+":"+segundos);
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

        Panel = new javax.swing.JPanel();
        menu1 = new Diseño.Menu();
        jLabel1 = new javax.swing.JLabel();
        Inicio = new Diseño.MenuItem();
        Catálogos = new Diseño.MenuItem();
        Reportes = new Diseño.MenuItem();
        mainForm1 = new Diseño.MainForm();
        mainForm = new Diseño.MainForm();
        panelGradient1 = new Diseño.PanelGradient();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setForeground(new java.awt.Color(0, 0, 255));
        menu1.setMainForm(mainForm1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N
        menu1.add(jLabel1);

        Inicio.setBackground(new java.awt.Color(102, 0, 204));
        Inicio.setForeground(new java.awt.Color(153, 102, 255));
        Inicio.setText("menuItem5");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        menu1.add(Inicio);

        Catálogos.setBackground(new java.awt.Color(255, 0, 153));
        Catálogos.setForeground(new java.awt.Color(255, 102, 102));
        Catálogos.setText("menuItem2");
        Catálogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatálogosActionPerformed(evt);
            }
        });
        menu1.add(Catálogos);

        Reportes.setBackground(new java.awt.Color(0, 102, 102));
        Reportes.setForeground(new java.awt.Color(0, 204, 204));
        Reportes.setText("menuItem1");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });
        menu1.add(Reportes);

        mainForm1.setBackground(new java.awt.Color(255, 255, 255));
        mainForm1.setForeground(new java.awt.Color(102, 153, 255));

        mainForm.setBackground(new java.awt.Color(255, 255, 255));

        panelGradient1.setBackground(new java.awt.Color(51, 51, 255));
        panelGradient1.setColorGradient(new java.awt.Color(153, 0, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo-fotor-20230623204242.png"))); // NOI18N
        panelGradient1.add(jLabel2);
        jLabel2.setBounds(20, 30, 100, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 2, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡Bienvenido a Farmacia Glorys!");
        panelGradient1.add(jLabel3);
        jLabel3.setBounds(290, 10, 660, 80);

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sentimos contigo....");
        panelGradient1.add(jLabel4);
        jLabel4.setBounds(290, 80, 240, 30);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("VIVIMOS PARA TU SALUD");
        panelGradient1.add(jLabel5);
        jLabel5.setBounds(320, 110, 150, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha:");
        panelGradient1.add(jLabel6);
        jLabel6.setBounds(10, 150, 60, 21);

        Fecha.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setText("DD/MM/YYYY");
        panelGradient1.add(Fecha);
        Fecha.setBounds(70, 150, 90, 20);

        Hora.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setText("00:00:00");
        panelGradient1.add(Hora);
        Hora.setBounds(987, 150, 60, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hora:");
        panelGradient1.add(jLabel9);
        jLabel9.setBounds(940, 150, 50, 21);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addComponent(mainForm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addComponent(panelGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
         InicioMenu menu = new InicioMenu();
         
         mainForm1.removeAll();
         mainForm1.add(menu, BorderLayout.CENTER);
         mainForm1.revalidate();
         mainForm1.repaint();
    }//GEN-LAST:event_InicioActionPerformed

    private void CatálogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatálogosActionPerformed
         Menup menu = new Menup();
         
         mainForm1.removeAll();
         mainForm1.add(menu, BorderLayout.CENTER);
         mainForm1.revalidate();
         mainForm1.repaint();  
    }//GEN-LAST:event_CatálogosActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        MenuReportes report = new MenuReportes();
         
         mainForm1.removeAll();
         mainForm1.add(report, BorderLayout.CENTER);
         mainForm1.revalidate();
         mainForm1.repaint();  
    }//GEN-LAST:event_ReportesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatIntelliJLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Diseño.MenuItem Catálogos;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private Diseño.MenuItem Inicio;
    private javax.swing.JPanel Panel;
    private Diseño.MenuItem Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    public static Diseño.MainForm mainForm;
    private Diseño.MainForm mainForm1;
    private Diseño.Menu menu1;
    private Diseño.PanelGradient panelGradient1;
    // End of variables declaration//GEN-END:variables
}
