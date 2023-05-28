/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.POJOCompra;
import Modelo.POJOProveedor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDProveedor {
    
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Código de Proveedor", "Nombres", "Apellidos", "Telefono", "Dirección"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarProveedor}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDProveedor");
                registro[1] = rs.getString("NombresP");
                registro[2] = rs.getString("ApellidosP");
                registro[3] = rs.getString("TelProveedor");
                registro[4] = rs.getString("DirecProveedor");

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

        String[] titulos = {"Código de Proveedor", "Nombres", "Apellidos","Telefono", "Dirección"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarProveedor(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDProveedor");
                registro[1] = rs.getString("NombresP");
                registro[2] = rs.getString("ApellidosP");
                registro[3] = rs.getString("telProveedor");
                registro[4] = rs.getString("DirecProveedor");

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
            CallableStatement call = cn.prepareCall("{call ConsultarProveedor(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOProveedor cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarProveedor(?,?,?,?)}");
            cbst.setString(1, cl.getNombresP());
            cbst.setString(2, cl.getApellidosP());
            cbst.setString(3, cl.getTelProveedor());
            cbst.setString(4, cl.getDirecProveedor());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminar(String codigo) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarProveedor(?)}");
            cbst.setString(1, codigo);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      public void actualizar(POJOProveedor cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarProveedor(?,?,?,?,?)}");
            cbst.setInt(1, cl.getIDProveedor());
            cbst.setString(2, cl.getNombresP());
            cbst.setString(3, cl.getApellidosP());
            cbst.setString(4, cl.getTelProveedor());
            cbst.setString(5, cl.getDirecProveedor());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
