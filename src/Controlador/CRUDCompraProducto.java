/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.POJOCompraProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joy Cruz
 */
public class CRUDCompraProducto {
    
      private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();


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

    public void InsertarCompraProducto(POJOCompraProducto cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCompraProducto(?,?,?,?)}");
            cbst.setInt(1,  cl.getIDProducto());
            cbst.setDouble (2, cl.getPrecioCompra());
            cbst.setInt(3, cl.getCantProductosComprados());
            cbst.setDouble(4, cl.getTotalCompra());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
