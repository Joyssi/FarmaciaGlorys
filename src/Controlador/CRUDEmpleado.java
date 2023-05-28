/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOEmpleado;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDEmpleado {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel mostrarDatos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"Código de Empleado", "Nombres", "Apellidos", 
            "Dirección", "Teléfono", "Correo Electrónico", "Edad"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarEmpleado}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDEmpleado");
                registro[1] = rs.getString("NombresE");
                registro[2] = rs.getString("ApellidosE");
                registro[3] = rs.getString("DirecEmpleado");
                registro[4] = rs.getString("Telempledao");
                registro[5] = rs.getString("CorreoE");
                registro[6] = rs.getString("Edad");

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

        String[] titulos = {"Código de Empleado", "Nombres", "Apellidos", 
            "Dirección", "Teléfono", "Correo Electrónico", "Edad"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarEmpleado(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDEmpleado");
                registro[1] = rs.getString("NombresE");
                registro[2] = rs.getString("ApellidosE");
                registro[3] = rs.getString("DirecEmpleado");
                registro[4] = rs.getString("Telempledao");
                registro[5] = rs.getString("CorreoE");
                registro[6] = rs.getString("Edad");

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
            CallableStatement call = cn.prepareCall("{call ConsultarEmpleado(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOEmpleado cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarEmpleado(?,?,?,?,?,?)}");
            cbst.setString(1, cl.getNombresE());
            cbst.setString(2, cl.getApellidosE());
            cbst.setString(3, cl.getDirecEmpleado());
            cbst.setString(4, cl.getTelEmpledao());
            cbst.setString(5, cl.getCorreoE());
            cbst.setString(6, cl.getEdad());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void actualizar(POJOEmpleado cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarEmpleado(?,?,?,?,?,?,?)}");
            cbst.setInt(1, cl.getIDEmpleado());
            cbst.setString(2, cl.getNombresE());
            cbst.setString(3, cl.getApellidosE());
            cbst.setString(4, cl.getDirecEmpleado());
            cbst.setString(5, cl.getTelEmpledao());
            cbst.setString(6, cl.getCorreoE());
            cbst.setString(7, cl.getEdad());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminar(String cedula) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarEmpleado(?)}");
            cbst.setString(1, cedula);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
