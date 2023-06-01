/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOProducto;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDProducto {
 
      private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Código de Produco", "Nombre de Producto", "Descripción de Producto", 
          "Cantidad", "Precio", "Fecha de Vencimiento", "Marca", "Categoria", "Presentación"};
        String[] registro = new String[9];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarProducto}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDProducto");
                registro[1] = rs.getString("NomProducto");
                registro[2] = rs.getString("DescripProducto");
                registro[3] = rs.getString("CantProducto");
                registro[4] = rs.getString("PrecioProducto");
                registro[5] = rs.getString("FechaVencimiento");
                registro[6] = rs.getString("IDMarca");
                registro[7] = rs.getString("IDCategoria");
                registro[8] = rs.getString("IDPresentacion");

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

        String[] titulos = {"Código de Produco", "Nombre de Producto", "Descripción de Producto", 
          "Cantidad", "Precio", "Fecha de Vencimiento", "Marca", "Categoria", "Presentación"};
        String[] registro = new String[9];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarProducto(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDProducto");
                registro[1] = rs.getString("NomProducto");
                registro[2] = rs.getString("DescripProducto");
                registro[3] = rs.getString("CantProducto");
                registro[4] = rs.getString("PrecioProducto");
                registro[5] = rs.getString("FechaVencimiento");
                registro[6] = rs.getString("IDMarca");
                registro[7] = rs.getString("IDCategoria");
                registro[8] = rs.getString("IDPresentacion");

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
            CallableStatement call = cn.prepareCall("{call ConsultarProducto(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOProducto cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarProducto(?,?,?,?,?,?,?,?)}");
            cbst.setString(1, cl.getNomProducto());
            cbst.setString(2, cl.getDescripProducto());
            cbst.setDouble(3, cl.getCantProducto());
            cbst.setDouble(4, cl.getPrecioProducto());
            cbst.setDate(5, (Date) cl.getFechaVencimiento());
            cbst.setInt(6, cl.getIDMarca());
            cbst.setInt(7, cl.getIDCategoria());
            cbst.setInt(8, cl.getIDPresentacion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void actualizar(POJOProducto cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarProducto(?,?,?,?,?,?,?,?,?)}");
            cbst.setInt(1,cl.getIDProducto());
            cbst.setString(2, cl.getNomProducto());
            cbst.setString(3, cl.getDescripProducto());
            cbst.setInt(4, cl.getCantProducto());
            cbst.setDouble(5, cl.getPrecioProducto());
            cbst.setDate(6, (Date) cl.getFechaVencimiento());
            cbst.setInt(7, cl.getIDMarca());
            cbst.setInt(8, cl.getIDCategoria());
            cbst.setInt(9, cl.getIDPresentacion());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
