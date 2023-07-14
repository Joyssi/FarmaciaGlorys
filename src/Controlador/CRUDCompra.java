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
        String[] titulos = {"Código", "Fecha de Compra", "Proveedor",
            "Producto", "Nombre", "Marca", "Presentación", "Precio de Compra", "Cantidad", "Total"};
        String[] registro = new String[10];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarCompra}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDCompra");
                registro[1] = rs.getString("FechaCompra");
                registro[2] = rs.getString("Nombres");
                registro[3] = rs.getString("IDProducto");
                registro[4] = rs.getString("NomProducto");
                registro[5] = rs.getString("NombreMarca");
                registro[6] = rs.getString("FormaDosificacion");
                registro[7] = rs.getString("PrecioCompra");
                registro[8] = rs.getString("CantProductosComprados");
                registro[9] = rs.getString("TotalCompra");

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

        String[] titulos = {"Código", "Fecha de Compra", "Proveedor",
            "Producto", "Nombre", "Marca", "Presentación", "Precio de Compra", "Cantidad", "Total"};
        String[] registro = new String[10];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarCompras(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                 registro[0] = rs.getString("IDCompra");
                registro[1] = rs.getString("FechaCompra");
                registro[2] = rs.getString("Nombres");
                registro[3] = rs.getString("IDProducto");
                registro[4] = rs.getString("NomProducto");
                registro[5] = rs.getString("NombreMarca");
                registro[6] = rs.getString("FormaDosificacion");
                registro[7] = rs.getString("PrecioCompra");
                registro[8] = rs.getString("CantProductosComprados");
                registro[9] = rs.getString("TotalCompra");
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
            CallableStatement call = cn.prepareCall("{call ConsultarCompras(?)}");
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
            cbst.setString(1,  cl.getFechaCompra());
            cbst.setString(2, cl.getCedulaP());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
