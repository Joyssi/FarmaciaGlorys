/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOPresentacion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDPresentacion {
    
     private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    public DefaultTableModel buscarDatos(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Código de Presentación", "Tamaño", "Forma de Dosificación"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarPresentacion(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDPresentacion");
                registro[1] = rs.getString("TamPresentacion");
                registro[2] = rs.getString("FormaDosificacion");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public boolean verificarDatos(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarPresentacion(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOPresentacion cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarPresentacion(?,?)}");
            cbst.setDouble(1, cl.getTamPresentacion());
            cbst.setString(2, cl.getFormaDosificacion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
         public ArrayList mostrarDatosCombo() {

        ArrayList<POJOPresentacion> Presentacion = new ArrayList();

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarPresentacion}");
            ResultSet rs = cbstc.executeQuery();
            while (rs.next()) {
                POJOPresentacion gr = new POJOPresentacion();
                gr.setIDPresentacion(Integer.parseInt(rs.getString("IDPresentacion")));
                gr.setFormaDosificacion(rs.getString("FormaDosificacion"));
                Presentacion.add(gr);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Presentacion;
    }
}
