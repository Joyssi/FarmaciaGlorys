package Modelo;

import java.util.Date;

/**
 *
 * @author Joy Cruz
 */
public class POJOVenta extends POJOVentaProducto{
    
    //Atributos
    int IDVenta;
    String CedulaE;
    String CedulaC;
    String FechaVenta;
    String DirecPedidoVenta;
    
    //Constructor

    public POJOVenta(String CedulaE, String CedulaC, String FechaVenta, String DirecPedidoVenta) {
        this.CedulaE = CedulaE;
        this.CedulaC = CedulaC;
        this.FechaVenta = FechaVenta;
        this.DirecPedidoVenta = DirecPedidoVenta;
    }
    
    //Contructor de herencia
    public POJOVenta(String CedulaE, String CedulaC, String FechaVenta, String DirecPedidoVenta, 
            int IDProducto, int CantProductosVendidos) {
        super(IDProducto, CantProductosVendidos);  
       this.IDVenta = IDVenta;
        this.CedulaE = CedulaE;
        this.CedulaC = CedulaC;
        this.FechaVenta = FechaVenta;
        this.DirecPedidoVenta = DirecPedidoVenta;
    }

    public POJOVenta(int IDVenta, String CedulaE, String CedulaC, String FechaVenta, String DirecPedidoVenta) {
        this.IDVenta = IDVenta;
        this.CedulaE = CedulaE;
        this.CedulaC = CedulaC;
        this.FechaVenta = FechaVenta;
        this.DirecPedidoVenta = DirecPedidoVenta;
    }

    public POJOVenta() {
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    public String getCedulaE() {
        return CedulaE;
    }

    public void setCedulaE(String CedulaE) {
        this.CedulaE = CedulaE;
    }

    public String getCedulaC() {
        return CedulaC;
    }

    public void setCedulaC(String CedulaC) {
        this.CedulaC = CedulaC;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getDirecPedidoVenta() {
        return DirecPedidoVenta;
    }

    public void setDirecPedidoVenta(String DirecPedidoVenta) {
        this.DirecPedidoVenta = DirecPedidoVenta;
    }

    
}
