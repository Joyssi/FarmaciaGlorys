/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOPersona {
    
    String Cedula;
    String Nombres;
    String Apellidos;
    String Direccion;
    String Telefono;
    
    //Constructor para mostrar ese dato en el ComboBox

    public POJOPersona() {
    }

    //Constructor vacío

    public POJOPersona(String Cedula, String Nombres) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
    }
    
    
    //Constructor con parámetros
    public POJOPersona(String Cedula, String Nombres, String Apellidos, String Direccion, String Telefono) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    //Getter and Setter
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
