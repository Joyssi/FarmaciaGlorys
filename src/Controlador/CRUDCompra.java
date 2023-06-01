/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.POJOCompra;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joy Cruz
 */
public class CRUDCompra {
    
     private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Código de Compra", "Fecha de Compra", "Código de Proveedor"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarCompra}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDCompra");
                registro[1] = rs.getString("FechaCompra");
                registro[2] = rs.getString("IDProveedor");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
    
      public DefaultTableModel buscarDatos(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Código de Compra", "Fecha de Compra", "Código de Proveedor"};
        String[] registro = new String[3];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarCompra(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDCompra");
                registro[1] = rs.getString("FechaCompra");
                registro[2] = rs.getString("IDProveedor");
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
            CallableStatement call = cn.prepareCall("{call ConsultarCompra(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOCompra cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCompra(?,?)}");
            cbst.setDate(1, (Date) cl.getFechaCompra());
            cbst.setInt(2, cl.getIDProveedor());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      public void eliminar(String dato) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCompra(?)}");
            cbst.setString(1, dato);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void actualizar(POJOCompra cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarCompra(?,?,?)}");
            cbst.setInt(1, cl.getIDCompra());
            cbst.setDate(2, (Date) cl.getFechaCompra());
            cbst.setInt(3, cl.getIDProveedor());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
