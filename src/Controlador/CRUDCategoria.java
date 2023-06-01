/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.POJOCategoria;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joy Cruz
 */
public class CRUDCategoria {
    
    private final Conexion con = new Conexion();
    private final Connection cn = (Connection) con.conectar();
    
    public DefaultTableModel buscarDatos(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"Código de Categoria", "Nombre de Categoria"};
        String[] registro = new String[2];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall("{call ConsultarCategoria(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("IDCliente");
                registro[1] = rs.getString("NombreCategoria");

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
            CallableStatement call = cn.prepareCall("{call ConsultarCategoria(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public void Guardar(POJOCategoria cl) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarCategoria(?)}");
            cbst.setString(1, cl.getNombreCategoria());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public ArrayList mostrarDatosCombo() {

        ArrayList<POJOCategoria> Categoria = new ArrayList();

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarCategoria}");
            ResultSet rs = cbstc.executeQuery();
            while (rs.next()) {
                POJOCategoria gr = new POJOCategoria();
                gr.setIDCategoria(Integer.parseInt(rs.getString("IDCategoria")));
                gr.setNombreCategoria(rs.getString("NombreCategoria"));
                Categoria.add(gr);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Categoria;
    }
}
