/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOCompraProducto {
    
    int IDProducto;
    int IDCompra;
    double PrecioCompra;
    int CantProductosComprados;
    double TotalCompra;

    public POJOCompraProducto(int IDProducto, int IDCompra, double PrecioCompra, int CantProductosComprados, double TotalCompra) {
        this.IDProducto = IDProducto;
        this.IDCompra = IDCompra;
        this.PrecioCompra = PrecioCompra;
        this.CantProductosComprados = CantProductosComprados;
        this.TotalCompra = TotalCompra;
    }

    public POJOCompraProducto(int IDProducto, double PrecioCompra, int CantProductosComprados, double TotalCompra) {
        this.IDProducto = IDProducto;
        this.PrecioCompra = PrecioCompra;
        this.CantProductosComprados = CantProductosComprados;
        this.TotalCompra = TotalCompra;
    }

    
  
    
    public POJOCompraProducto() {
    }
    
    

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public int getCantProductosComprados() {
        return CantProductosComprados;
    }

    public void setCantProductosComprados(int CantProductosComprados) {
        this.CantProductosComprados = CantProductosComprados;
    }

    public double getTotalCompra() {
        return TotalCompra;
    }

    public void setTotalCompra(double TotalCompra) {
        this.TotalCompra = TotalCompra;
    }
    
    
    
}
