/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOPresentacion {
    
    //Atributos
    int IDPresentacion;
    double TamPresentacion;
    String FormaDosificacion;
    
    //Constructor
    public POJOPresentacion(int IDPresentacion, double TamPresentacion, String FormaDosificacion) {
        this.IDPresentacion = IDPresentacion;
        this.TamPresentacion = TamPresentacion;
        this.FormaDosificacion = FormaDosificacion;
    }
    
    //Getter and Setter
    public int getIDPresentacion() {
        return IDPresentacion;
    }

    public void setIDPresentacion(int IDPresentacion) {
        this.IDPresentacion = IDPresentacion;
    }

    public double getTamPresentacion() {
        return TamPresentacion;
    }

    public void setTamPresentacion(double TamPresentacion) {
        this.TamPresentacion = TamPresentacion;
    }

    public String getFormaDosificacion() {
        return FormaDosificacion;
    }

    public void setFormaDosificacion(String FormaDosificacion) {
        this.FormaDosificacion = FormaDosificacion;
    }
    
}
