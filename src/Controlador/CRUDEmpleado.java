/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOEmpleado;
import java.sql.*;
import java.util.ArrayList;
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
        String[] titulos = {"Cedula", "Nombres", "Apellidos", 
            "Dirección", "Teléfono", "Correo", "Edad"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarEmpleado}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombres");
                registro[2] = rs.getString("Apellidos");
                registro[3] = rs.getString("Direccion");
                registro[4] = rs.getString("Telefono");
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

        String[] titulos = {"Cedula", "Nombres", "Apellidos", 
            "Dirección", "Teléfono", "Correo", "Edad"};
        String[] registro = new String[7];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarEmpleado(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("Cedula");
                registro[1] = rs.getString("Nombres");
                registro[2] = rs.getString("Apellidos");
                registro[3] = rs.getString("Direccion");
                registro[4] = rs.getString("Telefono");
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
            CallableStatement cbst = cn.prepareCall("{call InsertarEmpleado(?,?,?,?,?,?,?)}");
            cbst.setString(1, cl.getCedula());
            cbst.setString(2, cl.getNombres());
            cbst.setString(3, cl.getApellidos());
            cbst.setString(4, cl.getDireccion());
            cbst.setString(5, cl.getTelefono());
            cbst.setString(6, cl.getCorreoE());
            cbst.setInt(7, cl.getEdad());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void actualizar(POJOEmpleado cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarEmpleado(?,?,?,?,?,?,?)}");
            cbst.setString(1, cl.getCedula());
            cbst.setString(2, cl.getNombres());
            cbst.setString(3, cl.getApellidos());
            cbst.setString(4, cl.getDireccion());
            cbst.setString(5, cl.getTelefono());
            cbst.setString(6, cl.getCorreoE());
            cbst.setInt(7, cl.getEdad());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void eliminar(String Cedula) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarEmpleado(?)}");
            cbst.setString(1, Cedula);
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList mostrarDatosCombo() {

        ArrayList<POJOEmpleado> Empleado = new ArrayList();

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarEmpleado}");
            ResultSet rs = cbstc.executeQuery();
            while (rs.next()) {
                POJOEmpleado gr = new POJOEmpleado();
                gr.setCedula(rs.getString("Cedula"));
                gr.setNombres(rs.getString("Nombres"));
                Empleado.add(gr);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Empleado;
    }
}
