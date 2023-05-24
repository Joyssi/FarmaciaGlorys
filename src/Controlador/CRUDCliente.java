/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOCliente;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDCliente {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Código de Cliente", "Nombres", "Apellidos", "Cédula", "Teléfono", "Dirección"};
        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarCliente}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Código de Cliente");
                registro[1] = rs.getString("Nombres");
                registro[2] = rs.getString("Apellidos");
                registro[3] = rs.getString("Cédula");
                registro[4] = rs.getString("Teléfono");
                registro[5] = rs.getString("DirecciÓn");

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

        String[] titulos = {"Código de Cliente", "Nombres", "Apellidos", "Cédula", "Teléfono", "Dirección"};
        String[] registro = new String[6];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarCliente(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Código de Cliente");
                registro[1] = rs.getString("Nombres");
                registro[2] = rs.getString("Apellidos");
                registro[3] = rs.getString("Cédula");
                registro[4] = rs.getString("Teléfono");
                registro[5] = rs.getString("Dirección");

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
            CallableStatement call = cn.prepareCall("{call ConsultarCliente(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOCliente cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCliente(?,?,?,?,?)}");
            cbst.setString(2, cl.getNombresC());
            cbst.setString(3, cl.getApellidosC());
            cbst.setString(4, cl.getCedula());
            cbst.setString(5, cl.getTelCliente());
            cbst.setString(6, cl.getDirecCliente());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void eliminar(String codigo) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarCliente(?)}");
            cbst.setString(1, codigo);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void actualizar(POJOCliente cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ModificarCliente(?,?,?,?,?)}");
            cbst.setString(2, cl.getNombresC());
            cbst.setString(3, cl.getApellidosC());
            cbst.setString(4, cl.getCedula());
            cbst.setString(5, cl.getTelCliente());
            cbst.setString(6, cl.getDirecCliente());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
