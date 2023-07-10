/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOCompraProducto;
import Modelo.POJOVentaProducto;
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
public class CRUDVentaProducto {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

     public boolean verificarDatos(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarVentaProducto(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void InsertarVentaProducto(POJOVentaProducto cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarVentaProducto(?,?,?)}");
            cbst.setInt(1,  cl.getIDProducto());
            cbst.setInt (2,  cl.getCantProductosVendidos());
            cbst.setDouble (3,  cl.getTotalVenta());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

}
