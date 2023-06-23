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
    int CantProductoVendidos;

    public POJOVentaProducto() {
    }

    public POJOVentaProducto(int IDProducto, int IDVenta, int CantProductoVendidos) {
        this.IDProducto = IDProducto;
        this.IDVenta = IDVenta;
        this.CantProductoVendidos = CantProductoVendidos;
    }

    public POJOVentaProducto(int IDProducto, int CantProductoVendidos) {
        this.IDProducto = IDProducto;
        this.CantProductoVendidos = CantProductoVendidos;
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

    public int getCantProductoVendidos() {
        return CantProductoVendidos;
    }

    public void setCantProductoVendidos(int CantProductoVendidos) {
        this.CantProductoVendidos = CantProductoVendidos;
    }
    
    
}
