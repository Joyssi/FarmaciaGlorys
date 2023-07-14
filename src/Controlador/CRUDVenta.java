/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOVenta;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joy Cruz
 */
public class CRUDVenta {
    
     private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Código", "Empleado", "Cliente", 
            "Fecha de Venta", "Producto", "Nombre", "Marca", "Presentación", "Cantidad",
        "Total", "Dirección"};
        String[] registro = new String[11];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarVenta}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDVenta");
                registro[1] = rs.getString("Nombres");
                registro[2] = rs.getString("CedulaC");
                registro[3] = rs.getString("FechaVenta");
                registro[4] = rs.getString("IDProducto");
                registro[5] = rs.getString("NomProducto");
                registro[6] = rs.getString("NombreMarca");
                registro[7] = rs.getString("FormaDosificacion");
                registro[8] = rs.getString("CantProductosVendidos");
                registro[9] = rs.getString("TotalVenta");
                registro[10] = rs.getString("DirecPedidoVenta");

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

        String[] titulos = {"Código", "Empleado", "Cliente", 
            "Fecha de Venta", "Producto", "Nombre", "Marca", "Presentación", "Cantidad",
        "Total", "Dirección"};
        String[] registro = new String[11];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarVentas(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                 registro[0] = rs.getString("IDVenta");
                registro[1] = rs.getString("Nombres");
                registro[2] = rs.getString("CedulaC");
                registro[3] = rs.getString("FechaVenta");
                registro[4] = rs.getString("IDProducto");
                registro[5] = rs.getString("NomProducto");
                registro[6] = rs.getString("NombreMarca");
                registro[7] = rs.getString("FormaDosificacion");
                registro[8] = rs.getString("CantProductosVendidos");
                registro[9] = rs.getString("TotalVenta");
                registro[10] = rs.getString("DirecPedidoVenta");
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
            CallableStatement call = cn.prepareCall("{call ConsultarVenta(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOVenta cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarVenta(?,?,?,?)}");
            cbst.setString(1, cl.getCedulaE());
            cbst.setString(2, cl.getCedulaC());
            cbst.setString(3, cl.getFechaVenta());
            cbst.setString(4,cl.getDirecPedidoVenta());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   

}


