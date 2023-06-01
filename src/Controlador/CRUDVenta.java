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
        String[] titulos = {"Código de Venta", "Código de Empleado", "Código de Cliente", "Fecha de Venta", "Dirección"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarVenta}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDVenta");
                registro[1] = rs.getString("IDEmpleado");
                registro[2] = rs.getString("IDCliente");
                registro[3] = rs.getString("FechaVenta");
                registro[4] = rs.getString("DirecPedidoVenta");

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

        String[] titulos = {"Código de Venta", "Código de Empleado", "Código de Cliente", "Fecha de Venta", "Dirección"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarVenta(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDVenta");
                registro[1] = rs.getString("IDEmpleado");
                registro[2] = rs.getString("IDCliente");
                registro[3] = rs.getString("FechaVenta");
                registro[4] = rs.getString("DirecPedidoVenta");
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
            cbst.setInt(1, cl.getIDEmpleado());
            cbst.setInt(2, cl.getIDCliente());
            cbst.setDate(3, (Date) cl.getFechaVenta());
            cbst.setString(4,cl.getDirecPedidoVenta());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      public void eliminar(String dato) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarVenta(?)}");
            cbst.setString(1, dato);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void actualizar(POJOVenta cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarVenta(?,?,?,?,?)}");
            cbst.setInt(1, cl.getIDVenta());
            cbst.setInt(2, cl.getIDEmpleado());
            cbst.setInt(3, cl.getIDCliente());
            cbst.setDate(4, (Date) cl.getFechaVenta());
            cbst.setString(5,cl.getDirecPedidoVenta());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
