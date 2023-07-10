/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOVentaProducto {
    
    int IDProducto;
    int IDVenta;
    int CantProductosVendidos;
    double TotalVenta;

    public POJOVentaProducto() {
    }

    public POJOVentaProducto(int IDProducto, int IDVenta, int CantProductosVendidos, double TotalVenta) {
        this.IDProducto = IDProducto;
        this.IDVenta = IDVenta;
        this.CantProductosVendidos = CantProductosVendidos;
        this.TotalVenta = TotalVenta;
    }

    public POJOVentaProducto(int IDProducto, int CantProductosVendidos, double TotalVenta) {
        this.IDProducto = IDProducto;
        this.CantProductosVendidos = CantProductosVendidos;
        this.TotalVenta = TotalVenta;
    }
    
    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    public int getCantProductosVendidos() {
        return CantProductosVendidos;
    }

    public void setCantProductoVendidos(int CantProductosVendidos) {
        this.CantProductosVendidos = CantProductosVendidos;
    }

    public double getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(double TotalVenta) {
        this.TotalVenta = TotalVenta;
    }
    
    
    
}
