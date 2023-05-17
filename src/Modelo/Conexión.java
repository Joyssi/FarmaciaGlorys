/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joy Cruz
 */
public class Conexión {
    
    public static Connection conectar() {
        String conexionUR1 = "jdbc:sqlserver://localhost:1433;"
                + "database=FarmaciaGlorys;";
        try {
            Connection cn = DriverManager.getConnection(conexionUR1);
            return cn;
        }catch (SQLException e){
            System.out.println("Error en la conexión" +e);
            return null;
        }
    }
}
