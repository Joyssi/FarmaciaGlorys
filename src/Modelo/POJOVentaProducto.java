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

    public POJOVentaProducto() {
    }

    public POJOVentaProducto(int IDProducto, int IDVenta, int CantProductosVendidos) {
        this.IDProducto = IDProducto;
        this.IDVenta = IDVenta;
        this.CantProductosVendidos = CantProductosVendidos;
    }

    public POJOVentaProducto(int IDProducto, int CantProductosVendidos) {
        this.IDProducto = IDProducto;
        this.CantProductosVendidos = CantProductosVendidos;
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
    
    
}
