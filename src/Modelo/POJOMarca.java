/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOMarca {
    
    //Atributos
    int IDMarca;
    String NombreMarca;
    
    //Constructor
    public POJOMarca(int IDMarca, String NombreMarca) {
        this.IDMarca = IDMarca;
        this.NombreMarca = NombreMarca;
    }
    
    //Getter and Setter
    public int getIDMarca() {
        return IDMarca;
    }

    public void setIDMarca(int IDMarca) {
        this.IDMarca = IDMarca;
    }

    public String getNombreMarca() {
        return NombreMarca;
    }

    public void setNombreMarca(String NombreMarca) {
        this.NombreMarca = NombreMarca;
    }
    
}
