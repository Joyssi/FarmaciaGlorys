/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Joy Cruz
 */
public class Conexion { 
    private final String
url="jdbc:sqlserver://localhost:1433;databaseName=FarmaciaGlorys;"
+ "integratedSecurity=true;" + "encrypt=true;trustServerCertificate=true; user=yoi; password=123";
    
Connection cn;
public Connection conectar(){
try {
cn = DriverManager.getConnection(url);
System.out.println("Conexion establecida");
return cn;
} catch (SQLException e) {
System.out.println("Error en la conexión: "+e);
}
return null;
}
}
