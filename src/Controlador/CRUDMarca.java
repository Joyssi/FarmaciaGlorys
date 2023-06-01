/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOMarca;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDMarca {
    
     private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    public DefaultTableModel buscarDatos(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Código de Marca", "Nombre de Marca"};
        String[] registro = new String[2];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarMarca(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDMarca");
                registro[1] = rs.getString("NombreMarca");

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
            CallableStatement call = cn.prepareCall("{call ConsultarMarca(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOMarca cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarMarca(?)}");
            cbst.setString(1, cl.getNombreMarca());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
     public ArrayList mostrarDatosCombo() {

        ArrayList<POJOMarca> Marca = new ArrayList();

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarMarca}");
            ResultSet rs = cbstc.executeQuery();
            while (rs.next()) {
                POJOMarca gr = new POJOMarca();
                gr.setIDMarca(Integer.parseInt(rs.getString("IDMarca")));
                gr.setNombreMarca(rs.getString("NombreMarca"));
                Marca.add(gr);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Marca;
    }
}
