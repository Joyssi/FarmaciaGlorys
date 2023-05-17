/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOProveedor {
    
    //Atributos
    int IDProveedor;
    String NombresP;
    String ApellidosP;
    String DirecProveedor;
    String TelProveedor;
   
    //Constructor
    public POJOProveedor(int IDProveedor, String NombresP, String ApellidosP, String DirecProveedor, String TelProveedor) {
        this.IDProveedor = IDProveedor;
        this.NombresP = NombresP;
        this.ApellidosP = ApellidosP;
        this.DirecProveedor = DirecProveedor;
        this.TelProveedor = TelProveedor;
    }
    

    //Getter and Setter

    public int getIDProveedor() {
        return IDProveedor;
    }

    public void setIDProveedor(int IDProveedor) {
        this.IDProveedor = IDProveedor;
    }

    public String getNombresP() {
        return NombresP;
    }

    public void setNombresP(String NombresP) {
        this.NombresP = NombresP;
    }

    public String getApellidosP() {
        return ApellidosP;
    }

    public void setApellidosP(String ApellidosP) {
        this.ApellidosP = ApellidosP;
    }

    public String getDirecProveedor() {
        return DirecProveedor;
    }

    public void setDirecProveedor(String DirecProveedor) {
        this.DirecProveedor = DirecProveedor;
    }

    public String getTelProveedor() {
        return TelProveedor;
    }

    public void setTelProveedor(String TelProveedor) {
        this.TelProveedor = TelProveedor;
    }

  
  
   
    
}
