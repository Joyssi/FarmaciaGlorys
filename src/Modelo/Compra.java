/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Joy Cruz
 */
public class Compra {
    
  //Atributos
    int IDCompra;
    Date FechaCompra;
    int IDProveedor;
    
    //Constructor
  public Compra(int IDCompra, Date FechaCompra, int IDProveedor) {
        this.IDCompra = IDCompra;
        this.FechaCompra = FechaCompra;
        this.IDProveedor = IDProveedor;
    }
   
    
    //Getter and Setter
    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public int getIDProveedor() {
        return IDProveedor;
    }

    public void setIDProveedor(int IDProveedor) {
        this.IDProveedor = IDProveedor;
    }

  
    
}
